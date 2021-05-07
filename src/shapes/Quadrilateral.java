package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {
    protected double width;
    protected double length;

    public  Quadrilateral(double width, double length){
        this.width = width;
        this.length = length;
    }

    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }
    public double setLength(){
        return this.length;
    }
    public double setWidth(){
        return this.width;
    }
}

