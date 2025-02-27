public class Point {
    public double x, y;
    public String toString(){
        return "("+p.x+", "+p.y+")";
    }
    public String toSVG(){
        return "<circle r=\"45\" cx=\""+p.x+"\" cy=\""+p.y+"\" fill=\"red\" />";
    }
    public void translate(double dx, double dy){
        x += dx;
        y += dy;
    }
    public Point translated(double dx, double dy){
        Point newPoint = new Point();
        newPoint.x = dx;
        newPoint.y = dy;
        return newPoint;
    }
}
