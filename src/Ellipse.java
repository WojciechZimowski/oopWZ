public class Ellipse extends Shape{

    private Point center;

    private double rx, ry;

    public Ellipse(Style gangam, Point center, double rx, double ry) {
        super(gangam);
        this.center = center;
        this.rx = rx;
        this.ry = ry;
    }

    public Ellipse(Point center, double rx, double ry) {
        this.center = center;
        this.rx = rx;
        this.ry = ry;
    }
    public Ellipse() {}

    @Override
    public String toSvg() {
        return
                "  <ellipse rx=\"" + rx +
                "\" ry=\"" + ry +
                "\" cx=\"" + center.getX() +
                "\" cy=\"" + center.getY() +
                "\"\n" +
                "  " + gangam.toSvg() +
                "\" />\n";
    }
}
