package visitor;

/**
 * Computer part interface
 */
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
