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
public class Email implements Reciept{

    @Override
    public void reciept() {
        System.out.println("Now emailing your receipt to account on file: ");
    }
    
}
