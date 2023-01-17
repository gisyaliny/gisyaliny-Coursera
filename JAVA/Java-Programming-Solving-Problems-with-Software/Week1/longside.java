import edu.duke.*;

public class longside {


    public double getLongSide(Shape s)
    {
    double longside = 0;
    edu.duke.Point pervPt = s.getLastPoint();
    for(edu.duke.Point currPt: s.getPoints()){
        double currDist = pervPt.distance(currPt);
        if(currDist > longside){
            longside = currDist;
        }
        pervPt = currPt;
    }
        return longside;
    }
    public void testPerimeter(){
        FileResource fr = new FileResource();
        Shape s = new Shape(fr);
        double length = getLongSide(s);
        System.out.println("Longest Side = " + length);
    }

    public static void main(String[] args) {
        longside pr = new longside();
        pr.testPerimeter();
    }


}
