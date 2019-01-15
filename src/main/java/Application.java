import static java.lang.Math.pow;

public class Application {
    public static void main(String[] args) {
    }

    public static String checkTriangle(float edge_1, float edge_2, float edge_3) {

        final String NOT_TRIANGLE = "Not Triangle";
        final String TRIANGLE = "Triangle";
        final String  EQUILATERAL_TRIANGLE="Equilateral Triangle";
        final String ISOSCELES_TRIANGLE = "Isosceles Triangle";
        final String SQUARE_TRIANGLE = "Square Triangle";

        boolean threeEdgesGreaterThan0 = edge_1 > 0 && edge_2 > 0 && edge_3 > 0;
        boolean totalTwoEdgesGreaterThanThe3rdEdge = edge_1 + edge_2 > edge_3 && edge_2 + edge_3 > edge_1 && edge_1 + edge_3 > edge_2;
        boolean twoEqualEdges = edge_1 == edge_2 || edge_1 == edge_3 || edge_2 == edge_3;
        boolean threeEqualEdges = edge_1 == edge_2 && edge_1 == edge_3 && edge_2 == edge_3;
        boolean theTheoremOfPytagoInSquareTriangle = pow(edge_1, 2) + pow(edge_2, 2) == pow(edge_3, 2) || pow(edge_1, 2) + pow(edge_3, 2) == pow(edge_2, 2) || pow(edge_3, 2) + pow(edge_2, 2) == pow(edge_1, 2);

        String isTriangle;

        if (threeEdgesGreaterThan0) {
            if (totalTwoEdgesGreaterThanThe3rdEdge) {
                if (threeEqualEdges) isTriangle = EQUILATERAL_TRIANGLE;
                else if (twoEqualEdges) isTriangle = ISOSCELES_TRIANGLE;
                else if (theTheoremOfPytagoInSquareTriangle) isTriangle = SQUARE_TRIANGLE;
                else isTriangle = TRIANGLE;
            } else isTriangle = NOT_TRIANGLE;
        } else isTriangle = NOT_TRIANGLE;
        return isTriangle;
    }
}
