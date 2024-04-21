import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame implements ActionListener {
    Container cont;

    public Main() {
        JButton button = new JButton("Button");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 400, 400);
        cont = getContentPane();
        cont.setLayout(null);
        button.setBounds(30,30,30,30);
        button.addActionListener(this);
        cont.add(button);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Main::new);
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        cont.setBackground(Color.RED);
    }
}
