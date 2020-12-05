package numbers;

public class NumberExamples {

    public static boolean isPrime(long number) {
        if(number < 0)
            throw new RuntimeException("The targeted number must be positive.");

        for (long i = number - 1; i > 1; i--) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static long greatestCommonDivisorIterative(long firstNumber, long secondNumber) {
        long thirdNumber = 0;

        while (secondNumber != 0) {
            thirdNumber = secondNumber;
            secondNumber = firstNumber % secondNumber;
            firstNumber = thirdNumber;
        }
        return firstNumber;
    }

    public static long greatestCommonDivisorRecursive(long firstNumber, long secondNumber) {
        if (secondNumber == 0) {
            return firstNumber;
        }
        return greatestCommonDivisorRecursive(secondNumber, firstNumber % secondNumber);

    }

}
