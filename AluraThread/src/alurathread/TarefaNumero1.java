/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alurathread;

/**
 *
 * @author Bavaresco
 */
public class TarefaNumero1 implements Runnable {

    private banheiro banheiro1;
    
    public TarefaNumero1(banheiro Banheiro)
            {
                this.banheiro1=Banheiro;
            }
    
    @Override
    public void run()
    {
        banheiro1.fazNumero1();
    }
    
}
