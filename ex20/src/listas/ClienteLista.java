/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

import classes.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Danilo Abreu
 */
public class ClienteLista {
    private List<Cliente> clientes = new ArrayList<>();
    
    public boolean addCliente(Cliente c){
        if(this.clientes.add(c)){
            return true;
        }else{
            return false;
        }
    }
    public List<Cliente> retornarLista(){
        return clientes;
    }
    
    public void editCliente(int i,String nome, String cpf, String rg, String email, char sexo, String tel){
        this.clientes.get(i).setNome(nome);
        this.clientes.get(i).setCpf(cpf);
        this.clientes.get(i).setRg(rg);
        this.clientes.get(i).setEmail(email);
        this.clientes.get(i).setSexo(sexo);
        this.clientes.get(i).setTelefone(tel);
    }
}
