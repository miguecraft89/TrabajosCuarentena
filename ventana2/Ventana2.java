package ventana2;



import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;



public class Ventana2 extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public Ventana2()
    {

        this.setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Ventana Test 2");
        setLocationRelativeTo(null);
        iniciarComponentes();
        

    }

    private void iniciarComponentes()
    {
          JPanel panel = new JPanel(); // Crear un panel
          this.getContentPane().add(panel); //agregar panel a la ventana
          panel.setLayout(null); //desactivar la forma base de creacion del panel

          JLabel etiqueta = new JLabel("Hola Mundo", SwingConstants.CENTER); //etiqueta de texto
          etiqueta.setOpaque(true); //Deja cambiar el fondo 
          etiqueta.setForeground(java.awt.Color.BLUE);//Cambio de color de letra
          etiqueta.setBackground(Color.PINK); //Color de fondo de la etiqueta
          //etiqueta.setText("Hola Mundo");
          //etiqueta.setHorizontalAlignment(SwingConstants.CENTER);  //alineacion horizontal del texto
          etiqueta.setBounds(10, 20, 100, 15);
          
          panel.add(etiqueta);
          
    }


}