package strategy;

import strategy.operations.Strategy;

public class Calculator {

    private Strategy strategy;

    public Calculator(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
