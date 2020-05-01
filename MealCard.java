/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myutility;
import java.util.Scanner;
import java.util.Random;
import myutility.RecieptFactory;

/**
 *
 * @author 18062
 */
public class MealCard {
    //Declare everything
      int n;
        char a= 3;
        double aL=4;
        char b=3;
        double bL=3.50;
        char c=3;
        double cL=3.75;
        char e=4;
        double eL=4.75;
        char f=1;
        double fL=1.75;
        char g=1;
        double gL=1.25;
        char h=2;
        double hL=2.50;
        char i=0;
        double iL=0;
        char j=2;
        double jL=2.50;
        char q=2;
        double qL=2.50;
        double p=1.00;
       
       char want;
        char response;
        char size;
        
    public void Mealplan( double d)
    {
     
       
        
        Scanner user_input=new Scanner(System.in);
        
        
        System.out.println("Time for lunch!\n HERES WHATS ON THE MENU TODAY");
        System.out.println("A-Cheeseburger $3"+"\n"+"B-Chicken Strips $3 "+"\n"+"C-Club Sandwich $4 "+"\n"+
                "E-Bacon CHeeseburger $4"+"\n"+"F-SIDE OF FRIES $2 "+"\n"+"G-SIDE OF CHIPS $2"+"\n"+
                "H-SIDE OF FRUIT $3"+"\n"+"I-WATER (FREE)"+"\n"+"Q-SODA 2$"+"\n"+"J-SWEET TEA $2");
        System.out.println("Please make your selection, One at a time!");
        System.out.println("Remember you can add points anytime by pressing 'z'.");
        want = user_input.next().charAt(0);
           this.MakeChoice(d, want);
        
       
    }
   
    
    
    
    
    public void MakeChoice(double d , char choice)
    {
        Scanner user_input=new Scanner(System.in);
        while (n==0)
        {
            
          switch (choice) {
              case 'A':
              case 'a':
                  System.out.println("Would you like Medium or Large(Double Patty)(M/L)");
                  size = user_input.next().charAt(0);
                  if (size=='L')
                  {
                  d=d-a;
                  }
                  else
                  d=d-aL;
                  
                 
                 
                  break;
              case 'B':
              case 'b':
                  System.out.println("Would you like Medium or Large(4 Strips)(M/L)");
                  size = user_input.next().charAt(0);
                  if (size=='L')
                  {
                  d=d-bL;
                  }
                  else 
                  d=d-b;
                  break;
              case 'C':
              case 'c':
                  System.out.println("Would you like Half or Whole (H/W)");
                  size = user_input.next().charAt(0);
                  if (size=='W')
                  {
                  d=d-cL;
                  }
                  else 
                  d=d-c;
                  break;
              case 'e':
              case 'E':
                  System.out.println("Would you like Medium or Large(Double Patty)(M/L))");
                  size = user_input.next().charAt(0);
                  if (size=='L')
                  {
                  d=d-eL;
                  }
                  else 
                  d=d-e;
                  break;
              case 'f':
              case 'F':
                  System.out.println("Would you like Medium or Large(M/L)");
                  size = user_input.next().charAt(0);
                  if (size=='L')
                  {
                  d=d-fL;
                  }
                  else 
                  d=d-f;
                  break;
              case 'g':
              case 'G':
                  System.out.println("Would you like Medium or Large(M/L)");
                  size = user_input.next().charAt(0);
                  if (size=='L')
                  {
                  d=d-gL;
                  }
                  else 
                  d=d-g;
                  break;
              case 'h':
              case 'H':
                  System.out.println("Would you like Medium or Large(M/L)");
                  size = user_input.next().charAt(0);
                  if (size=='L')
                  {
                  d=d-hL;
                  }
                  else 
                  d=d-h;
                  break;
              case 'i':
              case 'I':
                  System.out.println("Would you like Medium or Large(M/L)");
                  size = user_input.next().charAt(0);
                  if (size=='L')
                  {
                  d=d-iL;
                  }
                  else 
                  d=d-i;
                  break;
     
              case 'j':
              case 'J':
                  System.out.println("Would you like Medium or Large(M/L)");
                  size = user_input.next().charAt(0);
                  if (size=='L')
                  {
                  d=d-jL;
                  }
                  else 
                  d=d-j;
                  break;
                  
              case 'q':
              case 'Q':
                  System.out.println("Would you like Medium or Large(M/L)");
                  size = user_input.next().charAt(0);
                  if (size=='L')
                  {
                  d=d-qL;
                  }
                  else 
                  d=d-q;
                  break;
                  
             
          }
          if (d==p || d<p)
          {
          
          System.out.println("I am sorry you do not have enough money to continue.");
          System.out.println("\nYour remaining balance is"+" "+d);
          System.out.println("Please pick up your items at the window. HAVE A GREAT DAY");
          n=1;
          break;
          }
             
       System.out.println("Would you like anything else?(y/n)");
       response = user_input.next().charAt(0);
       if (response=='Y'||response=='y')
       {   
           System.out.println("What else would you like?");
           choice = user_input.next().charAt(0);
       }
       else
       {
           System.out.println("\nYour remaining balance is"+" "+d);
           
       
           n=1;
       }
       }
       }
     

    
   
    
    
}

