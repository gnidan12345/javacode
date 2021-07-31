package ua.univer.epam;

public class Task2 {
    public static int[] transform(int[] array, SortOrder order) {
        if (Task1.isSorted(array, order)) {
            for (int i = 0; i < array.length; i++) {
                int temp = array[i] + i;
                array[i] = temp;

            }
        }
        return array;
    }
}


