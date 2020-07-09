package botones2;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.plaf.FontUIResource;


public class Botones2 extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public Botones2()
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
        //Boton 1
        JButton btn1 = new JButton("click");
        btn1.setBounds(100, 100, 100, 50);
        btn1.setMnemonic('a');
        btn1.setForeground(Color.blue);
        btn1.setFont(new FontUIResource("cooper black",1,20));
        panel.add(btn1);

        //Boton 2 
        JButton btn2 = new JButton();
        btn2.setBounds(200, 100, 100, 50);
        btn2.setMnemonic('s');
        btn2.setForeground(Color.blue);
        btn2.setBackground(Color.red);
        btn2.setFont(new FontUIResource("cooper black",1,20));
        panel.add(btn2);

        //Boton 3 (imagen)
        JButton btn3 = new JButton();
        btn3.setBounds(300, 100, 100, 50);
        ImageIcon boton = new ImageIcon("botones2\\boton3.jpg");
        btn3.setMnemonic('d');
        btn3.setForeground(Color.blue);
        btn3.setBackground(Color.green);
        btn3.setIcon(new ImageIcon(boton.getImage().getScaledInstance(btn3.getWidth(), btn3.getHeight(), Image.SCALE_DEFAULT)));
        btn3.setFont(new FontUIResource("cooper black",1,20));
        panel.add(btn3);
        
        
    }

    

}