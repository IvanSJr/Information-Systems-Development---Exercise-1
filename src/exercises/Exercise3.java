package exercises;

import util.InsertNumberInList;

import java.util.List;

public class Exercise3 {

    public static void main(String[] args) {
        List<Integer> numberList = InsertNumberInList.insert();
        System.out.println(writeTheLargestAndSmallestNumbers(numberList));;
    }

    private static String writeTheLargestAndSmallestNumbers(List<Integer> numberList) {
        return "O maior número é " + findLargestNumber(numberList) + " e o número menor é " + findSmallestNumber(numberList);
    }

    public static int findLargestNumber(List<Integer> numbers) {

        int max = numbers.get(0);
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int findSmallestNumber(List<Integer> numbers) {

        int min = numbers.get(0);
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

}
