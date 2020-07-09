package botones;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.plaf.FontUIResource;


public class Botones extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public Botones()
    {

        this.setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Botones");
        setLocationRelativeTo(null);
        iniciarComponentes();
        colocarBotones();
        
        

    }


    public JPanel panel;

    private void iniciarComponentes()
    {
          panel = new JPanel(); // Crear un panel
          this.getContentPane().add(panel); //agregar panel a la ventana
          panel.setLayout(null); //desactivar la forma base de creacion del panel
          

          JLabel etiqueta = new JLabel("Botones", SwingConstants.CENTER); //etiqueta de texto
          etiqueta.setOpaque(true); //Deja cambiar el fondo 
          etiqueta.setForeground(java.awt.Color.BLUE);//Cambio de color de letra
          etiqueta.setBackground(Color.PINK); //Color de fondo de la etiqueta

          etiqueta.setFont(new FontUIResource("Monotype Corsiva", 3, 20)); //Establecer la fuente del texto, depende del SO del equipo
          //arriba 0= plana, 1=Negrita, 2=cursiva, 3= 1+2

          //etiqueta.setText("Hola Mundo");
          //etiqueta.setHorizontalAlignment(SwingConstants.CENTER);  //alineacion horizontal del texto
          etiqueta.setSize(500,20);
          etiqueta.setLocation(0,20);
          
          panel.add(etiqueta);

          
    }

    private void colocarBotones()
    {
        JButton btn1 = new JButton("click");
        btn1.setBounds(100, 100, 100, 50);
        btn1.setMnemonic('a');
        panel.add(btn1);
        
        
    }

    

}