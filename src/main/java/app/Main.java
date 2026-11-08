
package app;

import element.Circle;
import element.Shape;
import element.Square;
import element.Triangle;
import visitor.AreaCalculatorVisitor;
import visitor.ExportVisitor;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Shape> shapes = List.of(
                new Circle(5),
                new Square(4),
                new Triangle(6, 3)
        );

        AreaCalculatorVisitor areaVisitor =
                new AreaCalculatorVisitor();

        System.out.println("=== AREA CALCULATION ===");

        for (Shape shape : shapes) {
            shape.accept(areaVisitor);
        }

        System.out.printf(
                "Total area: %.2f%n",
                areaVisitor.getTotalArea()
        );

        ExportVisitor exportVisitor = new ExportVisitor();

        System.out.println("\n=== SHAPE EXPORT ===");

        for (Shape shape : shapes) {
            shape.accept(exportVisitor);
        }
    }
}
