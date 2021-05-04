package shapes;

//Inside of your shapes directory, create a class named Rectangle. It should have protected properties for both length and width. Rectangle should define a constructor that accepts two numbers for length and width, and sets those properties.
//
//        Create two methods on the Rectangle class, getArea and getPerimeter that return the respective values. The formulas for both follow:
//perimeter = 2 x length + 2 x width
//        area = length x width

public class Rectangle {
    protected  int width;
    protected int length;

    public Rectangle(int aWidth, int aLength){
        width = aWidth;
        length = aLength;

    }

    public int getArea(){
        return length * width;
    }

    public int getPerimeter(){
        return  2 * (length + width);

    }
}