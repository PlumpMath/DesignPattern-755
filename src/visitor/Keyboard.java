package visitor;

/**
 * Keybaord class implements {@code ComputerPart} interface
 */
public class Keyboard implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
