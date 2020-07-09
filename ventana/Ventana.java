package ventana;

import java.awt.Color;

import javax.swing.JFrame;

public class Ventana extends JFrame
{

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public Ventana()
    {

        this.setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Ventana Test");
        setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.cyan);

    }


}