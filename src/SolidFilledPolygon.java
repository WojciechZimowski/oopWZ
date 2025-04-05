import java.util.ArrayList;

public class SolidFilledPolygon extends Polygon {

    private String color;
    private String strokeC;
    private String strokeW;

    public SolidFilledPolygon(ArrayList<Point> points, String color,String strokeC,String strokeW) {//konstruktor
        super(points);
        this.color = color;
        this.strokeC = strokeC;
        this.strokeW = strokeW;
    }
    public String toSvg(String param){
        return super.toSvg( " style=\"fill:" +
                color +
                ";stroke:" +
                strokeC +
                ";stroke-width:" +
                strokeW+
                "\"");

//        "<polygon points=\"%s\" %s />"
//        W klasie SolidFilledPolygon zdefiniuj metodę toSvg, która nadpisze metodę klasy nadrzędnej. Wewnątrz tej metody wywołaj metodę toSvg klasy nadrzędnej, przekazując jej jako parametr napis powstały ze sformatowania:
//        "fill=\"%s\" %s "
    }

}
