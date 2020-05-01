/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mealcardtest;


import java.util.Random;
import java.util.Scanner;
import myutility.Studentclass;//using another class from another package
import myutility.MealCard;    
import myutility.RandomWindowGEN;
import myutility.Reciept;
import myutility.RecieptFactory;
 
  

/**
 *
 * @author 18062
 */
public class MealCardTest
{
String StudentAddress,StudentName;
    /**
     * @param args the command line arguments
     */
    char y;
    int c;
    double d;
    char choice;
    
    public static void main(String[] args) {
    int n=0;  
    
     while (n==0)
     {
       
          // import the other class
      char response = 'y';
        
     Studentclass myObj= new Studentclass();
     MealCard mypoint=new MealCard();
     RecieptFactory object1= new RecieptFactory();
     RandomWindowGEN object= RandomWindowGEN.getInstance();
     Scanner user_input=new Scanner(System.in);
     
     System.out.println("Enter Student Identification number (4 digits):");
     String k =user_input.nextLine(); 
       myObj.setStudentID(k);
   
  
        System.out.println("Student Identification Nummber: "+myObj.getStudentID());
      
        System.out.println("Do you have any money on your meal card?(Y/n)? ");
      response = user_input.next().charAt(0);
      
       if (response=='Y'||response=='y')
     {
     System.out.println("Awesome how much do you have?");
     double d = user_input.nextInt();
     mypoint.Mealplan(d);
      object.showMessage();
             
    System.out.println("How would you like your receipt? Text-(T),Email(E),Print(T) ");
      response = user_input.next().charAt(0);
               
         
      switch(response) 
      {
         case 'T':
         case 't':
             Reciept reciept1=object1.getShape("Text");
             reciept1.reciept();
             break;
             
         case 'E':
         case 'e':
             Reciept reciept2=object1.getShape("Email");
             reciept2.reciept();
             break;
       case 'P':
         case 'p':
             Reciept reciept3=object1.getShape("Print");
             reciept3.reciept();
      break;
      }
     }
       else if (response=='N'||response=='n')
       {
           System.out.println("Okay! You have been assigned a value of $15");
           double d=15;
           mypoint.Mealplan(d);
         object.showMessage();
         
    System.out.println("How would you like your receipt? Text-(T),Email(E),Print(T) ");
      response = user_input.next().charAt(0);
               
         
      switch(response) 
      {
         case 'T':
         case 't':
             Reciept reciept1=object1.getShape("Text");
             reciept1.reciept();
             break;
             
         case 'E':
         case 'e':
             Reciept reciept2=object1.getShape("Email");
             reciept2.reciept();
             break;
       case 'P':
         case 'p':
             Reciept reciept3=object1.getShape("Print");
             reciept3.reciept();
      break;
      }
      
        
       }
//////////////////////////////////////////////////////////////////////////////   
   else {
         System.out.println("Your selection was invalid Please try again");
            
        System.out.println("Would you like to set your points?(Y/n)? ");
        response = user_input.next().charAt(0);
        if (response=='Y'||response=='y')
     {
     System.out.println("Awesome how much do you have?");
     double d = user_input.nextInt();
     mypoint.Mealplan(d);
            
    System.out.println("How would you like your receipt? Text-(T),Email(E),Print(T) ");
      response = user_input.next().charAt(0);
               
         
      switch(response) 
      {
         case 'T':
         case 't':
             Reciept reciept1=object1.getShape("Text");
             reciept1.reciept();
             break;
             
         case 'E':
         case 'e':
             Reciept reciept2=object1.getShape("Email");
             reciept2.reciept();
             break;
       case 'P':
         case 'p':
             Reciept reciept3=object1.getShape("Print");
             reciept3.reciept();
      break;
      }
     }
       else if (response=='N'||response=='n')
       {
           System.out.println("Okay! You have been assigned a value of $15");
           double d=15;
           mypoint.Mealplan(d);
           object.showMessage();
                  
    System.out.println("How would you like your receipt? Text-(T),Email(E),Print(T) ");
      response = user_input.next().charAt(0);
               
         
      switch(response) 
      {
         case 'T':
         case 't':
             Reciept reciept1=object1.getShape("Text");
             reciept1.reciept();
             break;
             
         case 'E':
         case 'e':
             Reciept reciept2=object1.getShape("Email");
             reciept2.reciept();
             break;
       case 'P':
         case 'p':
             Reciept reciept3=object1.getShape("Print");
             reciept3.reciept();
      break;
      }
     
        
          
       }
         }
       
       System.out.println("\n Order has Completed! Ready to start a new order?(Y/n)");
           response = user_input.next().charAt(0);
           if(response =='n'||response=='n')
           {
   
              System.out.println("Thank you! Have a great Day!");
              n=1;
           }
           
     } 
        // TODO code application logic here
        
      
    }   

}
