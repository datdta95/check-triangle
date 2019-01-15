import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TriangleTest {

    @Test
    public void testWithOneOfThreeEdgesLessThan0() {
        String expect = "Not Triangle";
        String actual = Application.checkTriangle(-2, 3, 4);
        assertEquals(expect, actual);
    }

    @Test
    public void testWithTotal2EdgesGreaterThanThe3rdEdge() {
        String expect = "Triangle";
        String actual = Application.checkTriangle(5, 7, 4);
        assertEquals(expect, actual);
    }

    @Test
    public void testWithTotal2EdgesLessThanThe3rdEdge() {
        String expect = "Not Triangle";
        String actual = Application.checkTriangle(5, 1, 2);
        assertEquals(expect, actual);
    }

    @Test
    public void testWith3EqualEdges() {
        String expect = "Equilateral Triangle";
        String actual = Application.checkTriangle(8, 8, 8);
        assertEquals(expect, actual);
    }

    @Test
    public void testWithTheTwoSidesAreEqualButNotTheTriangle() {
        String expect = "Not Triangle";
        String actual = Application.checkTriangle(1, 1, 2);
        assertEquals(expect, actual);
    }

    @Test
    public void testWithTheTwoEqualSidesOfTheIsoscelesTriangle() {
        String expect = "Isosceles Triangle";
        String actual = Application.checkTriangle(8, 8, 6);
        assertEquals(expect, actual);
    }

    @Test
    public void testWith3EdgesOfASquareTriangle() {
        String expect = "Square Triangle";
        String actual = Application.checkTriangle(3, 4, 5);
        assertEquals(expect, actual);
    }
}
