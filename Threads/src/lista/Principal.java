/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author Bavaresco
 */
public class Principal {
    public static void main(String[] args) throws InterruptedException {

         
        //List<String> listaUm= Collections.synchronizedList(new ArrayList<String>());
        //List<String> listaUm= new Vector<String>();
        lista listaUm= new lista();
        for (int i = 0; i < 10; i++) {

            Thread threadUm=new Thread(new TarefaAdicionarElemento(listaUm,i));
            threadUm.start();
        } 
        
        
        
        
       new Thread(new TarefaImprimir( listaUm)).start();
        
        Thread.sleep(10000);
        
            
        

    } 

} 