package areaTxt;

import java.awt.Color;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.plaf.FontUIResource;


public class Area extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public Area()
    {

        this.setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Areas de texto");
        setLocationRelativeTo(null);
        iniciarComponentes();
        colocarAreasDeTexto();
        
        
        

    }


    public JPanel panel;

    private void iniciarComponentes()
    {
          panel = new JPanel(); // Crear un panel
          this.getContentPane().add(panel); //agregar panel a la ventana
          panel.setLayout(null); //desactivar la forma base de creacion del panel
          

          JLabel etiqueta = new JLabel("Areas de texto", SwingConstants.CENTER); //etiqueta de texto
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

    

    private void colocarAreasDeTexto()
    {
               
        JTextArea areaText = new JTextArea();
        areaText.setBounds(100, 100, 300, 300);
        areaText.setText("Escribir aqui...");
        areaText.append(" Más texto ");//Este metodo añade más texto aparte del que ya se tiene
        areaText.setEditable(true); //abilitar o desabilitar la edicion
        System.out.println("El texto es: "+ areaText.getText().toString());
        panel.add(areaText);
        
    }

    

}