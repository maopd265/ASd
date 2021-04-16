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
    public void fazNumero1()
    {
         String nome = Thread.currentThread().getName();
         System.out.println(nome+"está chamando");
        synchronized(this)
        {
           
            System.out.println(nome+" entrando no banheiro");
            System.out.println(nome+" fazNumero1");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
               e.printStackTrace();
            }
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
        System.out.println(nome+" fazNumero2");
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
           e.printStackTrace();
        }
        System.out.println(nome+"dando a descarga");
        System.out.println(nome+"lavando a mão");
        System.out.println(nome+"Saindo do banheiro");
    }
    }
}
