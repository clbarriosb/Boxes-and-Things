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
public class CD implements ToBeStored {
    String artist;
    String title;
    int publishingYear;
    double weight = 0.1;
    
    @Override
    public double weight(){
       return this.weight;
    }
    
    public CD (String artist, String title, int publishingYear){
        this.artist = artist;
        this.title = title;
        this.publishingYear = publishingYear;
    }
    
    public String getArtist () {
        return this.artist;
    }
    
     public String getTitle () {
        return this.title;
    } 
     
    public int getPublishingYear() {
        return this.publishingYear;
    }
    
    @Override
    public String toString(){
        return this.getArtist() + ": " + this.getTitle() + " (" + 
                this.getPublishingYear() + ")"; 
    }
}
