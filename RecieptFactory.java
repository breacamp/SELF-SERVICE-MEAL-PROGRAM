/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myutility;

/**
 *
 * @author 18062
 */
public class RecieptFactory {
    	
   //use getShape method to get object of type shape 
   public Reciept getShape(String RecieptType){
      if(RecieptType == null){
         return null;
      }		
      if(RecieptType.equalsIgnoreCase("Text")){
         return new Text();
         
      } else if(RecieptType.equalsIgnoreCase("Email")){
         return new Email();
         
      } else if(RecieptType.equalsIgnoreCase("Print")){
         return new Print();
      }
      
      return null;
   }
    
}
