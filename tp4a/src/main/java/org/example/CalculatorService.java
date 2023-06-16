package org.example;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Data
@Service
public class CalculatorService {
    private final ConfigurationProperties config;

    //@Autowired
//    public CalculatorService(ConfigurationProperties config) {
//        this.config = config;
//    }

    public double power(double base, double exponente) {
        return Math.pow(base, exponente);
    }

    public double power(double base) {
        return Math.pow(base, config.getExponente());
    }

    public double sqrt(double value, double index) {
        return Math.pow(value, 1.0 / index);
    }

    public double sqrt(double value) {
        return Math.pow(value, 1.0 / config.getRaiz());
    }
}