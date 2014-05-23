package mediator;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * Book button
 */
public class BtnBook extends JButton implements Command{

    IMediator mediator;

    public BtnBook(ActionListener actionListener, IMediator mediator) {
        super("Book");
        this.mediator = mediator;
        mediator.registerBook(this);
        addActionListener(actionListener);
    }

    @Override
    public void execute() {
        mediator.book();
    }
}
