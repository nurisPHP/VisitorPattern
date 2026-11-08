
package visitor;

import element.Circle;
import element.Square;
import element.Triangle;

public interface ShapeVisitor {
    void visit(Circle circle);
    void visit(Square square);
    void visit(Triangle triangle);
}
