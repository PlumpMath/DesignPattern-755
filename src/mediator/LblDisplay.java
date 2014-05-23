package mediator;

import javax.swing.*;
import java.awt.*;

/**
 * @author Yang Song
 */
public class LblDisplay extends JLabel {

    IMediator mediator;

    public LblDisplay(IMediator mediator) {
        super("Just start...");
        this.mediator = mediator;
        mediator.registerDisplay(this);
        setFont(new Font("Arial", Font.BOLD, 24));
    }
}
