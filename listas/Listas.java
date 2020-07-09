package listas;

import java.awt.Color;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.plaf.FontUIResource;


public class Listas extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public Listas()
    {

        this.setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Listas desplegables");
        setLocationRelativeTo(null);
        iniciarComponentes();
        colocarListasDesplegables();
        
        
        

    }


    public JPanel panel;

    private void iniciarComponentes()
    {
          panel = new JPanel(); // Crear un panel
          this.getContentPane().add(panel); //agregar panel a la ventana
          panel.setLayout(null); //desactivar la forma base de creacion del panel
          

          JLabel etiqueta = new JLabel("Combo List", SwingConstants.CENTER); //etiqueta de texto
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

    private void colocarListasDesplegables()
    {
        String[] paises = {"Mexico","USA","Colombia","Chile"};
        JComboBox lista1 = new JComboBox<>(paises);

        lista1.setBounds(20, 50, 100, 30);

        lista1.addItem("Argentina"); //Añadir objetos a la lista deplegable
        lista1.setSelectedItem("USA"); //Seleccionar el primer objeto visto
        panel.add(lista1);

        

        

    }

 

    

    

}