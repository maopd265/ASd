/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

import java.util.List;

/**
 *
 * @author Bavaresco
 */
public class TarefaAdicionarElemento implements Runnable
{
    private List<String> listaUm;
    int numeroDoThread;
    public TarefaAdicionarElemento(List<String> listaUm,int numeroDoThread)
    {
        this.listaUm=listaUm;
        this.numeroDoThread=numeroDoThread;
        
    }
    
    
    @Override
    public void run()
    {
        for (int i = 0; i < 100 ; i++) {
            listaUm.add("Thread "+numeroDoThread + " - " + i);
            
        }
    }
    
}
