package pro.sky.skyprospringhomework12.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public Number sum(Number num1, Number num2) {
        return num1.doubleValue() + num2.doubleValue();
    }

    public Number minus(Number num1, Number num2) {
        return num1.doubleValue() - num2.doubleValue();
    }

    public Number multiply(Number num1, Number num2) {
        return num1.doubleValue() * num2.doubleValue();
    }

    public Number divide(Number num1, Number num2) {
        return num1.doubleValue() / num2.doubleValue();
    }
}
