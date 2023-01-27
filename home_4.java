import java.util.ArrayList;

public class home_4 {
    // Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
    static Integer[] getArrayMultiMin(int number, int multiNumber) {
        ArrayList<Integer> getArray = new ArrayList<>();
        for (int i = number; i >= Short.MIN_VALUE; i--) {
            if (i % multiNumber != 0) {
                getArray.add(i);
            }
        }
        Integer[] array = new Integer[getArray.size()];
        getArray.toArray(array);
        return array;
    }
}
