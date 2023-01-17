import edu.duke.*;

public class PerimeterRunner {
    public double getPrimeter(Shape s)
    {
    double totalPerim = 0;
    edu.duke.Point pervPt = s.getLastPoint();
    for(edu.duke.Point currPt: s.getPoints()){
        double currDist = pervPt.distance(currPt);
        totalPerim = totalPerim + currDist;
        pervPt = currPt;
    }
        return totalPerim;
    }
    public void testPerimeter(){
        FileResource fr = new FileResource();
        Shape s = new Shape(fr);
        double length = getPrimeter(s);
        System.out.println("Perimeter = " + length);
    }

    public static void main(String[] args) {
        PerimeterRunner pr = new PerimeterRunner();
        pr.testPerimeter();
    }
}
