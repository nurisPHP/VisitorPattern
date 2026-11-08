
package visitor;

import element.Circle;
import element.Square;
import element.Triangle;

public class ExportVisitor implements ShapeVisitor {

    @Override
    public void visit(Circle circle) {
        System.out.println(
                "Circle [radius=" + circle.getRadius() + "]"
        );
    }

    @Override
    public void visit(Square square) {
        System.out.println(
                "Square [side=" + square.getSide() + "]"
        );
    }

    @Override
    public void visit(Triangle triangle) {
        System.out.println(
                "Triangle [base=" + triangle.getBase()
                        + ", height=" + triangle.getHeight() + "]"
        );
    }
}
