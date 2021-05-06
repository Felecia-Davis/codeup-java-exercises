package shapes;

public class Square extends Rectangle{// for extend to work needed super.
    private int side;// You need to list variable.  And you need to list it as private because it is a subclass.

    public Square(int side) {
        super(side, side);//super references the parent class.And takes from it.
        this.side = side; // This tells the side that is passed in  that it is equal to side.
    }
        public int getPerimeter(){
            System.out.print("override ");//This is just an indicator to let you differentiate between which one has overwritten rectangle.
            return 4 * side;
        }

        public int getArea(){
            System.out.print("override ");
        return side * side;
        }
    }


