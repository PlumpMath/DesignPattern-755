package mediator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * MediatorFrame
 */
public class MediatorFrame extends JFrame implements ActionListener{

    public MediatorFrame() {
        IMediator mediator = new Mediator();

        JPanel panel = new JPanel();
        panel.add(new BtnView(this, mediator));
        panel.add(new BtnBook(this, mediator));
        panel.add(new BtnSearch(this, mediator));
        getContentPane().add(new LblDisplay(mediator), "North");
        getContentPane().add(panel, "South");
        setSize(400, 200);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Command command = (Command) e.getSource();
        command.execute();
    }
}
