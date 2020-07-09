package ventana3;



import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.plaf.FontUIResource;











public class Ventana3 extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public Ventana3()
    {

        this.setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Ventana Test 3");
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

          etiqueta.setFont(new FontUIResource("Monotype Corsiva", 3, 20)); //Establecer la fuente del texto, depende del SO del equipo
          //arriba 0= plana, 1=Negrita, 2=cursiva, 3= 1+2, 

          //etiqueta.setText("Hola Mundo");
          //etiqueta.setHorizontalAlignment(SwingConstants.CENTER);  //alineacion horizontal del texto
          etiqueta.setSize(500,20);
          etiqueta.setLocation(0,20);
          
          panel.add(etiqueta);



         
          ImageIcon imagen = new ImageIcon("ventana3\\balon.jpg");
          JLabel etiqueta2 = new JLabel();
          etiqueta2.setOpaque(true);               
          
          etiqueta2.setBounds(80, 80, 300, 300);
          //etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiqueta2.getWidth(), etiqueta2.getHeight(), 1)));
          //etiqueta2.setBackground(Color.BLACK);
          //etiqueta2.setText("Aqui iria la imagen");
          etiqueta2.setIcon(imagen);
          panel.add(etiqueta2);
          
       
          

          
          

          
                 
          

        
        
         

          

         
          
          
    }


}