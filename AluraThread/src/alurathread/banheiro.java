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
public class banheiro {
    
    private boolean ehSujo=true;
    public void fazNumero1()
    {
         String nome = Thread.currentThread().getName();
         System.out.println(nome+"está chamando");
        synchronized(this)
        {
           
            System.out.println(nome+" entrando no banheiro");
            
            while(ehSujo)
            {
                System.out.println(nome+"Saindo do banheiro");
                
                esperaLaFora(nome);
                
                
            }
            
            System.out.println(nome+" fazNumero1");
            
            
            dormeUmPouco(5300);
            this.ehSujo=true;
            System.out.println(nome+"dando a descarga");
            System.out.println(nome+"lavando a mão");
            System.out.println(nome+"Saindo do banheiro");
        }
        
        
    }
    public void fazNumero2()
    {
        String nome = Thread.currentThread().getName();
        System.out.println(nome+" está chamando");
        synchronized(this)
        {
        
        System.out.println(nome+" entrando no banheiro");
        while(ehSujo)
            {
                System.out.println(nome+"Saindo do banheiro");
                
                esperaLaFora(nome);
                
                
            }
            
           
        System.out.println(nome+" fazNumero2");
       
        
        dormeUmPouco(15000);
         this.ehSujo=true;
        System.out.println(nome+"dando a descarga");
        System.out.println(nome+"lavando a mão");
        System.out.println(nome+"Saindo do banheiro");
    }
    }

    
    public void limpa()
    {
         String nome = Thread.currentThread().getName();
        System.out.println(nome+" está chamando");
        synchronized(this)
        {
            if(!ehSujo)
            {
                System.out.println("Não está sujo!");
                return;
            }
            System.out.println(nome+" entrando no banheiro");
            System.out.println(nome+" limpando banheiro");
            this.ehSujo=false;
        
        dormeUmPouco(13000);
         
       
        System.out.println(nome+"dando a descarga");
        System.out.println(nome+"lavando a mão");
         this.notifyAll();
        System.out.println(nome+"Saindo do banheiro");
        
    }
    }

    
    
    private void esperaLaFora(String nome) {
        System.out.println(nome+" Espera lá fora!");
         try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
    }
    
    
    
    public void dormeUmPouco(long millis)
    {
        try {
            Thread.sleep(13000);
        } catch (InterruptedException e) {
           e.printStackTrace();
        }
    }
}
