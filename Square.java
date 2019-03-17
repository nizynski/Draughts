import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Square implements ActionListener
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
    private static Icon selection2;

    public Square()
    {
        button.addActionListener(this); 
    }

    public void actionPerformed(ActionEvent event)
    {
      moveTo(this);

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

    void moveTo(Square newSquare)
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
            
           
           
             
            //button.removeIcon();
            
            //if(setIcon)
            //{
            //button.getIcon(whiteSquare);
            //}
            //button.removeIcon(this);
            //if (PieceToMove == null);
            //{
              //  PieceToMove == button;
            //selection1 = button.setIcon(whiteSquare);
           // selection2 = button.setIcon(WhiteCounter);
            //}
           // else
            //{
            
            //button.setIcon(whiteSquare) = selection1;
            

            
            //button.setIcon(WhiteCounter);
             //newSqaure 
            //}
            
            
            
           
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
    
    

    
