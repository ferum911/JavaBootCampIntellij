package activity;

public class Rectangle extends Shape{
    public double length;
    public double breadth;


    public double getLength(){return length;}
    public double getBreadth(){return breadth;}
    public Rectangle() {
        this.length = 0;
        this.breadth = 0;
    }

    @Override
    public double calculateArea(double length, double breadth) {
        return length*breadth;
    }

    @Override
    public double calculatePerimeter(double length, double breadth) {
        return 2*(length+breadth);
    }


}


//Define double parameter length and breadth +

//Write default and parameterized  +

//Define method calculateArea() 'l x b'  +

//Define method calculatePerimeter()  = 2*(l x b)  +

//Create abstractionActivity.java +

//Write the code to print color, area and perimeter.Cycle with side 5 and rectangle with l = 5, b = 6

//print result

