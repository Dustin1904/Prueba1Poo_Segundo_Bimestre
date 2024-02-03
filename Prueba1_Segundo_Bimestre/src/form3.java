import org.omg.CORBA.PUBLIC_MEMBER;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form3 extends JFrame{
    JPanel saldo;
    private JButton menuButton;
    private JLabel saldoJL;
    public form3(JFrame xd) {
        int cantidad = 1500;
        saldoJL.setText("Saldo: $" + String.valueOf(cantidad));
        menuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                xd.dispose();
                JFrame pantallaAnterior = new JFrame("Transaccion a realizar");
                pantallaAnterior.setContentPane(new form2(pantallaAnterior).Operacion);
                pantallaAnterior.pack();
                pantallaAnterior.setSize(500,500);
                pantallaAnterior.setVisible(true);
            }
        });
    }
}
