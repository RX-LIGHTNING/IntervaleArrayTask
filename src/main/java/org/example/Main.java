package org.example;

import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collector;
import java.util.stream.IntStream;

public class Main {

    /**
     * Дан массив целых чисел. Нужно вернуть массив, в котором первым элементом
     * будет количество положительных чисел, а во втором - сумма отрицательных
     * 0 не является ни положительным ни отрицательным
     * Если на вход прилетает пустой массив или null, то вернуть пустой массив
     */
    private static final int[] EMPTY_ARRAY = {};

    public int[] streams(int[] input) {
        return Optional.ofNullable(input).map(arr -> {
            if (Arrays.equals(EMPTY_ARRAY,arr)){
                return EMPTY_ARRAY;
            }
           return IntStream.of(arr)
                    .boxed()
                    .collect(Collector.of(() -> new int[2], (ints, i) -> {
                                ints[0] += i > 0 ? 1 : 0;
                                ints[1] += Math.min(i, 0);
                            }, (resultArray, incomeArray) -> {
                                resultArray[0] += incomeArray[0];
                                resultArray[1] += incomeArray[1];
                                return resultArray;
                            }
                    ));
                }
        ).orElse(EMPTY_ARRAY);
    }

    public int[] loops(int[] input) {
        int[] result = new int[2];
        if (input == null || input.length == 0)
            return EMPTY_ARRAY;
        for (int i : input) {
            if (i > 0) {
                result[0]++;
            } else {
                result[1] += i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
    }
}