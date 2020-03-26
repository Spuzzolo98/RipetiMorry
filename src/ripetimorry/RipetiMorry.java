
package ripetimorry;

import java.util.Scanner;
public class RipetiMorry       
{
    static void morrygay(int counter)
    {
        System.out.print("morry è gay " +counter +" volte");   
        counter = 69;
    }
    
    
    static int morrydoppiamentegay(int counter)
    {
        counter = 4;
        
        return counter;
    }
    
    
    static void vettoregay(int vettore[])
    {
        Scanner input = new Scanner(System.in);
        for(int i=0; i<10; i++)
        {
            vettore[i] = input.nextInt();       
        }     
    }
    
    
    
    

    public static void main(String[] args) 
    {
        int counter  = 6, morrygaypartedue=0;
        morrygay(counter);
        int vettore[] = new int[100];
        morrygaypartedue = morrydoppiamentegay(counter);
        vettoregay(vettore);
        
    }
    
}
