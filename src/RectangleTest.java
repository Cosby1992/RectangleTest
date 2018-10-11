import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {

    Rectangle rectangle1 = new Rectangle(1,1);
    Rectangle rectangle2 = new Rectangle(5,10);
    Rectangle rectangle3 = new Rectangle(10000,0);
    Rectangle rectangle4 = new Rectangle(6,-4);

    @Test
    public void getArea() {
        assertEquals(1,rectangle1.getArea(),0);
        assertEquals(50,rectangle2.getArea(),0);
        assertEquals(0,rectangle3.getArea(),0);
        assertEquals(-24,rectangle4.getArea(),0);
    }

    @Test
    public void getPerimeter() {
        assertEquals(4,rectangle1.getPerimeter(),0);
        assertEquals(30,rectangle2.getPerimeter(),0);
        assertEquals(20000,rectangle3.getPerimeter(),0);
        assertEquals(4,rectangle4.getPerimeter(),0);

    }
}