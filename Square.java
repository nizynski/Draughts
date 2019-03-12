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

    public Square()
    {
        button.addActionListener(this); 
    }

    public void actionPerformed(ActionEvent e)
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
            System.out.println("test");
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
    
    

    
