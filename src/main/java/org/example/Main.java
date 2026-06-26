package org.example;

import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.UUID;


public class Main {
    static void main() {

        System.out.println("\nSISTEMA DE CADASTRO DE CLIENTES.");
        System.out.println("\nPreencha os dados do cliente:");

        //Criando um objeto para usarmos a classe Scanner do java
        var scanner = new Scanner(System.in);

        //Criando um objeto para acessar o conteudo da classe cliente
        var cliente = new Cliente();

        cliente.id = UUID.randomUUID();
        cliente.dataHoraCadastro = LocalDateTime.now();

        System.out.print("\nInforme o nome do cliente......: ");
        cliente.nome = scanner.nextLine();
        System.out.print("\nInforme o email do cliente.....: ");
        cliente.email = scanner.nextLine();
        System.out.print("\nInforme o telefone do cliente..: ");
        cliente.telefone = scanner.nextLine();
        System.out.print("\nInforme o cpf do cliente.......: ");
        cliente.cpf = scanner.nextLine();
        System.out.println("\nDados do Cliente: " + "\nID do cliente: " + cliente.id  +"\nNome do cliente: "
                           + cliente.nome +"\nEmail do cliente: " + cliente.email +"\nCPF do cliente: "
                           + cliente.cpf +"\nTelefone do cliente: " + cliente.telefone +"\nData e hora da criação: "
                           + cliente.dataHoraCadastro);

        //Executando o metodo para salvar os dados do cliente
        cliente.salvarDados();

    }
}
