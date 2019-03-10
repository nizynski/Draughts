import javax.swing.*;
import java.awt.*;

public class Square {  
    ImageIcon whiteSquare = new ImageIcon("empty.png");
    ImageIcon blackSquare = new ImageIcon("empty2.png");
    ImageIcon WhiteCounter = new ImageIcon("white.png");
    ImageIcon RedCounter = new ImageIcon("red.png");
    JButton button = new JButton();

    private int x; 
    private int y;
    private String colour;
    private String counter;
    int space = 0;

public Square()
    {
     
    }
    void setColour(String givenColour)
        {
            colour=givenColour;
        
        } 

    void setCounter(String counterColour)
        {
            counter=counterColour; 
        }
      
    JButton setCounter()
        {
            if(colour == "WHITE")
            {
                 button.setIcon(WhiteCounter);
            }
                return button; 
       }
 
   JButton addButton() 
        {
            for(int i = 0;i<64;i++)
            {
                if(colour == "WHITE" && i<12)
             {
                System.out.println(i);
                button.setIcon(WhiteCounter);
                return button;

                }
            
            if(colour == "WHITE")
            {   
                System.out.println("white");
                button.setIcon(whiteSquare);
                return button;
                
            }
             if (colour == "BLACK")
             { 
                  System.out.println("black");
                    button.setIcon(blackSquare);  
                    return button;
             }
              
        
        }
        return button;
        }
    }
    

    
