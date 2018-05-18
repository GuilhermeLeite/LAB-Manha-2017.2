
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Danilo Abreu
 */
public class ExpressoesRegulares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String texto;
        System.out.print("Texto ");
        texto= s.nextLine();
        
        String cep = "\\d{5}-?\\d{3}";
        
        System.out.println(texto.matches("[A-Z][a-z]+\\s+[A-Z]+"));
    }
    
}
