import java.util.ArrayList;
import java.util.Locale;

public class Polygon implements Shape {





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
//    public String toSvg(){
//        String begining = "  <polygon points=\"";
//
//
//        String middle= "";
//        for(Point p : points){
//            middle += p.getX()+","+p.getY()+" ";
//        }
//
//        String ending = "\" " +
////                gangam.toSvg() +
//                "\" />\n";
//        return begining + middle + ending;
//    }
//starącone na rzecz pliku z kampusa :(


    public Polygon(ArrayList<Point> points, Style gangam) {
        //super(gangam);
        this.points = points;

    }
    public static Polygon createSquare(Segment s, Style style){
        ArrayList<Point> points = new ArrayList<>();
        points.add(s.getStart());
        points.add(s.getEnd());
//        Segment perpendicularSegment = s.findPerpendicular();
//        points.add(perpendicularSegment.getStart());
//        points.add(perpendicularSegment.getEnd());
        return new Polygon(points,style);


    }


    public String toSvg(String param)    {
        String pointsString = "";
        for(Point point : points) {
            pointsString += point.getX() + "," + point.getY() + " ";//czemó
        }
        return String.format(Locale.ENGLISH, "<polygon points=\"%s\" %s/>", pointsString,param);
    }
    public String toSvg()    {
        return toSvg("");
    }
}

