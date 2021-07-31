package ua.univer.epam;

public class Task3 {




    public static int MultArithmeticElements(int a1, int t, int n){
        if (n <= 0) { throw new IllegalArgumentException("N can not be 0");
        }


        int result=a1;
        for (int i = 1; i < n; i++) {
           a1 += t;
           result *= a1;




        }
        return result  ;
    }

}
