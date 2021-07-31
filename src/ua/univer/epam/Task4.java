package ua.univer.epam;

public class Task4 {
    public static int SumGeometricElements(int a1, double t, int alim) {
        if (alim == 0|| t == 0 || a1 == 0) { throw new IllegalArgumentException("values can not be 0");}

        int result = 0;


        while (a1 > alim) {

            result += a1;
            a1 *= t;


        }
        return result;
    }


}


