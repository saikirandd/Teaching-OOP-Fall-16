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
public class Dog {
    private String name;
    private String breed;
    private double age;
    
    public Dog(){
        
    }
    
    public Dog(String nameIn, String breedIn, double ageIn){
        name = nameIn;
        breed = breedIn;
        age = ageIn;
    }
    
    public String getName(){
        return name;
    }
    
    public String getBreed(){
        return breed;
    }
    
    public double getAge(){
        return age;
    }
    
    public void setName(String nameIn){
        name = nameIn;
    }
    
    public void setBreed(String breedIn){
        breed = breedIn;
    }
    
    public void setAge(double ageIn){
        age = ageIn;
    }
    
    public double calcAge(){
        return age*2;
    }
    
    public String toString(){
        return name+" "+breed+" "+age;
    }
}
