public class Square extends Shape
{
    double side;

    public Square(Point p, double s)
    {
        super(p);
        side= s;
    }

    public double CalculateArea()
    {
        return Math.pow(side,2);
    }
    public String Drawable()
    {
        return "Square is drawing!";
    }
}
