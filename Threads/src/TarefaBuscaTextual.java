/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bavaresco
 */
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class TarefaBuscaTextual implements Runnable {

    private String assinaturastxt;
    private String nome;
    public TarefaBuscaTextual() {
    }

    public TarefaBuscaTextual(String assinaturastxt, String nome) {
      this.assinaturastxt=assinaturastxt;
      this.nome=nome;
    }
    @Override
    public void run()
    {
        try {
            Scanner entrada= new Scanner(new File(assinaturastxt));
            int numeroDaLinha=1;
            while(entrada.hasNextLine())
            {
                String linha = entrada.nextLine();
                if(linha.contains(nome))
                {
                    System.out.println(assinaturastxt+" - "+numeroDaLinha+" - "+linha);
                }
                numeroDaLinha++;
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        
    }
    
}
