import org.junit.Test;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;

public class ShapeTest
{
    Point A= new Point(5,6);
    Circle circle= new Circle(A,6);
    Square square= new Square(A,4);
    Rectangle rectangle= new Rectangle(A, 3,7);

    Canvas canvas= new Canvas();

    @Test
    public void AreaIsRightSquare()
    {
        Assert.assertEquals(16, square.CalculateArea(), 0.0);
    }

    @Test
    public void AreaIsRightCircle()
    {
        Assert.assertEquals(Math.PI*36, circle.CalculateArea(), 0.0);
    }

    @Test
    public void AreaIsRightRectangle()
    {
        Assert.assertEquals(21, rectangle.CalculateArea(), 0.0);
    }

    @Test
    public void DrawingRectangle()
    {
        Assert.assertEquals("Rectangle is drawing!", rectangle.Drawable());
    }

    @Test
    public void DrawingCircle()
    {
        Assert.assertEquals("Circle is drawing!", circle.Drawable());
    }

    @Test
    public void DrawingSquare()
    {
        Assert.assertEquals("Square is drawing!", square.Drawable());
    }
}
