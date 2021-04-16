/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;


public class lista {
    private String[] elementos = new String[1000];
    private int indice = 0;

    public void adicionaElementos(String elemento) {
        synchronized(this){
        this.elementos[indice] = elemento;
        this.indice++;
    } 
}
    public int tamanho() {
        return this.elementos.length;
    }

    public String pegaElemento(int posicao) {
        return this.elementos[posicao];
    }
}
