package KI301.Savchenko.lab6;

import java.util.*;
import java.io.*;
public class stack {

    public static void main(String[] args)
    {
        Stacks <? super Info> stack = new Stacks <Info>();
        stack.Push(new Number(5969648));
        stack.Push(new Words("ckasdsad"));
        stack.Push(new Number(1164));
        Info res = stack.FindMin();
        System.out.print("Minimum: \n");
        res.print();
        stack.Pop();
    }

}
class Stacks <T extends Info>
{
    private ArrayList<T> arr;

    public Stacks()
    {
        arr = new ArrayList<T>();
    }
    public T FindMin()
    {
        if (!arr.isEmpty())
        {
            T min = arr.get(0);
            for (int i = 1; i < arr.size(); i++)
            {
                if (( arr.get(i)).compareTo(min) < 0)
                    min = arr.get(i);

            }return min;

        }return null;

    }
    public void Push (T data)
    {
        arr.add(data);
        System.out.print("Element added: ");
        data.print();
    }
    public void Pop()
    {
        arr.remove(arr.size()-1);
        System.out.print("The last element removed");
    }
}
interface Info extends Comparable<Info>
{
    public int getLength();
    public void print();
}

class Number implements Info
{
    private int num;
    private int length;
    private int sum = 0;

    public Number(int n)
    {
        num = n;
        length = String.valueOf(n).length();
        getSum();

    }
    public int getNumber()
    {
        return num;
    }
    public int getSum()
    {
        int n = num;
        while(n !=0)
        {
            sum = sum + n%10;
            n=n/10;
        }
        return sum;
    }

    public void setNumber(int n)
    {
        num = n;
    }
    public int getLength()
    {
        return length;
    }

    public int compareTo(Info p)
    {
        Integer s = length;
        return s.compareTo(p.getLength());
    }
    public void print()
    {
        System.out.print("Number: " + num + " Length: " + length + " Sum of all digits: " + sum + "\n");
    }
}
class Words implements Info
{
    private String word;
    private int length;

    public Words(String w)
    {
        word = w;
        length = word.length();
    }

    public String getWords()
    {
        return word;
    }
    public void setWord(String w)
    {
        word = w;
    }
    public int getLength()
    {
        return length;
    }
    public int compareTo(Info p)
    {
        Integer s = length;
        return s.compareTo(p.getLength());
    }
    public void print()
    {
        System.out.print("Words: " + word + " Length: " + length + "\n");
    }

}
