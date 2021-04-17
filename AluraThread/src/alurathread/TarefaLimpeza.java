/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alurathread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bavaresco
 */
public class TarefaLimpeza implements Runnable {

    private banheiro banheiro1;
    public TarefaLimpeza(banheiro Banheiro)
            {
                this.banheiro1=Banheiro;
            }

    
    
    @Override
    public void run()
    {
        while(true){
            banheiro1.limpa();
            try {
                Thread.sleep(18090);
            } catch (InterruptedException e ) {
                e.printStackTrace();
                        
            }
        }
    }
    
}
