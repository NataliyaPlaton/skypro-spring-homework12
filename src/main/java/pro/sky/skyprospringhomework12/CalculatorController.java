package pro.sky.skyprospringhomework12;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @GetMapping
    public String calculator() {
        return "<b>Добро пожаловать в калькулатор</b>";
    }

}
