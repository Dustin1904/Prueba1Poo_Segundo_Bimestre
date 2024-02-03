import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form2{
    private JComboBox comboBox1;
    JPanel Operacion;
    private JButton realizarButton;

    public form2(JFrame xd) {
        realizarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String opcion = String.valueOf(comboBox1.getSelectedItem());
                switch (opcion) {
                    case "Ver Saldo":
                        JFrame frame3 = new JFrame("Saldo");
                        frame3.setContentPane(new form3(frame3).saldo);
                        /*frame3.setUndecorated(true);*/ /*Se quita por comleto las opciones de cerrar y demás pero no se mueve la pantalla*/
                        frame3.setResizable(false);/*No deja maximizar*/
                        frame3.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE); /*No permite que cierre la ventana*/
                        /*frame3.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);*//*Ni minimiza, ni cierra (No valio xd SOLO NO CIERRA)*/
                        frame3.setSize(500, 500);
                        frame3.setVisible(true);
                        xd.dispose();
                        break;
                    case "Retiro":
                        JFrame frame4 = new JFrame("Retiros");
                        frame4.setContentPane(new form4(frame4).retiro);
                        frame4.setResizable(false);/*No deja maximizar*/
                        frame4.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
                        frame4.pack();
                        frame4.setSize(500, 500);
                        frame4.setVisible(true);
                        xd.dispose();
                        break;
                    case "Deposito":
                        JFrame frame5 = new JFrame("Depositos" );
                        frame5.setContentPane(new form5(frame5).deposito);
                        frame5.setResizable(false);/*No deja maximizar*/
                        frame5.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
                        frame5.pack();
                        frame5.setSize(500, 500);
                        frame5.setVisible(true);
                        xd.dispose();
                        break;
                    case "Salir":
                        JOptionPane.showMessageDialog(null,"Mucgas gracias por usar mi banco");
                        xd.dispose();
                        break;
                }
            }
        });
    }


}
