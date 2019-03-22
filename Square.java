//File: Square.java

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * This is a class which creates sqaures in either black or white and stores the conter icons
 * With getIcon,setColour, moveTo, addButton and getButton methods 
 * 
 * @author Katie Nizynski
 */

public class Square
{  
     ImageIcon whiteSquare = new ImageIcon("empty.png");// sets Empty.png as whiteSquare so then when called it collects the icon
     ImageIcon blackSquare = new ImageIcon("empty2.png");// sets empty2.png as blackSquare so then when called it collects the icon
     ImageIcon whiteCounter = new ImageIcon("white.png");// sets white.png as whiteCounter so then when called it collects the icon
     ImageIcon RedCounter = new ImageIcon("red.png");//sets red.png as redCounter so then when called it collects the icon
     JButton button = new JButton();// creates a new JButton when button is called 
    
/** instance variables */
    private int x;
    private int y;
    private String colour;

   

    public Square()
    {
    }

    /**getIcon Method.
     * 
     * This method is used to get the icon of the Square.
     * @param nothing.
     * @return JButton
     */

    Icon getIcon()// a get icon function that returns a button.
        {
       return this.button.getIcon();
        }

    /**getColourMethod.
     * 
     * This method is used to get the colour of the sqaure
     * 
     * @param String 
     * @return colour
     */


    String getColour()
        {
            return colour;
        }

  /**SetColourMethod.
     * 
     * This method is used to set the counter colours as a word such as WHITE or BLACK.
     * 
     * @param string givenColour
     * @return Nothing
     */
    void setColour(String givenColour) 
        {
            colour=givenColour;
        } 

   

    /**moveTo Method.
     * This method is used to move the checkers counters from one sqaure to another
     * 
     * 
     * @param square secondSquare
     * @return 
     */

    public void moveTo(Square secondSquare)// move to function that takes 2 sqaures as parameters
        {
            

            if(secondSquare.getColour() == "WHITE")
            {
               secondSquare.addButton(true);
            }
            button.getIcon();
            button.setIcon(whiteSquare);
            
        }   

    /**getButtonMethod.
     * 
     * This method is used to return a button
     * 
     * @param nothing.
     * @return JButton
     */   

    public JButton getButton()//get button method that returns a button
        {
            return button;// returns a Jbutton
        }

    /**addButton Method.
     * 
     * This method is used to determine what icons should be set depending on the square.
     * 
     * @param boolean addPiece
     * @return JButton
     */

   JButton addButton(boolean addPiece) // Method called add button with boolean parameter that reuturns a Jbutton
    {
        if(colour == "WHITE")// sets the icons for the white sqaures which can either be a square or a counter
        {
            if(addPiece)
                button.setIcon(whiteCounter);// sets the icon of the square to a white counter(white.png)
            else
               button.setIcon(whiteSquare);//sets the icon of the square to a white square(empty.png)
        }
            
        else if (colour == "BLACK")// sets the icons for the black sqaures 
        {
            button.setIcon(blackSquare); // sets the icon of the square to a black square (black.png)
        }
              
        return button; // returns a button
    }

        
}
    
    

    
