import javax.swing.*;
import java.awt.*;

public class Board {
        JPanel panel = new JPanel();
        GridLayout layout = new GridLayout(8,8);
        JFrame frame = new JFrame();  
        Square[] squareArray = new Square[64];
public Board()
    {
        
        panel.setLayout(layout);
        frame.setContentPane(panel); 
        frame.setVisible(true);
        frame.setSize(500,500);
        
        for(int i = 0;i < 64;i++)
        {
            squareArray[i] = new Square();
            
        }
        for (int i =0;i <64;i++){
            squareArray[i].setColour("WHITE");
            panel.add(squareArray[i].addButton());
        }



    }


}