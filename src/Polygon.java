import java.util.ArrayList;

public class Polygon extends Shape {



    private ArrayList<Point> points;

    public Polygon(ArrayList<Point> points) {
        super();
        this.points = points;


    }

    @Override
    public String toString() {
        return "Polygon{" +
                "points=" + points +
                '}';
    }
    public String toSvg(){
        String begining = "<svg height=\"220\" width=\"500\" xmlns=\"http://www.w3.org/2000/svg\">\n" +
                "  <polygon points=\"";

        String middle= "";
        for(Point p : points){
            middle += p.getX()+","+p.getY()+" ";
        }

        String ending = "\" " +
                gangam.toSvg() +
                "\" />\n" +
                "</svg>";
        return begining + middle + ending;
    }


    public Polygon(ArrayList<Point> points, Style gangam) {
        super(gangam);
        this.points = points;

    }
//    public static Polygon createSquare(Segment s, Style style){
//        ArrayList<Point> points = new ArrayList<>();
//        points.add(s.getStart());
//        points.add(s.getEnd());
//        Segment perpendicularSegment = s.findPerpendicular();
//        points.add(perpendicularSegment.getStart());
//        points.add(perpendicularSegment.getEnd());
//        return new Polygon(,style);


    }

