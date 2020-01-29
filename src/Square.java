public class Square extends Shape {
    private int width;
    private int height;

    public Square(String name) {
        super(name);
        this.width = 0;
        this.height = 0;
    }

    public void setDimensions(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void printDimensions(){
        System.out.println("Height: " + this.height);
        System.out.println("Width: " + this.width);
        System.out.println("Area: " + this.getArea());
    }

    @Override
    public double getArea(){
        this.setArea(this.width*this.width);
        return super.getArea();
    }
}
