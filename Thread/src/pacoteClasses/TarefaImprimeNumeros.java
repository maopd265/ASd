/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacoteClasses;

/**
 *
 * @author Bavaresco
 */
public class TarefaImprimeNumeros implements Runnable {
    @Override
    public void run()
    {
        
        for(int i=0;i<1000;i++)
        {
            Thread threadAtual = Thread.currentThread();
            System.out.println("Thread Atual:"+threadAtual.getId()+" - "+i);
        }
    }
    
}
