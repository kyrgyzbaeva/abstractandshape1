public class Square extends Rectangle{
    public Square(String name, double sideLength)
    {
        super(name, sideLength, sideLength);
    }


    public String toString(){
        return name + "\nArea: " + getArea() +
                "  \nPerimeter: " + getPerimeter();
    }
}