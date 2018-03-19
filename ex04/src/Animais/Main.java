/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animais;

/**
 *
 * @author danil
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    static void som(Animal a){
        a.emitirSom();
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        Cachorro dog = new Cachorro();
        Cavalo pocoto = new Cavalo();
        Preguica soneca = new Preguica();
        System.out.println("emitindo som");
        som(dog);
        som(pocoto);
        som(soneca);
        System.out.println("");
        System.out.println("veterinario");
        Veterinario vet = new Veterinario();
        vet.examinar(dog);
        vet.examinar(pocoto);
        vet.examinar(soneca);
        System.out.println("");
        System.out.println("Zoo");
        Zoo z = new Zoo();
        z.addAnimal(dog);
        z.addAnimal(pocoto);
        z.addAnimal(soneca);
        z.imprimirJaulas();
    }
    
}
