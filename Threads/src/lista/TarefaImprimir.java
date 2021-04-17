/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bavaresco
 */
public class TarefaImprimir implements Runnable{
    
    private lista listaUm;
    public TarefaImprimir(lista listaUm)
    {
        this.listaUm=listaUm;
        
    }
    
    @Override
    public void run()
    {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized(listaUm){
            if(!listaUm.estaCheia())
            {
                try {
                    System.out.println("indo esperar, aguardando notificacao");
                    listaUm.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        
        for(int j=0;j<listaUm.tamanho();j++)
            {
            System.out.println(j+" - "+listaUm.pegaElemento(j));
            }
        
        }
        
    }
}
