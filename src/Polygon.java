import java.util.ArrayList;

public class Polygon {

    private Style gangam;

    private ArrayList<Point> points;

    public Polygon(ArrayList<Point> points) {
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

    public Style getGangam() {
        return gangam;
    }

    public void setGangam(Style gangam) {
        this.gangam = gangam;
    }

    public Polygon(ArrayList<Point> points, Style gangam) {
        this.points = points;
        this.gangam = gangam;
    }
}
