import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class home_3{
    // Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
    static Integer[] getArrayMultiMax(int number, int multiNumber) {
        ArrayList<Integer> myArray = new ArrayList<>();
        for (int i = number; i <= Short.MAX_VALUE ; i++) {
            if (i % multiNumber == 0) {
                myArray.add(i);
            }
        }
        Integer[] array = new Integer[myArray.size()];
        myArray.toArray(array);
        return array;
    }
}