
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ajay
 */
public class GadgetDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        
        for(int i = 0; i<6; i++){
            for(int j=0; j<i; j+=2){
                System.out.print(i+j);
            }
            System.out.println();
        }
        Scanner scan = new Scanner(new File("input.txt"));
        PrintWriter printer = new PrintWriter(new File("myOutput.txt"));
        while(scan.hasNext()){
            int id = scan.nextInt();
            System.out.println("id: "+id);
            printer.println("id: "+id);
            
            double price = scan.nextDouble();
            System.out.println("price: "+price);
            printer.println("price: "+price);
            
            String name = scan.nextLine();
            System.out.println("name: "+name.trim());
            printer.println("name: "+name.trim());
            
            Gadget g = new Gadget(id, price, name);
            System.out.println(g);
            printer.println(g);
        }
        printer.close();
    }
    
    
}
