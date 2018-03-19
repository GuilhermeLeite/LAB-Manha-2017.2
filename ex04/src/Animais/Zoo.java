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
public class Zoo {
    
    private final Animal[] jaula;
    private int n=0;

    public Zoo() {
        //No exercicio constava 10 jaulas. porém, criei com 3 para ficar mais fácil manipulacao
        this.jaula = new Animal[3];
    }
    void addAnimal(Animal a){
        this.jaula[this.n]=a;
        this.n++;
    }

    void imprimirJaulas(){
        for(Animal j:jaula){
            j.emitirSom();
            if(!(j instanceof Preguica)){
                System.out.println("acao");
                j.acao();
            }
        }
    }
}
