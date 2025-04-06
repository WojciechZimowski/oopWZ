public class SolidFilledShapeDecorator extends ShapeDecorator {
    String color;
    String strokeColor;
    String strokeWidth;

    public SolidFilledShapeDecorator(Shape decoratedShape, String color, String strokeColor, String strokeWidth) {
        super(decoratedShape);
        this.color = color;
        this.strokeColor = strokeColor;
        this.strokeWidth = strokeWidth;
    }

    public String toSvg()    {

        return decoratedShape.toSvg( " style=\"fill:" +
                color +
                ";stroke:" +
                strokeColor +
                ";stroke-width:" +
                strokeWidth+
                "\"");
    }

}
