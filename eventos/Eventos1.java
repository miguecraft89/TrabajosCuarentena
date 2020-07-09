package eventos;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.plaf.FontUIResource;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Eventos1 extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public Eventos1() {

        this.setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Eventos");
        setLocationRelativeTo(null);
        iniciarComponentes();

    }

    public JPanel panel;

    

    private void iniciarComponentes() {
        panel = new JPanel(); // Crear un panel
        this.getContentPane().add(panel); // agregar panel a la ventana
        panel.setLayout(null); // desactivar la forma base de creacion del panel

        JLabel etiqueta = new JLabel("Eventos", SwingConstants.CENTER); // etiqueta de texto
        etiqueta.setOpaque(true); // Deja cambiar el fondo
        etiqueta.setForeground(java.awt.Color.BLUE);// Cambio de color de letra
        etiqueta.setBackground(Color.PINK); // Color de fondo de la etiqueta

        etiqueta.setFont(new FontUIResource("Monotype Corsiva", 3, 20)); // Establecer la fuente del texto, depende del
                                                                         // SO del equipo
        // arriba 0= plana, 1=Negrita, 2=cursiva, 3= 1+2

        // etiqueta.setText("Hola Mundo");
        // etiqueta.setHorizontalAlignment(SwingConstants.CENTER); //alineacion
        // horizontal del texto
        etiqueta.setSize(500, 20);
        etiqueta.setLocation(0, 20);

        panel.add(etiqueta);

        JLabel lbl1 = new JLabel("Ingrese su nombre:");
        lbl1.setOpaque(true); // Deja cambiar el fondo
        lbl1.setForeground(java.awt.Color.green);// Cambio de color de letra
        lbl1.setBackground(Color.gray); // Color de fondo de la etiqueta
        lbl1.setFont(new FontUIResource("arial black", 3, 12));

        lbl1.setBounds(0, 50, 200, 20);
        panel.add(lbl1);

        JLabel lbl2 = new JLabel();
        lbl2.setBounds(5, 150, 300, 50);
        panel.add(lbl2);

        JTextField txt1 = new JTextField("");
        txt1.setBounds(3, 75, 200, 30);
        panel.add(txt1);

        //Aqui está el evento del btn1
        ActionListener clcikbtn1 = new ActionListener()
        {
       @Override
       public void actionPerformed(ActionEvent e)
       {
          lbl2.setText("Hola "+ txt1.getText());
       }
       
        };
        ////////////////////////////////////////////////////


        JButton btn1 = new JButton("Pulse aqui");
        btn1.setBounds(50, 110, 100, 50);
        btn1.setMnemonic('a');
        btn1.addActionListener(clcikbtn1);
        panel.add(btn1);

         


        

    }
  
    

}