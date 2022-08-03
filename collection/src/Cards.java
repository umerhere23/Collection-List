


import java.util.Scanner;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sp20-bse-055
 */
public class Cards {
     public static void main(String[] args){
       
          ListInterface<String> name;
        name=  new ABList<String>(3);
        System.out.println("Enter Name");
     
      
         
             Scanner scan  = new Scanner(System.in);
        String n = scan.nextLine();
          
    name.add(n);
      
        String n1 = scan.nextLine();
    name.add(n1);
    
         System.out.println(name.size());
       }
}
