public class Triangle {
    //triangles have 3 points so...
    private Point PointA;
    private Point PointB;
    private Point PointC;
    //without spring we would have to initialize these in the main or here
    //if we do it here then the triangle would only have a single set of fixed points


    public void draw() {
        System.out.println("Point A: (" + getPointA().getX() + ", " + getPointA().getY() + ")");
        System.out.println("Point B: (" + getPointB().getX() + ", " + getPointB().getY() + ")");
        System.out.println("Point C: (" + getPointC().getX() + ", " + getPointC().getY() + ")");
    }

    public Point getPointA() {
        return PointA;
    }

    public void setPointA(Point pointA) {
        PointA = pointA;
    }

    public Point getPointB() {
        return PointB;
    }

    public void setPointB(Point pointB) {
        PointB = pointB;
    }

    public Point getPointC() {
        return PointC;
    }

    public void setPointC(Point pointC) {
        PointC = pointC;
    }
}
