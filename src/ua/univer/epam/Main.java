package ua.univer.epam;

import ua.univer.epam.inheritance.Employee;
import ua.univer.epam.inheritance.Manager;
import ua.univer.epam.inheritance.SalesPerson;
import ua.univer.epam.objects.ArrayRectangles;
import ua.univer.epam.objects.Rectangle;

import java.math.BigDecimal;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//	boolean result = Task1.isSorted(new int[]{1,2,3,4,5}, SortOrder.ASC);{
//	    if  (result == true){
//            System.out.println("Sorting is correct");
//        }
//	    if (result == false){
//            System.out.println("Sorting is not correct");
//        }
//
//	boolean result2 = Task1.isSorted(new int[] {0}, SortOrder.DESC);
//            if (result2 == true) {
//                System.out.println("Sorting is correct");
//            }
//	    if (result2 == false){
//            System.out.println("Sorting is not correct");
//        }
//        }
//        int [] result3 = Task2.transform(new int []{1,2,3}, SortOrder.ASC);
//        System.out.println(Arrays.toString(result3));
//    }


//        int result4 = Task3.MultArithmeticElements(5, 3, 4);
//        {
//            System.out.println(result4);
//
//        }
//
//        int result5 = Task4.SumGeometricElements(0, 0.5, 20);
//        {
//            System.out.println(result5);
//
//        }
//    }
//
//        Rectangle rectangle = new Rectangle(10, 50);
//        Rectangle rectangle1 = new Rectangle();
//        Rectangle rectangle2 = new Rectangle(9);


//        System.out.println(rectangle.getSideA());
//        System.out.println(rectangle2.area());
//        rectangle2.perimeter();
//        boolean result = rectangle.isSquare();
//        System.out.println(result);
//        rectangle.replaceSides();
//
//        System.out.println(rectangle2.getSideA());
//        System.out.println(rectangle2.getSideB());

//        ArrayRectangles pp = new ArrayRectangles();
//
////        ArrayRectangles pp1 = new ArrayRectangles();
//        pp.addRectangle(rectangle1);
//        pp.addRectangle(rectangle);
//        pp.addRectangle(rectangle2);
//        System.out.println(pp.size());
//        System.out.println(pp);

        Employee employee = new Employee("Ivan", new BigDecimal(500));
        employee.setBonus(new BigDecimal(50));
        System.out.println(employee.setBonus(new BigDecimal(50)));
        System.out.println(employee.toPay());

        Employee employee1 = new SalesPerson("Mark", new BigDecimal(1000), 15);
        employee1.setBonus(new BigDecimal(100));
        System.out.println(employee1.setBonus(new BigDecimal(100)));
        System.out.println(employee1.getBonus());

        System.out.println(employee1.toPay());

        Employee employee2 = new Manager("Nil", new BigDecimal(2000), 45 );
        System.out.println(employee2.setBonus(new BigDecimal(100)));
        System.out.println(employee2.toPay());
        ;

//        System.out.println(employee1.ToPay());


//        Employee employee2 = new Manager("Nil", new BigDecimal(2000), 200);
//        employee2.SetBonus()
//        System.out.println(employee2.ToPay());








    }

}

