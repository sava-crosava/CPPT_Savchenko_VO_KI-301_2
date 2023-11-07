package KI301.Savchenko.lab2;

import static java.lang.System.out;
import java.io.*;

import KI301.Savchenko.lab2.Shoes.Tyer;
/**
 * Shoes Application class implements main method for Shoes
 class possibilities demonstration
 * @author Savchenko Vlad
 * @version 1.0
 */
public class ShoesApp
{
    /**
     * @param args
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException
    {
        Tyer.States dir = null;
        Shoes shoes = new Shoes();
        shoes.TieShoes();
        out.print(shoes.getLeftShoeTieCount() + "\n");
        out.print(shoes.getRightShoeTieCount() + "\n");
        shoes.setShoeSize(38, 40);
        out.print(shoes.getLeftShoeSize() + "\n");
        out.print(shoes.getRightShoeSize() + "\n");
        dir = shoes.getTieState();
        if (dir == Tyer.States.Tied)
        {
            out.print("Tied\n");
        }else if (dir == Tyer.States.Untied)
        {
            out.print("Untied\n");
        }else if (dir == Tyer.States.Without)
        {
            out.print("No laces\n");
        }
        shoes.dispose();
    }
}