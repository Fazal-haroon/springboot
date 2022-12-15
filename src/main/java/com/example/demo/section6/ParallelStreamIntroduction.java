package com.example.demo.section6;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelStreamIntroduction {
    /*
    parallel stream split the source data into multiple parts
    process them parallel
    combine the result
    parallel stream leverage multicore processors, resulting in a substantial increase in performance
    parallel stream uses the fork/join framework that got introduced in java 7
    */
    /*
    Two ways to create parallel stream
    1. Calling the parallelStream() method on a collection
    2. Calling the parallel() method on a stream
    */
    /*
    How to create a parallel stream
    IntStream.rangeClosed(1, 1000).parallel.sum()
    */
    /*
    How many Threads are created
    Number of threads created == number of processors available in the machine
    */
    public static void main(String[] args) {
        System.out.println("Sum Sequential : " + sumSequentialStream());
        System.out.println("Sum Parallel : " + sumParallelStream());
        System.out.println("---------------");
        int loop = 20;
        long result = measurePerformance(ParallelStreamIntroduction::sumParallelStream, loop);
        System.out.println("Time Taken to process sum in parallel: "+result+" in msecs");
        long result2 = measurePerformance(ParallelStreamIntroduction::sumSequentialStream, loop);
        System.out.println("Time Taken to process sum in sequential: "+result2+" in msecs");
    }

    public static long measurePerformance(Supplier<Integer> supplier, int numberOfTimes) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < numberOfTimes; i++) {
            supplier.get();
        }
        return System.currentTimeMillis() - startTime;
    }

    public static int sumSequentialStream(){
        return IntStream.rangeClosed(0, 5000).sum();
    }

    public static int sumParallelStream(){
        return IntStream.rangeClosed(0, 5000).parallel().sum();
    }
}
