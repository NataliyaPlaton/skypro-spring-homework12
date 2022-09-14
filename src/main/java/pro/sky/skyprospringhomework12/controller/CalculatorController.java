package pro.sky.skyprospringhomework12.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.skyprospringhomework12.exception.DivisionByZeroException;
import pro.sky.skyprospringhomework12.service.CalculatorService;

import java.util.Objects;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }


    @GetMapping
    public String welcome() {
        return "Добро пожаловать в калькулатор";
    }

    @GetMapping(path = "/plus")
    public String plus(@RequestParam(value = "num1", required = false) Number num1,
                       @RequestParam(value = "num2", required = false) Number num2) {
        if (Objects.isNull(num1) || Objects.isNull(num2)) {
            return "Передайте оба числа!";
        }
        return buildResult(num1, num2, calculatorService.sum(num1, num2), "+");

    }

    @GetMapping(path = "/minus")
    public String minus(@RequestParam(value = "num1", required = false) Number num1,
                        @RequestParam(value = "num2", required = false) Number num2) {
        if (Objects.isNull(num1) || Objects.isNull(num2)) {
            return "Передайте оба числа!";
        }
        return buildResult(num1, num2, calculatorService.minus(num1, num2), "-");
    }

    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam(value = "num1", required = false) Number num1,
                           @RequestParam(value = "num2", required = false) Number num2) {
        if (Objects.isNull(num1) || Objects.isNull(num2)) {
            return "Передайте оба числа!";
        }
        return buildResult(num1, num2, calculatorService.multiply(num1, num2), "*");
    }

    @GetMapping(path = "/divide")
    public String divide(@RequestParam(value = "num1", required = false) Number num1,
                         @RequestParam(value = "num2", required = false) Number num2) {
        if (Objects.isNull(num1) || Objects.isNull(num2)) {
            return "Передайте оба числа!";
        }

        return buildResult(num1, num2, calculatorService.divide(num1, num2), "/");
    }

    private String buildResult(Number num1, Number num2, Number result, String operation) {
        return String.format("%S %s %S = %s", num1, operation, num2, result.toString());

    }


}
