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

    private int x; 
    private int y;
    private String colour;
    private String counter;
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

    void moveTo(Square newSquare){
        /*{
        if (click == 1)
        {
         newSquare = clickedSquare; 
         click = click + 1; 
        }
        if(click == 2)
        {
            selection1 = button.getIcon();
           // selection2 = button.getIcon();
            
            System.out.println(selection1);
            System.out.println(selection2);

            if(selection1 == WhiteCounter)
            {
                button.setIcon(whiteSquare);
                selection2 = WhiteCounter;
               
                
                System.out.println(selection2);
            }  
            
            //selection2 = button.getIcon();

            if(selection1==whiteSquare)
            {
                button.setIcon(WhiteCounter);
            }
            click = 1;
        }*/
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
    
    

    
