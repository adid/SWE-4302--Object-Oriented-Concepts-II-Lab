public class Circle extends Shape
{
    double radius;

    public Circle(Point p, double r)
    {
        super(p);
        radius = r;
    }

    public double CalculateArea()
    {
        return Math.PI*Math.pow(radius,2);
    }
    public String Drawable()
    {
        return "Circle is drawing!";
    }
}
