/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dogs;

/**
 *
 * @author ajay
 */
public class DogDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dog d1 = new Dog("Jimmy", "Poodle", 2);
        Dog d2 = new Dog("Puppy", "Labrador", 31);

        System.out.println(d1.getName());

        d1.setName("Max");
        System.out.println(d1.getName());

        System.out.println(d1.calcAge());
        System.out.println(d1.toString());
    }
}
