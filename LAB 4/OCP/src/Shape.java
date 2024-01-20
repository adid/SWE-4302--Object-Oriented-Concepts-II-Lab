public abstract class Shape
{
    int x;
    int y;

    Point point= new Point(x,y);

    public Shape(Point p)
    {
        point= p;
    }

    public abstract double CalculateArea();
    public abstract String Drawable();
}
