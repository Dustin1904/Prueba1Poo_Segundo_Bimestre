import org.omg.CORBA.PUBLIC_MEMBER;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form3 extends JFrame{
    private JTextField textField1;
    JPanel saldo;
    private JButton menuButton;
    public static form2 ven;
    public form3(JFrame xd) {
        int cantidad = 1500;
        textField1.setText("Saldo: $"+String.valueOf(cantidad));
        menuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                xd.dispose();
            }
        });
    }
}
