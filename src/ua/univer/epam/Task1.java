package ua.univer.epam;

import javax.swing.*;

public class Task1 {
    public static boolean isSorted(int[] array, SortOrder order) {
        if (array == null || array.length == 0 || order == null) {
            throw new IllegalArgumentException("Parameters can not be null!");

        }

        if (order == SortOrder.ASC) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    return false;
                }
            }


        }
        if (order == SortOrder.DESC) {
            for (int i = 0; i < array.length-1; i++) {
                if (array[i] < array[i + 1]) {
                    return false;

                }

            }

        }


return true;
        }
        }




