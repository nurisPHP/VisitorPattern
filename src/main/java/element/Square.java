
package element;

import visitor.ShapeVisitor;

public class Square implements Shape {
    private final double side;

    public Square(double side) {
        if (side <= 0) {
            throw new IllegalArgumentException(
                    "Side must be positive"
            );
        }
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visit(this);
    }
}
