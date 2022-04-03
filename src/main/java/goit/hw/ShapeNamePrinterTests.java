package goit.hw;

public class ShapeNamePrinterTests {
    public static void main(String[] args) {
        ShapeNamePrinter shapeNamePrinter = new ShapeNamePrinter();

        shapeNamePrinter.printShapeName(new Circle());
        shapeNamePrinter.printShapeName(new Decagon());
        shapeNamePrinter.printShapeName(new Quad());
        shapeNamePrinter.printShapeName(new Square());
        shapeNamePrinter.printShapeName(new Triangle());
    }
}
