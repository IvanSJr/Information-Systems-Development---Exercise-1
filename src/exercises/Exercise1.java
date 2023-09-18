package exercises;
import util.InsertNumberInList;
import java.util.*;

public class Exercise1 {

    public static void main(String[] args) {
        List<Integer> numberList = InsertNumberInList.insert();
        System.out.println(calculateMedia(numberList));
    }

    private static Integer calculateMedia(List<Integer> numberList) {
        Integer sumOfNumbers = numberList.stream().mapToInt(Integer::intValue).sum();
        Integer totalOfNumbers = numberList.size();
        return sumOfNumbers / totalOfNumbers;
    }
}