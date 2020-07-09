package neurona;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.plaf.FontUIResource;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Perceptron extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public Perceptron() {

        this.setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Perceptron");
        setLocationRelativeTo(null);
        iniciarComponentes();

    }

    public JPanel panel;
    public JButton btn1;
    public JLabel lbl2, lbl3, lbl4, lbl5, lbl6, salida1, salida2, salida3, salida4;
    public JTextField txt1, txt2, txt3, txt4, txt5, txt6, txt7, txt8, txt9, txt10, txt11, txt12;

    

    private void iniciarComponentes() {
        panel = new JPanel(); // Crear un panel
        this.getContentPane().add(panel); // agregar panel a la ventana
        panel.setLayout(null); // desactivar la forma base de creacion del panel

        JLabel etiqueta = new JLabel("Demo Neurona simple", SwingConstants.CENTER); // etiqueta de texto
        etiqueta.setOpaque(true); // Deja cambiar el fondo
        etiqueta.setForeground(java.awt.Color.BLUE);// Cambio de color de letra
        etiqueta.setBackground(Color.PINK); // Color de fondo de la etiqueta

        etiqueta.setFont(new FontUIResource("Monotype Corsiva", 3, 20)); // Establecer la fuente del texto, depende del
                                                                         // SO del equipo
        // arriba 0= plana, 1=Negrita, 2=cursiva, 3= 1+2

    
        etiqueta.setSize(500, 20);
        etiqueta.setLocation(0, 20);

        panel.add(etiqueta);

        //Titulo
        JLabel lbl1 = new JLabel("Tabla de Verdad AND o OR");
        lbl1.setFont(new FontUIResource("arial black", 3, 12));

        lbl1.setBounds(0, 50, 200, 20);
        panel.add(lbl1);

        
        lbl2 = new JLabel("Neuroa");
        lbl2.setBounds(380, 50, 200, 20);
        lbl2.setFont(new FontUIResource("arial black", 3, 12));
        panel.add(lbl2);

        lbl3 = new JLabel("Iteraciones: ");
        lbl3.setBounds(10, 300, 200, 20);
        lbl3.setFont(new FontUIResource("arial black", 3, 12));
        panel.add(lbl3);

        lbl4 = new JLabel("Peso 1: ");
        lbl4.setBounds(10, 320, 200, 20);
        lbl4.setFont(new FontUIResource("arial black", 3, 12));
        panel.add(lbl4);

        lbl5 = new JLabel("Peso 2:");
        lbl5.setBounds(10, 340, 200, 20);
        lbl5.setFont(new FontUIResource("arial black", 3, 12));
        panel.add(lbl5);

        lbl6 = new JLabel("Umbral: ");
        lbl6.setBounds(10, 360, 200, 20);
        lbl6.setFont(new FontUIResource("arial black", 3, 12));
        panel.add(lbl6);

        //Flechas
        ImageIcon flecha = new ImageIcon("neurona\\flecha.png");
        ImageIcon fle = new ImageIcon((flecha.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT)));
        ImageIcon neuro = new ImageIcon("neurona\\neurona.png");
        ImageIcon ne = new ImageIcon((neuro.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT)));

        JLabel flecha1 = new JLabel(flecha);
        flecha1.setIcon(fle); 
        flecha1.setBounds(67, 80, 30, 30);
        panel.add(flecha1);

        JLabel flecha2 = new JLabel(flecha);
        flecha2.setIcon(fle); 
        flecha2.setBounds(67, 130, 30, 30);
        panel.add(flecha2);

        JLabel flecha3 = new JLabel(flecha);
        flecha3.setIcon(fle); 
        flecha3.setBounds(67, 180, 30, 30);
        panel.add(flecha3);

        JLabel flecha4 = new JLabel(flecha);
        flecha4.setIcon(fle); 
        flecha4.setBounds(67, 230, 30, 30);
        panel.add(flecha4);

        //Entradas
        txt1 = new JTextField("");
        txt1.setBounds(3, 80, 30, 30);
        
        panel.add(txt1);

        txt2 = new JTextField("");
        txt2.setBounds(35, 80, 30, 30);
        panel.add(txt2);

        txt3 = new JTextField("");
        txt3.setBounds(97, 80, 30, 30);
        panel.add(txt3);

        txt4 = new JTextField("");
        txt4.setBounds(3, 130, 30, 30);
        panel.add(txt4);

        txt5 = new JTextField("");
        txt5.setBounds(35, 130, 30, 30);
        panel.add(txt5);

        txt6 = new JTextField("");
        txt6.setBounds(97, 130, 30, 30);
        panel.add(txt6)
        ;
        txt7 = new JTextField("");
        txt7.setBounds(3, 180, 30, 30);
        panel.add(txt7);


        txt8 = new JTextField("");
        txt8.setBounds(35, 180, 30, 30);
        panel.add(txt8);

        txt9 = new JTextField("");
        txt9.setBounds(97, 180, 30, 30);
        panel.add(txt9);

        txt10 = new JTextField("");
        txt10.setBounds(3, 230, 30, 30);
        panel.add(txt10);

        txt11 = new JTextField("");
        txt11.setBounds(35, 230, 30, 30);
        panel.add(txt11);

        txt12 = new JTextField("");
        txt12.setBounds(97, 230, 30, 30);
        panel.add(txt12);

        //Salidas neuronas

        salida1 = new JLabel("");
        salida1.setBounds(400, 80, 100, 30);
        salida1.setFont(new FontUIResource("arial black", 3, 12));
        panel.add(salida1);

        salida2 = new JLabel("");
        salida2.setBounds(400, 130, 100, 30);
        salida2.setFont(new FontUIResource("arial black", 3, 12));
        panel.add(salida2);

        salida3 = new JLabel("");
        salida3.setBounds(400, 180, 100, 30);
        salida3.setFont(new FontUIResource("arial black", 3, 12));
        panel.add(salida3);

        salida4 = new JLabel("");
        salida4.setBounds(400, 230, 100, 30);
        salida4.setFont(new FontUIResource("arial black", 3, 12));
        panel.add(salida4);







        //Aqui está el evento del btn1
        ActionListener clcikbtn1 = new ActionListener()
        {
       @Override
       public void actionPerformed(ActionEvent e)
       {
          lbl2.setText("La salida es: ");
          red();
          
       }
       
        };
        ////////////////////////////////////////////////////


        btn1 = new JButton("Pulse aqui");
        btn1.setBounds(150, 70, 200, 200);
        btn1.setMnemonic('a');
        btn1.setIcon(ne);
        btn1.addActionListener(clcikbtn1);
        panel.add(btn1);

        

         


        

    }

    public void red()
    {
        int entrada1 = Integer.parseInt(txt1.getText());
        int entrada2 = Integer.parseInt(txt2.getText());
        int entrada3 = Integer.parseInt(txt3.getText());
        int entrada4 = Integer.parseInt(txt4.getText());
        int entrada5 = Integer.parseInt(txt5.getText());
        int entrada6 = Integer.parseInt(txt6.getText());
        int entrada7 = Integer.parseInt(txt7.getText());
        int entrada8 = Integer.parseInt(txt8.getText());
        int entrada9 = Integer.parseInt(txt9.getText());
        int entrada10 = Integer.parseInt(txt10.getText());
        int entrada11 = Integer.parseInt(txt11.getText());
        int entrada12 = Integer.parseInt(txt12.getText());

        int[][] tabla = { { entrada1, entrada2, entrada3 }, { entrada4, entrada5, entrada6 }, { entrada7, entrada8, entrada9 }, { entrada10, entrada11, entrada12 } }; //Tabla de verdad AND
        double azar = Math.random();

        double[] pesos = {azar, azar, azar}; //Pesos al azar
        boolean aprendiendo = true;
        int salidaEntera;
        int iteracion=0;
        double tazaAprende = 0.3;

        while(aprendiendo){//Hasta que aprenda la tabla AND o OR
            iteracion++;
            aprendiendo=false;

            for(int cont=0; cont<=3; cont++){
                double salidaReal = (tabla[cont][0])*(pesos[0])+(tabla[cont][1])*(pesos[1])+(pesos[2]);//Calcula la salida real
                if(salidaReal>0){salidaEntera=1;}else{salidaEntera=0;} //Transforma a valores 0 o 1
                int error = (tabla[cont][2])-salidaEntera;
                if(error !=0){
                    pesos[0]= pesos[0]+tazaAprende*error*(tabla[cont][0]);
                    pesos[1]= pesos[1]+tazaAprende*error*(tabla[cont][1]);
                    pesos[2]= pesos[2]+tazaAprende*error*1;
                    aprendiendo=true;
                    
                }

            }

        }

        btn1.setEnabled(true);

        String itera = String.valueOf(iteracion);

        System.out.println("Iteraciones: "+ itera.toString());
        lbl3.setText("Iteraciones: "+ itera.toString());
        lbl4.setText("Peso1: "+ String.valueOf(pesos[0]));
        lbl5.setText("Peso2: "+ String.valueOf(pesos[1]));
        lbl6.setText("Umbral: "+ String.valueOf(pesos[2]));


        for(int cont=0; cont<=3; cont++)
        {//Muestra el perceptron con la tabla de verdad aprendida
            double salidaReal = (tabla[cont][0])*(pesos[0])+(tabla[cont][1])*(pesos[1])+(pesos[2]);//Calcula la salida real
            if(salidaReal>0){salidaEntera=1;}else{salidaEntera=0;} //Transforma a valores 0 o 1
            if(cont==0){salida1.setText(String.valueOf(salidaEntera));}
            if(cont==1){salida2.setText(String.valueOf(salidaEntera));}
            if(cont==2){salida3.setText(String.valueOf(salidaEntera));}
            if(cont==3){salida4.setText(String.valueOf(salidaEntera));}
            
        }
        
        

    }

    
  
    

}