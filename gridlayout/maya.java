package gridlayout;

import java.awt.*;
import javax.swing.*;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class maya extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
    int turno=0;
    ImageIcon reactor = new ImageIcon("gridlayout\\reactor.png");
    ImageIcon escudo = new ImageIcon("gridlayout\\escudo.png");


    public maya()
    {
        
        


        this.setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Grid Layout");
        setLocationRelativeTo(null);
       

        setLayout(new GridLayout(3,3) );
        

        //Aqui está el evento del btn1
        ActionListener cbtn1 = new ActionListener()
        {
       @Override
       public void actionPerformed(ActionEvent e)
       {
           turno++;
          if(turno%2==0){b1.setIcon(escudo);}
          else{b1.setIcon(reactor);}
          ganador();
       }
       
        };
        ////////////////////////////////////////////////////


        //Aqui está el evento del btn2
        ActionListener cbtn2 = new ActionListener()
        {
       @Override
       public void actionPerformed(ActionEvent e)
       {
           turno++;
          if(turno%2==0){b2.setIcon(escudo);}
          else{b2.setIcon(reactor);}
          ganador();
       }
       
        };
        ////////////////////////////////////////////////////


        //Aqui está el evento del btn3
        ActionListener cbtn3 = new ActionListener()
        {
       @Override
       public void actionPerformed(ActionEvent e)
       {
           turno++;
          if(turno%2==0){b3.setIcon(escudo);}
          else{b3.setIcon(reactor);}
          ganador();
       }
       
        };
        ////////////////////////////////////////////////////


        //Aqui está el evento del btn4
        ActionListener cbtn4 = new ActionListener()
        {
       @Override
       public void actionPerformed(ActionEvent e)
       {
           turno++;
          if(turno%2==0){b4.setIcon(escudo);}
          else{b4.setIcon(reactor);}
          ganador();
       }
       
        };
        ////////////////////////////////////////////////////


        //Aqui está el evento del btn5
        ActionListener cbtn5 = new ActionListener()
        {
       @Override
       public void actionPerformed(ActionEvent e)
       {
           turno++;
          if(turno%2==0){b5.setIcon(escudo);}
          else{b5.setIcon(reactor);}
          ganador();
       }
       
        };
        ////////////////////////////////////////////////////


        //Aqui está el evento del btn6
        ActionListener cbtn6 = new ActionListener()
        {
       @Override
       public void actionPerformed(ActionEvent e)
       {
           turno++;
          if(turno%2==0){b6.setIcon(escudo);}
          else{b6.setIcon(reactor);}
          ganador();
       }
       
        };
        ////////////////////////////////////////////////////


        //Aqui está el evento del btn7
        ActionListener cbtn7 = new ActionListener()
        {
       @Override
       public void actionPerformed(ActionEvent e)
       {
           turno++;
          if(turno%2==0){b7.setIcon(escudo);}
          else{b7.setIcon(reactor);}
          ganador();
       }
       
        };
        ////////////////////////////////////////////////////


        //Aqui está el evento del btn8
        ActionListener cbtn8 = new ActionListener()
        {
       @Override
       public void actionPerformed(ActionEvent e)
       {
           turno++;
          if(turno%2==0){b8.setIcon(escudo);}
          else{b8.setIcon(reactor);}
          ganador();
       }
       
        };
        ////////////////////////////////////////////////////

        //Aqui está el evento del btn9
        ActionListener cbtn9 = new ActionListener()
        {
       @Override
       public void actionPerformed(ActionEvent e)
       {
           turno++;
          if(turno%2==0){b9.setIcon(escudo);}
          else{b9.setIcon(reactor);}
          ganador();
       }
       
        };
        ////////////////////////////////////////////////////

           
        
        b1 = new JButton("Boton1");
        b1.addActionListener(cbtn1);
        add(b1);
        b2 = new JButton("Boton2");
        b2.addActionListener(cbtn2);
        add(b2);
        b3 = new JButton("Boton3");
        b3.addActionListener(cbtn3);
        add(b3);
        b4 = new JButton("Boton4");
        b4.addActionListener(cbtn4);
        add(b4);
        b5 = new JButton("Boton5");
        b5.addActionListener(cbtn5);
        add(b5);
        b6 = new JButton("Boton6");
        b6.addActionListener(cbtn6);
        add(b6);
        b7 = new JButton("Boton7");
        b7.addActionListener(cbtn7);
        add(b7);
        b8 = new JButton("Boton8");
        b8.addActionListener(cbtn8);
        add(b8);
        b9 = new JButton("Boton9");
        b9.addActionListener(cbtn9);
        add(b9);

        JOptionPane.showMessageDialog (null, "Gato 1.0 ");
               

        

    }

    private void ganador()
    {
        if(b1.getIcon()==escudo && b2.getIcon()==escudo && b3.getIcon()==escudo)
        {
            JOptionPane.showMessageDialog (null, "Gana el jugador 2");
            reset();
            
        }
        else if(b4.getIcon()==escudo && b5.getIcon()==escudo && b6.getIcon()==escudo)
        {
            JOptionPane.showMessageDialog (null, "Gana el jugador 2");
            reset();
        }
        else if(b7.getIcon()==escudo && b8.getIcon()==escudo && b9.getIcon()==escudo)
        {
            JOptionPane.showMessageDialog (null, "Gana el jugador 2");
            reset();
        }
        else if(b7.getIcon()==escudo && b5.getIcon()==escudo && b3.getIcon()==escudo)
        {
            JOptionPane.showMessageDialog (null, "Gana el jugador 2");
            reset();
        }
        else if(b1.getIcon()==escudo && b5.getIcon()==escudo && b9.getIcon()==escudo)
        {
            JOptionPane.showMessageDialog (null, "Gana el jugador 2");
            reset();
        }
        else if(b1.getIcon()==escudo && b4.getIcon()==escudo && b7.getIcon()==escudo)
        {
            JOptionPane.showMessageDialog (null, "Gana el jugador 2");
            reset();
        }
        else if(b2.getIcon()==escudo && b5.getIcon()==escudo && b8.getIcon()==escudo)
        {
            JOptionPane.showMessageDialog (null, "Gana el jugador 2");
            reset();
        }
        else if(b3.getIcon()==escudo && b6.getIcon()==escudo && b9.getIcon()==escudo)
        {
            JOptionPane.showMessageDialog (null, "Gana el jugador 2");
            reset();
        }

        ///Ahora para el jugador 1
        else if(b1.getIcon()==reactor && b2.getIcon()==reactor && b3.getIcon()==reactor)
        {
            JOptionPane.showMessageDialog (null, "Gana el jugador 1");
            reset();
        }
        else if(b4.getIcon()==reactor && b5.getIcon()==reactor && b6.getIcon()==reactor)
        {
            JOptionPane.showMessageDialog (null, "Gana el jugador 1");
            reset();
        }
        else if(b7.getIcon()==reactor && b8.getIcon()==reactor && b9.getIcon()==reactor)
        {
            JOptionPane.showMessageDialog (null, "Gana el jugador 1");
            reset();
        }
        else if(b7.getIcon()==reactor && b5.getIcon()==reactor && b3.getIcon()==reactor)
        {
            JOptionPane.showMessageDialog (null, "Gana el jugador 1");
            reset();
        }
        else if(b1.getIcon()==reactor && b5.getIcon()==reactor && b9.getIcon()==reactor)
        {
            JOptionPane.showMessageDialog (null, "Gana el jugador 1");
            reset();
        }
        else if(b1.getIcon()==reactor && b4.getIcon()==reactor && b7.getIcon()==reactor)
        {
            JOptionPane.showMessageDialog (null, "Gana el jugador 1");
            reset();
        }
        else if(b2.getIcon()==reactor && b5.getIcon()==reactor && b8.getIcon()==reactor)
        {
            JOptionPane.showMessageDialog (null, "Gana el jugador 1");
            reset();
        }
        else if(b3.getIcon()==reactor && b6.getIcon()==reactor && b9.getIcon()==reactor)
        {
            JOptionPane.showMessageDialog (null, "Gana el jugador 1");
            reset();
        }
        else if(turno==9)
        {
            JOptionPane.showMessageDialog (null, "nadie gana");
            reset();
        }



        
        
    }

    private void reset()
    {
        turno=0;
        b1.setIcon(null);
        b2.setIcon(null);
        b3.setIcon(null);
        b4.setIcon(null);
        b5.setIcon(null);
        b6.setIcon(null);
        b7.setIcon(null);
        b8.setIcon(null);
        b9.setIcon(null);

    }
    
    
        

    



}