package com.buisness.calculation.service.buisnesscalculationservice;

import org.springframework.stereotype.Component;

@Component
public class MySqlService implements DataService{
    @Override
    public int[] retrieveData() {
        return new int[] {7,8,9,4,5,6};
    }

}
