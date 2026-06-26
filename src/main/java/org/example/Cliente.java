package org.example;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.UUID;

/*
Classe de modelo de dados para clientes
 */
public class Cliente {

    //Atributos do cliente
    public UUID id;
    public String nome;
    public String email;
    public String telefone;
    public String cpf;
    public LocalDateTime dataHoraCadastro;

    //Metodo para salvar os dados do cliente em um arquivo
    public void salvarDados(){

        try{

            var filewriter = new FileWriter("D:\\aula01\\clientes.txt",true);

            //Escrever mo arquivo
            var printWriter = new PrintWriter(filewriter);
            printWriter.println(id);
            printWriter.println(nome);
            printWriter.println(email);
            printWriter.println(telefone);
            printWriter.println(cpf);
            printWriter.println(dataHoraCadastro);
            printWriter.println("**************");

            //Fechando o arquivo
            printWriter.close();

            System.out.println("\nDados gravados com sucesso!");

        } catch (Exception e) {
            System.out.println("\nFalha ao gravar o arquivo");
        }
    }

}
