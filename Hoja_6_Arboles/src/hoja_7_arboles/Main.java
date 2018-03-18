
package hoja_7_arboles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeMap;


/**
 *
 * @author Andres
 * @author Antonio
 */
public class Main {
    public static void main(String [] args) throws FileNotFoundException, IOException{
        
        TreeMap<Integer, String> spanish = new TreeMap<>(); // mapa que va a guardar las palabras en espanol
        TreeMap<Integer, String> english = new TreeMap<>(); // mapa que va a guardar las palabras en ingles
        
        File words = new File("C:\\Users\\Antonio\\Documents\\NetBeansProjects\\Lab-7\\Hoja_6_Arboles\\src\\hoja_7_arboles\\palabras");
        FileReader read = new FileReader(words);
        BufferedReader buff = new BufferedReader(read);
        
        String line;
        int contadorYLlave = 0;
        
        while((line = buff.readLine()) != null){
            String[] separate = line.split(",");
            String word_english = separate[0];
            String word_spanish = separate[1];
            
            System.out.println(word_english + " " + word_spanish);
            english.put(contadorYLlave, word_english);
            spanish.put(contadorYLlave, word_spanish);
            contadorYLlave = contadorYLlave + 1;
            //english.add(word_english);
            //  spanish.add(word_spanish);
        } 
        System.out.println("------------------------------------");
        System.out.println("------------------------------------");
        System.out.println(english.get(0) + " " + spanish.get(0));
        System.out.println(english.get(2) + " " + spanish.get(2));
    }
    
}
