import java.lang.Math;

public class Shape {
    private String name;
    private double area;


    public Shape(String name) {
        this.name = name;
        this.area = 0;
    }
    /** returns the name of the shape */
    public String getName() {
        return name;
    }
    /** returns the area of the shape */
    public double getArea() {
        return this.area;
    }

    public void setArea(double a){
        this.area = a;
    }
    public void printDimensions(){
        System.out.println("No Dimensions");
    }

    public void setDimensions(){
    }
}
