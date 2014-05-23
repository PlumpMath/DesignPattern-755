package mediator;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * View button
 */
public class BtnView extends JButton implements Command {

    IMediator mediator;

    public BtnView(ActionListener actionListener, IMediator mediator) {
        super("View");
        this.mediator = mediator;
        addActionListener(actionListener);
        mediator.registerView(this);
    }

    @Override
    public void execute() {
        mediator.view();
    }
}
