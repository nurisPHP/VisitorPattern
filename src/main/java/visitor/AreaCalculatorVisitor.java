
package visitor;

import element.Circle;
import element.Square;
import element.Triangle;

public class AreaCalculatorVisitor implements ShapeVisitor {
    private double totalArea = 0;

    @Override
    public void visit(Circle circle) {
        double area = Math.PI * Math.pow(circle.getRadius(), 2);
        totalArea += area;
        System.out.printf("Circle area: %.2f%n", area);
    }

    @Override
    public void visit(Square square) {
        double area = square.getSide() * square.getSide();
        totalArea += area;
        System.out.printf("Square area: %.2f%n", area);
    }

    @Override
    public void visit(Triangle triangle) {
        double area = 0.5 * triangle.getBase()
                * triangle.getHeight();
        totalArea += area;
        System.out.printf("Triangle area: %.2f%n", area);
    }

    public double getTotalArea() {
        return totalArea;
    }
}
