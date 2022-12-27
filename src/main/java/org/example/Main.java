package org.example;

import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
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
            if (arr.length != 0) {
                int[] temporaryStorage = new int[2];
                Arrays.stream(arr).forEach(
                        num -> {
                            if (num > 0) {
                                temporaryStorage[0]++;
                            } else {
                                temporaryStorage[1] += num;
                            }

                        });
                return temporaryStorage;
            } else {
                return null;
            }
        }).orElse(EMPTY_ARRAY);
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