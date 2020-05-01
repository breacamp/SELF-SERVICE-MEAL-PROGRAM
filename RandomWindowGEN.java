/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myutility;

import java.util.Random;

/**
 *
 * @author 18062
 */
public class RandomWindowGEN {
    
    //create an object of SingleObject
   private static  RandomWindowGEN instance = new  RandomWindowGEN();

   //make the constructor private so that this class cannot be
   //instantiated
   private  RandomWindowGEN(){}

   //Get the only object available
   public static  RandomWindowGEN getInstance(){
      return instance;
   }

   public void showMessage()
   {
     Random rand = new Random(); 
  
        // Generate random integers in range 0 to 10
        int rand_int1 = rand.nextInt(10); 
         
   
        // Print random integers 
        System.out.println("Please pick up your order at window: "+rand_int1); 
   }
    
}
