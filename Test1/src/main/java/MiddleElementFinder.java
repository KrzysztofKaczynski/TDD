import java.util.Arrays;

public class MiddleElementFinder {

    public static int find(int[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }
        int[] arrayCopy = Arrays.copyOf(array, array.length);    // kopiujemy, żeby nie zmieniać kolejności w tablicy źródłowej
        Arrays.sort(arrayCopy);
        if (arrayCopy.length % 2 == 1) {
            return arrayCopy[arrayCopy.length / 2];
        } else {
            return arrayCopy[arrayCopy.length / 2 - 1];
        }
    }
}