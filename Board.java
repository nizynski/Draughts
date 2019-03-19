import javax.swing.*;                                                             
import java.awt.*;
import java.awt.event.*;


public class Board implements ActionListener 
{
        JPanel panel = new JPanel(); //makes a new panel
        GridLayout layout = new GridLayout(8,8,1,1); // makes it have a grid layout 8 by 8
        JFrame frame = new JFrame();  // makes a new frame 
        Square[][] squareArray = new Square[8][8];// can create an 2D array when called 
private static JButton clickedSquare;
private static Square secondSqaure;
private static int clicks = 0;
private int clickedX = -1;
private int clickedY = -1;

 public void actionPerformed(ActionEvent event)
    {
      System.out.println("clicked");
      
      //moveTo(this);
      if(clicks == 0) // search for a counter
      {
        for(int x = 0; x < 8;x++) {
           for(int y=0;y<8;y++) {
             if(squareArray[x][y].getButton() == event.getSource()) {
               System.out.println("found sqaure");
              clickedSquare = (JButton)event.getSource();
              clickedX = x;
              clickedY = y;
              System.out.println(clickedSquare.getIcon());

             }
           }
        }
        clicks = clicks + 1; 
      }
      else if(clicks == 1)// search for a white square
      {
        clicks = 0;
        for(int x = 0; x < 8;x++) {
           for(int y=0;y<8;y++) {
             if(squareArray[x][y] == event.getSource()) 
             {
               if (clickedSquare.Button.getIcon(WhiteCounter))
               {
                 event.setIcon(WhiteCounter);
               }

             }
           }
        }
      }
    }

        
public Board()
    {
        
       
        frame.setContentPane(panel); 
        frame.setTitle("Draught Game");
        frame.setSize(750,750); // makes the size 750 by 750 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setLayout(layout); // sets the layoutout to the 8 by 8 when called 

        for(int i=0;i<8;i++){
         for(int j = 0 ;j < 8;j++)
        {
            squareArray[j][i] = new Square(); // a for loop to fill the array with squares  
            if ((i+j) % 2 == 0 )
          {
            squareArray[j][i].setColour("BLACK");
            panel.add(squareArray[j][i].addButton(false));
          }
          else 
          {
            squareArray[j][i].setColour("WHITE");
            squareArray[j][i].getButton().addActionListener(this); 
            panel.add(squareArray[j][i].addButton(i<8 && i>4));
            
          }
        
            
          
          
        }
        frame.setVisible(true); // make the panel visible 

            
    }
    
}
}


