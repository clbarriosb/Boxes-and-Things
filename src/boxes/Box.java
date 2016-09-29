/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxes;

import java.util.ArrayList;

/**
 *
 * @author Carmen_Lucia3
 */
public class Box implements ToBeStored{
   
    ArrayList<ToBeStored> boxes;
    double maximunWeight;
    double weight;
    
    public Box (double maximunWeight){
        this.boxes = new ArrayList<>();
        this.maximunWeight = maximunWeight;
    }
    
    public int numberOfBoxes() {
        return this.boxes.size();
    }
    
    @Override
    public String toString(){
        return "Box: " + this.numberOfBoxes() + ", total weight: " + 
                this.weight() +" kg";
    }
    
    @Override
    public double weight() {
        this.boxes.stream().forEach((toBeStored) -> {
            weight += toBeStored.weight() ;
        });
         return weight;
    }
    
    public void add(ToBeStored toBeStored) {
        if (this.weight() <= maximunWeight){
            System.out.println("this item cant be placed in this box. "
                    + "No space suficient");
        }
        else{
            this.boxes.add(toBeStored);
        }
        
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Box box = new Box(10);
        Box boxi= new Box(20);

        box.add( new Book("Fedor Dostojevski", "Crime and Punishment", 2.0) ) ;
        box.add( new Book("Robert Martin", "Clean Code", 1.0) );
        box.add( new Book("Kent Beck", "Test Driven Development", 0.7) );

        box.add( new CD("Pink Floyd", "Dark Side of the Moon", 1973) );
        box.add( new CD("Wigwam", "Nuclear Nightclub", 1975) );
        box.add( new CD("Rendezvous Park", "Closer to Being Here", 2012) );
        boxi.add(box);
        boxi.add(new CD("Rendezvous Park", "Closer to Being Here", 2012) );

        System.out.println( box );
        System.out.println(boxi);
    }
    
}
