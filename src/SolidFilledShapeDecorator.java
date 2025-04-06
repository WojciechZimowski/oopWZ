public class SolidFilledShapeDecorator extends ShapeDecorator {
    String color;
    String strokeC;
    String strokeW;

    public SolidFilledShapeDecorator(Shape decoratedShape, String color, String strokeC, String strokeW) {
        super(decoratedShape);
        this.color = color;
        this.strokeC = strokeC;
        this.strokeW = strokeW;
    }

    public String toSvg()    {

        return decoratedShape.toSvg( " style=\"fill:" +
                color +
                ";stroke:" +
                strokeC +
                ";stroke-width:" +
                strokeW+
                "\"");
    }

}
