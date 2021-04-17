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
public class AluraThread {

    
    public static void main(String[] args) {
        banheiro Banheiro = new banheiro();
        Thread convidado1= new Thread(new TarefaNumero1(Banheiro),"Thread 1 ");
        Thread convidado2= new Thread(new TarefaNumero2(Banheiro),"Thread 2 ");
        Thread convidado3= new Thread(new TarefaNumero1(Banheiro),"Thread 3 ");
        Thread convidado4= new Thread(new TarefaNumero2(Banheiro),"Thread 4 ");
        Thread limpeza = new Thread(new TarefaLimpeza(Banheiro),"Limpeza");
        limpeza.setDaemon(true);
        convidado1.start();
        convidado2.start();
        convidado3.start();
        convidado4.start();
        limpeza.start();
        
    }
    
}
