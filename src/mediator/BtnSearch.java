package mediator;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * Search button
 */
public class BtnSearch extends JButton implements Command{

    IMediator mediator;

    public BtnSearch(ActionListener actionListener, IMediator mediator) {
        super("Search");
        addActionListener(actionListener);
        this.mediator = mediator;
        mediator.registerSearch(this);
    }

    @Override
    public void execute() {
        mediator.search();
    }
}
