import javax.swing.*;
import java.awt.*;

public class Square 
{  

    ImageIcon whiteSquare = new ImageIcon("empty.png");
    ImageIcon blackSquare = new ImageIcon("empty2.png");
    ImageIcon White = new ImageIcon("white.png");
    ImageIcon RedCounter = new ImageIcon("Red.png");
    JButton button = new JButton();

    private int x; 
    private int y;
    private String colour;
    //private String red;
    //private String white;  

    public Square()
    {
    }
    void setColour(String givenColour)
    {
        colour=givenColour;
        
    } 
    
    JButton setCounter()
       {
        if(colour == "WHITE")
        {
           button.setIcon(White);
          ;
        }
         return button;
       }
   JButton addButton() 
   {
       if(colour == "WHITE")
       {
           button.setIcon(whiteSquare);
           return button;

       }
       else
       {
           button.setIcon(blackSquare);
           return button;

       }
       
       }
      
   }

    
