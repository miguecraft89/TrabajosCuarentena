package eventos2;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class escucha extends JFrame
{
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public JPanel panel;

    public escucha()
    {
        panel = new JPanel();
        this.getContentPane().add(panel);
        JLabel lbl1= new JLabel();
        lbl1.setText("Escribe algo...");
        lbl1.setBounds(10, 10, 200, 50);

        JTextField txt1 = new JTextField();
        txt1.setBounds(10, 70, 400, 50);

        JButton btn1 = new JButton("Click");
        btn1.setBounds(10, 130, 100, 50);

        JLabel lbl2= new JLabel();
        lbl2.setBounds(10, 200, 300, 50);

        JButton btn2 = new JButton("Borrar");
        btn2.setBounds(110, 130, 100, 50);



        //Aqui está todo lo del listener 1
        ActionListener clcikbtn1 = new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                lbl2.setText("Dijiste: "+txt1.getText());
            }
            
        };
        ////////////////////////////////////////////////////

         //Aqui está todo lo del listener 2
         ActionListener clcikbtn2 = new ActionListener()
         {
             @Override
             public void actionPerformed(ActionEvent e)
             {
                 lbl2.setText("Dijiste: ");
                 txt1.setText("");
             }
             
         };
         ////////////////////////////////////////////////////

        


        btn1.addActionListener(clcikbtn1);
        btn2.addActionListener(clcikbtn2);
        
        panel.add(txt1);
        panel.add(btn1);
        panel.add(lbl2);
        panel.add(lbl1);
        panel.add(btn2);
        this.setSize(500,500);
        panel.setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    



        



    }
 


}