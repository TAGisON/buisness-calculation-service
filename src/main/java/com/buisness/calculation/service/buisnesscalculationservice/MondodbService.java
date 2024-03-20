package com.buisness.calculation.service.buisnesscalculationservice;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MondodbService implements DataService{

    @Override
    public int[] retrieveData() {
        return new int[] {1,2,3,4,5};
     }

}
