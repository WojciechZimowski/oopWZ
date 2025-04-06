import java.util.ArrayList;

public class SolidFilledPolygon extends Polygon {

    private String color;
    //DO DOMU STROKE I STROKE WIDTH
    private String strokeColor;
    private String strokeWidth;
    //DO DOMU STROKE I STROKE WIDTH

    public SolidFilledPolygon(ArrayList<Point> points, String color,String strokeColor,String strokeWidth) {//konstruktor
        super(points);
        this.color = color;
        this.strokeColor = strokeColor;//storkeColor
        this.strokeWidth = strokeWidth;//strokeWidth
    }
    public String toSvg(String param){
        return super.toSvg( " style=\"fill:" +
                color +
                ";stroke:" +
                strokeColor +
                ";stroke-width:" +
                strokeWidth+
                "\"");

//        "<polygon points=\"%s\" %s />"
//        W klasie SolidFilledPolygon zdefiniuj metodę toSvg, która nadpisze metodę klasy nadrzędnej. Wewnątrz tej metody wywołaj metodę toSvg klasy nadrzędnej, przekazując jej jako parametr napis powstały ze sformatowania:
//        "fill=\"%s\" %s "
    }

}
