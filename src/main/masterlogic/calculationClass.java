package main.masterlogic;

import java.util.List;

public class calculationClass {


    public static Integer sumOfThat(List<Integer> sumItIs) {
        Integer sum = 0;
        for (Integer i : sumItIs) {
            sum += i;

        }
        return sum;

    }

    public static String longestOne(List<String> longestItIs) {
        String longestOne = "";
        int maxGarums = 0;

        for (String a : longestItIs) {
            if (a.length() > maxGarums) {
                maxGarums = a.length();
                longestOne = a;
            }
        }
        return longestOne;
    }


    public static Integer maxVertiba(List<Integer> maxVertiba) {
        int max = Integer.MIN_VALUE;
        for (Integer a : maxVertiba) {
            if (max < a) {
                max = a;
            }

        }

        return max;

    }

    public static void everythingAll(List<Integer> allValues1, List<String> allValues2) {
        for (Integer a : allValues1) {
            System.out.print((a) + " ");
        }

        System.out.println("\n");

        for (String q : allValues2) {
            System.out.print((q) + " ");


        }
    }
}

