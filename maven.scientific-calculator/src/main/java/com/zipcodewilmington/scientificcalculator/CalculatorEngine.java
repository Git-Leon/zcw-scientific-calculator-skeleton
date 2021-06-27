package com.zipcodewilmington.scientificcalculator;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 6/27/21 10:17 AM
 */
public class CalculatorEngine { // calculator engine has a computer and display
    private Computer computer = new Computer(); // perform calculations
    private Display display = new Display(); // displaying result of calculations and retaining state about previous calculations

    public void performAdd() {
        double firstValue = Console.getDoubleInput("Enter your first double value to be added");
        double secondValue = Console.getDoubleInput("Enter your second double value to be added");
        Double sum = computer.add(firstValue, secondValue);
        String newValueToBeSet = sum.toString();
        display.setValue(newValueToBeSet);
    }

    public void display() {
        display.display();
    }
}
