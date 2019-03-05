import javax.swing.*;
import java.awt.*;

public class Square 
{   ImageIcon whiteSquare = new ImageIcon("empty.png");
    ImageIcon blackSquare = new ImageIcon("empty2.png");
    JButton button = new JButton();
    private int x; 
    private int y;
    private String colour;

    public Square()
    {

    }
   void setColour(String colour) 
   {
       if(colour == "WHITE")
       {
           button.setIcon(whiteSquare);
       }
       if(colour == "BLACK"){
           button.setIcon(blackSquare);
       }
   }
    JButton addButton()
    {
        return button;
    }
}