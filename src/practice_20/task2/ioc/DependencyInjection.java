package practice_20.task2.ioc;

import practice_20.task2.domain.Calculator;
import practice_20.task2.domain.Calculator32;
import practice_20.task2.controller.CalculatorController;
import practice_20.task2.controller.Controller;

public class DependencyInjection {

    public static Controller<String> provideController() {
        return new CalculatorController();
    }

    public static Calculator provideCalculator() {
        return new Calculator32();
    }
}
