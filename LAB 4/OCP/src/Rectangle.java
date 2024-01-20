public class Rectangle extends Shape
{
    double length;
    double width;

    public Rectangle(Point p, double a, double b)
    {
        super(p);
        length=a;
        width=b;
    }

    public double CalculateArea()
    {
        return length*width;
    }
    public String Drawable()
    {
        return "Rectangle is drawing!";
    }
}
