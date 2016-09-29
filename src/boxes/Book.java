/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxes;

/**
 *
 * @author Carmen_Lucia3
 */
public class Book implements ToBeStored {
    String name;
    String writer;
    double weight;
    
    public Book (String writer, String name, double weight){
        this.writer = writer;
        this.name = name;
        this.weight = weight;
    }
    @Override
    public double weight(){
        return weight;
    }
    
    public String getWriter() {
        return this.writer;
    }
    
    public String getName() {
        return this.name;
    }
     
    @Override
    public String toString() {
        return this.getWriter()+ ": " + this.getName();
    }
    
}
