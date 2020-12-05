package numbers;

import java.util.Arrays;
import java.util.stream.Collectors;

public class AlgorithmExamples {

    public static long[] getAllPrimeNumbers(long[] arrayOfLongs){
        return Arrays.stream(arrayOfLongs).filter(NumberExamples::isPrime).toArray();
    }



}
