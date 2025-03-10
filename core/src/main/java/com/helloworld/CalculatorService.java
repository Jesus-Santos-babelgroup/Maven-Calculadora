package com.helloworld;

public class CalculatorService {

    BasicOperationsService operationsService;

    public CalculatorService() {
        operationsService = new BasicOperationsService();
    }

    public void runCalculator() {
        while (true) {
            printMenu();
            String operation = ReadAndWrite.read();

            ReadAndWrite.write(">Enter two numbers: (separated by space)");
            String[] args = ReadAndWrite.read().split(" ");
            if (operation.equals("1")) {
                int result = operationsService.sum(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
                ReadAndWrite.write(">Result: " + result);
            } else if (operation.equals("2")) {
                int result = operationsService.minus(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
                ReadAndWrite.write(">Result: " + result);
            } else if (operation.equals("3")) {
                int result = operationsService.multiplication(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
                ReadAndWrite.write(">Result: " + result);
            } else if (operation.equals("4")) {
                int result = operationsService.division(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
                ReadAndWrite.write(">Result: " + result);
            } else if (operation.equals("5")) {
                ReadAndWrite.write("Bye!");
                return;
            } else {
                ReadAndWrite.write("Error: That operation is not defined.");
                ReadAndWrite.write("Try another number mamawebo.");
            }
        }
    }

    private void printMenu() {
        ReadAndWrite.write(">Select an operation:\n" +
                "> 1. Sum\n" +
                "> 2. Difference\n" +
                "> 3. Multiplication\n" +
                "> 4. Division\n" +
                "> 5. Exit\n" +
                ">Option:");
    }
}
