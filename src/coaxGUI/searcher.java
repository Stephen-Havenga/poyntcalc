package coaxGUI;


import java.awt.HeadlessException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner ;
import javax.swing.JOptionPane;


public class searcher {

    /**
     * @param args the command line arguments
     */
    private static Scanner x;
    
    public static void main(String[] args) {
        String filepath = "C:\\Users\\Stephen\\Desktop\\New Folder\\newfile.txt" ;
        String searchTerm = "hyla" ;
        
        
        readRecord(filepath,searchTerm) ;
    
    }
    
    public static void readRecord(String filepath, String searchTerm){
        boolean found = false ;
        String Name ="";
        String Food = "" ;
        String Drink = "" ;
        
        try{
            x = new Scanner(new FileReader(filepath)) ;
            x.useDelimiter("[,\n]") ;
            
            while (x.hasNext() && found==false){
                Name = x.next() ;
                //JOptionPane.showMessageDialog(null,"Name: "+Name) ;
                Food =x.next() ;
                Drink = x.next() ;
                
                if(Name.equals(searchTerm)){
                    found = true ;
                }
            }
            if(found){
                JOptionPane.showMessageDialog(null,"Name: "+Name+" Food: "+Food+" Drink: "+Drink) ; 
            }
        }
        catch(HeadlessException | FileNotFoundException e){
           JOptionPane.showMessageDialog(null,"Error didnt open") ;
        }
    }
  
    
} 