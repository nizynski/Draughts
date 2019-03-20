import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Square
 {  
     ImageIcon whiteSquare = new ImageIcon("empty.png");
     ImageIcon blackSquare = new ImageIcon("empty2.png");
     ImageIcon WhiteCounter = new ImageIcon("white.png");
     ImageIcon RedCounter = new ImageIcon("red.png");
     JButton button = new JButton();

    private  int x; 
    private int y;
    private static String colour;
    private static String counter;
    int space = 0;
    private static Icon selection1;
    private static int click = 1;
   

    public Square()
    {
        
    }

    Icon getIcon()
        {
       return this.button.getIcon();
        }
    void setColour(String givenColour)
        {
            colour=givenColour;
        
        } 

    void setCounter(String counterColour)
        {
            counter=counterColour; 
        }

    public void moveTo(JButton firstSquare, JButton secondSquare)
        {
            selection1 = firstSquare.getIcon();
            System.out.println("check colour");
            // add red counter later 
             firstSquare.setIcon(whiteSquare);
            
            if(secondSquare.getIcon() == whiteSquare)
            {
               secondSquare.setIcon(WhiteCounter);
            }
        
            
            
        
    }
            
           
        public JButton getButton()
        {
            return button;
        }
    
    
           
        
        

   
   JButton addButton(boolean addPiece) 
    {
        if(colour == "WHITE")
        {
            if(addPiece)
                button.setIcon(WhiteCounter);
            else
               button.setIcon(whiteSquare);
        }
            
        else if (colour == "BLACK")
        {
            button.setIcon(blackSquare);  
        }
              
        return button;
    }

        
}
    
    

    
