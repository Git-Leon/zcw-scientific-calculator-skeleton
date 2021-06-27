package com.zipcodewilmington.scientificcalculator;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 6/27/21 11:27 AM
 */
public class Calculator {

    private CalculatorEngine calculatorEngine = new CalculatorEngine();

    public void display() {
        calculatorEngine.display();
    }

    public void run() {
        Console.println("Welcome to my calculator!");
        Console.println("From here you can select any of the following:");
        getInitialInput();
    }

    public void getInitialInput() {
        String initialSelection;
        do {
            initialSelection = Console.getStringInput("basic, scientific, switch-mode, display, quit");
            switch (initialSelection.toLowerCase()) {
                case "basic":
                    doBasicArithmetic();
                    break;

                case "scientific":
                    doScientific();
                    break;

                case "switch-mode":
                    switchMode();
                    break;

                case "display":
                    display();

                case "quit":
                    return;

                default:
                    break;
            }
        } while (true);
    }

    public void doBasicArithmetic() {
        String userInputSelection;
        do {

            userInputSelection = Console.getStringInput("add, subtract, multiply, divide, display, quit");
            switch (userInputSelection.toLowerCase()) {
                case "add":
                    calculatorEngine.performAdd();
                    break;

                case "subtract":
                    //calculator.performSubtract();
                    break;

                case "multiply":
                    // calculcator.performMultiply();
                    break;


                case "divide":
                    // calculator.performDivide();
                    break;

                case "display":
                    calculatorEngine.display();
                    break;

                case "quit":
                    return;

                default:
                    Console.println("[ %s ] is not a valid input!", userInputSelection);
                    break;
            }
        } while (true);
    }

    public void switchMode() {
    }

    public void doScientific() {
    }
}
