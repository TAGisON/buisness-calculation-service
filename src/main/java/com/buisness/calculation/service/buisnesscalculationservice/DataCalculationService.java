package com.buisness.calculation.service.buisnesscalculationservice;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.buisness.calculation.service.buisnesscalculationservice")
public class DataCalculationService {
    DataService dataService;
    DataCalculationService(@Qualifier("mySqlService") DataService dataService){
        super();
        this.dataService = dataService;
    }
    @Bean
    public int findMax(){
        return Arrays.stream(dataService.retrieveData()).max().orElse(0);
    }
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(DataCalculationService.class)) {
            // Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean(DataCalculationService.class).findMax());;
        }
    }
}
