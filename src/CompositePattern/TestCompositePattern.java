package CompositePattern;

public class TestCompositePattern {

    public static void main(String[] args) {

        Shape triangle = new Triangle();
        Shape anotherTriangle = new Triangle();
        Shape circle = new Circle();

        Drawing drawing = new Drawing();
        drawing.add(triangle);
        drawing.add(anotherTriangle);
        drawing.add(circle);

        drawing.draw("red");

        drawing.clear();

        drawing.add(triangle);
        drawing.add(circle);

        drawing.draw("Green");
    }
}
