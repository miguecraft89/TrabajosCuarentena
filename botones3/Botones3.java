package botones3;

import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.plaf.FontUIResource;


public class Botones3 extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public Botones3()
    {

        this.setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Botones de opcion");
        setLocationRelativeTo(null);
        iniciarComponentes();
        colocarRadioBotones();
        
        

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

    private void colocarRadioBotones()
    {
        JRadioButton rbtn1 = new JRadioButton("Opcion 1", true);
        //rbtn1.setEnabled(false);
        rbtn1.setBounds(50, 100, 100, 50);
        panel.add(rbtn1);

        JRadioButton rbtn2 = new JRadioButton("Opcion 2", false);
        rbtn2.setBounds(50, 150, 100, 50);
        panel.add(rbtn2);

        JRadioButton rbtn3 = new JRadioButton("Opcion 3", false);
        rbtn3.setBounds(50, 200, 100, 50);
        panel.add(rbtn3);

        ButtonGroup grupoRadioBotones = new ButtonGroup();

        grupoRadioBotones.add(rbtn1);
        grupoRadioBotones.add(rbtn2);
        grupoRadioBotones.add(rbtn3);





        
        
        
    }

    

}