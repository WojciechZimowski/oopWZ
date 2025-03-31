import java.util.ArrayList;

public class SolidFilledPolygon extends Polygon {

    private String color;

    public SolidFilledPolygon(ArrayList<Point> points, String color) {//konstruktor
        super(points);
        this.color = color;
    }
    public String toSvg(String param){
        return  null;

//        "<polygon points=\"%s\" %s />"
//        W klasie SolidFilledPolygon zdefiniuj metodę toSvg, która nadpisze metodę klasy nadrzędnej. Wewnątrz tej metody wywołaj metodę toSvg klasy nadrzędnej, przekazując jej jako parametr napis powstały ze sformatowania:
//        "fill=\"%s\" %s "
    }
}
