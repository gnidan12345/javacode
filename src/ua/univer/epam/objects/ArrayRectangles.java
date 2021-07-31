package ua.univer.epam.objects;

public class ArrayRectangles {

    private Rectangle[] rectangleArray;
    private int n = rectangleArray.length;
    private int i;


    public ArrayRectangles() {
        this.rectangleArray = new Rectangle[n];
        i = 0;
    }

    public ArrayRectangles(Rectangle[] rectangleArray) {
        this.rectangleArray = rectangleArray;
    }

    public void addRectangle(Rectangle rectangle) {
//        if (i == rectangleArray.length) throw new ArrayIndexOutOfBoundsException();
        rectangleArray[i] = rectangle;
        i++;

    }

    public int size(){
        return i;
    }

}


