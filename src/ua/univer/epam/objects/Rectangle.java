package ua.univer.epam.objects;

public class Rectangle {


    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        //TODO: Implement constructor with 'a' and 'b' parameters;
        //TODO: set sideA and sideB to specified values;
        this.sideA = sideA;
        this.sideB = sideB;

    }

    public Rectangle(double sideA) {
        //TODO: Implement constructor with 'a' parameter;
        //TODO: set sideB to default value;
        this.sideA = sideA;
        this.sideB = 5.0;
    }

    public Rectangle() {
        this.sideA = 4;
        this.sideB = 3;
        //TODO: Implement default constructor;
        //TODO: set sideA and sideB to default values;
    }

    //    /**
//     * <summary>
//     * Implement code according to description of task.
//     * </summary>
//     */
//    public double getSideA() {
//        //TODO: Delete line below and write your own solution;


    public double getSideA() {
        return this.sideA;
    }

    //

//    }
//
//    /**
//     * <summary>
//     * Implement code according to description of task.
//     * </summary>
//     */
//    public double getSideB() {
//        //TODO: Delete line below and write your own solution;
//

    public double getSideB() {
        return this.sideB;
    }


    /**
     * <summary>
     * Implement code according to description of task.
     * </summary>
     */
    public double area() {
        //TODO: Delete line below and write your own solution;
        double area = this.sideA * this.sideB;
//        System.out.println("Площа" + area);
        return area;


    }


    /**
     * <summary>
     * Implement code according to description of task.
     * </summary>
     */
    public double perimeter() {
        double perimeter = (this.sideA + this.sideB) * 2;
//        System.out.println(perimeter);
        return perimeter;

    }

    /**
     * <summary>
     * Implement code according to description of task.
     * </summary>
     */
    public boolean isSquare() {
        if (this.sideA == this.sideB) {
            return true;

        } else return false;

    }

    /**
     * <summary>
     * Implement code according to description of task.
     * </summary>
     */
    public void replaceSides() {
        double temp = this.sideA;
        this.sideA = this.sideB;
        this.sideB = temp;
//        System.out.println(this.a + "and" + this.b);
    }

}

