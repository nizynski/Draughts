import javax.swing.*;
import java.awt.*;

public class Square 
{  

    ImageIcon whiteSquare = new ImageIcon("empty.png");
    ImageIcon blackSquare = new ImageIcon("empty2.png");
    JButton button = new JButton();

    private int x; 
    private int y;
    private String colour;

    public Square()
    {

    }
    void setColour(String givenColour)
    {
        colour=givenColour;
        //System.out.println(colour);
    }
   JButton addButton() 
   {
       if(colour == "WHITE")
       {
           button.setIcon(whiteSquare);
           System.out.println("WHITE");
           return button;


       }
       else
       {
           button.setIcon(blackSquare);
           System.out.println("BLACK");
           return button;

       }
   }

    
}