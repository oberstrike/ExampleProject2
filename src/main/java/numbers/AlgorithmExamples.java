package numbers;

import patterns.MeinSingleton;

import java.util.Arrays;
import java.util.stream.Collectors;

public class AlgorithmExamples {

    public static long[] getAllPrimeNumbers(long[] arrayOfLongs){
        MeinSingleton meinSingleton = MeinSingleton.getInstance();
        String configuration = meinSingleton.getConfiguration();


        return Arrays.stream(arrayOfLongs).filter(NumberExamples::isPrime).toArray();
    }



}
