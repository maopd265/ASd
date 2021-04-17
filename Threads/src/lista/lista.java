/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

import java.util.logging.Level;
import java.util.logging.Logger;


public class lista {
    private String[] elementos = new String[1000];
    private int indice = 0;

    public void adicionaElementos(String elemento) {
        synchronized(this){
        this.elementos[indice] = elemento;
        this.indice++;
         /*   try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
               e.printStackTrace();
            }*/
        if(this.indice==this.elementos.length)
        {
            System.out.println("lista ta cheia, notificando");
            this.notify();
        }
        
    } 
}
    public int tamanho() {
        return this.elementos.length;
    }

    public String pegaElemento(int posicao) {
        return this.elementos[posicao];
    }

   public boolean estaCheia() {
        
       return this.indice==this.tamanho();
        
    }
}
