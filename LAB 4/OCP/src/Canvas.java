import java.util.ArrayList;

public class Canvas
{
    ArrayList<Shape> shapes= new ArrayList<>();

    public Canvas() {}

    public void addToList(Shape shape)
    {
        shapes.add(shape);
    }

    public void DrawAll()
    {
        for(Shape shape : shapes)
        {
            shape.Drawable();
        }
    }
}
