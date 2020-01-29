public class Circle extends Shape {
    private int radius;

    public Circle(String name) {
        super(name);
        this.radius = 0;
    }

    public void setDimensions(int radius){
        this.radius = radius;
    }

    @Override
    public void printDimensions(){
        System.out.println("Radius: " + this.radius);
        System.out.println("Area: " + this.getArea());
    }

    @Override
    public double getArea(){
        double area = Math.PI * (radius*radius);
        this.setArea(area);
        return super.getArea();
    }
}
