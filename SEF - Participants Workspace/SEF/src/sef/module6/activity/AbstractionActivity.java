package activity;

public class AbstractionActivity {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        //Print out area and perimeters
        System.out.println("Result of area: " + r.calculateArea(5,6));
        System.out.println("Result of perimeter: " + r.calculatePerimeter(5,6));
        //Set up and print out color
        r.setColor("red");
        System.out.println("Color is " + r.getColor());
    }
}
