package visitor;

import java.util.Arrays;
import java.util.List;

/**
 * Computer class implements {@code ComputerPart} interface. It contains other parts of a computer.
 */
public class Computer implements ComputerPart {

    List<ComputerPart> parts;

    public Computer() {
        parts = Arrays.asList(new Mouse(), new Keyboard(), new Monitor());
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (ComputerPart part : parts) {
            part.accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
