public class Circle extends Shape{
    private double radius;
    public Circle(String name, double radius){
        super(name);
        this.radius = radius;
    }
    public double getArea(){

        return Math.PI * radius * radius;
    }
    public double getPerimeter(){

        return 2 * Math.PI * radius;
    }
    public String toString(){
        return "Circle" + "\nArea: " + getArea() +
                "  \nPerimeter: " + getPerimeter();
    }
}
