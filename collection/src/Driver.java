/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sp20-bse-081
 */

import static java.lang.System.exit;
import java.util.Scanner;

public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       collectionInterface<String> Test ;
       Test = new ArrayCollection<String>();
     
       String line;
       
       Scanner scan = new Scanner(System.in);
        System.out.println("Enter Name 1");
       line = scan.nextLine();
     
       Test.add(line);
       System.out.println("Enter Name  2");
        String line2 = scan.nextLine();
         Test.add(line2);
          System.out.println("Enter Name  3");
        String line3 = scan.nextLine();
         Test.add(line3);
        System.out.println("Size is "+Test.size());
        System.out.println("\n"+"*** Menu ***");
        System.out.println("*****Enter 1 To Clear");
          System.out.println("****Enter 2 To Display String");
           System.out.println("*Enter 3 To Concat");
           System.out.println("****Enter 4 To End Program");
          
          String a = scan.nextLine();
      System.out.println("LIst is Clear Size Is "+Test.size());
         int b = Integer.parseInt(a);
           if(b==1){ 
               Test.removeall();
               System.out.println("LIst is Clear Size Is "+Test.size());
           }
         
           else if(b==2){
               System.out.println("String To String");
               System.out.println(line+"\n"+line2+"\n"+line3);}
           else if(b==3){
               String i;
               
     System.out.println("Enter Name 1");
     String  line5 = scan.nextLine();
      System.out.println("Enter Name 2");
     String  line6 = scan.nextLine();
     i= line5.concat(line6);   
               System.out.println("By Concating  Return Value is"+i);   }
       else if(b==4){
               exit(0);
           }
     
           else{
               System.out.println("Please Select any one option");
           }
            
    }
    
}
