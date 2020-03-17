/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioconstrutor_lpii;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class MenuPrincipal {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Nome da pessoa 1: ");
        String nome = leitor.next();
        System.out.print("Idade da pessoa 1: ");
        int idade = leitor.nextInt();
        System.out.print("CPF da pessoa 1: ");
        String cpf = leitor.next();
        System.out.print("Numero da conta: ");
        String numeroConta = leitor.next();
        System.out.print("Numero da agencia: ");
        String agencia = leitor.next();
        System.out.print("Saldo da pessoa 1: ");
        double saldo = leitor.nextDouble();
        
        Pessoa pessoa1 = new Pessoa(nome, idade, cpf);//objeto pessoa 1
        ContaCorrente conta1 = new ContaCorrente(pessoa1, saldo, agencia, numeroConta);
        
        System.out.println("--------------------------------------");
        System.out.print("Nome da pessoa 2: ");
        nome = leitor.next();
        System.out.print("Idade pessoa 2: ");
        idade = leitor.nextInt();
        System.out.print("CPF pessoa 2: ");
        cpf = leitor.next();
        System.out.print("Numero da conta: ");
        numeroConta = leitor.next();
        System.out.print("Numero da agencia: ");
        agencia = leitor.next();
        System.out.print("Saldo da pessoa 2: ");
        saldo = leitor.nextDouble();
        
        Pessoa pessoa2 = new Pessoa(nome, idade, cpf);//objeto pessoa 2
        ContaCorrente conta2 = new ContaCorrente(pessoa2, saldo, agencia, numeroConta);

        boolean terminar = false;
        do{
            System.out.println("\n------------------------------------------");
            System.out.println("1 - Depositar na conta 1");
            System.out.println("2 - Sacar na contar 1");
            System.out.println("3 - Transferir da conta 1 para conta 2");
            System.out.println("4 - Ver todos os dados da conta 1");
            System.out.println("5 - Depositar na conta 2");
            System.out.println("6 - Sacar na conta 2");
            System.out.println("7 - Transferir da conta 2 para conta 1");
            System.out.println("8 - Ver todos os dados da conta 2");
            System.out.println("0 - Encerrar");
            System.out.print("Informe a opcao desejada: ");
            int opcao = leitor.nextInt();
            System.out.println("------------------------------------------\n");
            double valor;
            switch(opcao){
                case 1:
                    System.out.print("Informe o valor a ser depositado: ");
                    valor = leitor.nextDouble();
                    conta1.deposito(valor);
                    break;
                case 2:
                    System.out.print("Informe o valor a ser sacado na conta 1: ");
                    valor = leitor.nextDouble();
                    conta1.saque(valor);
                    break;
                case 3:
                    System.out.print("Informe o valor a ser transferido da conta 1 para conta 2: ");
                    valor = leitor.nextDouble();
                    conta1.transferencia(valor, conta2);
                    break;
                case 4:
                    conta1.printAll();
                    break;
                case 5:
                    System.out.print("Informe o valor a ser depositado: ");
                    valor = leitor.nextDouble();
                    conta2.deposito(valor);
                    break;
                case 6:
                    System.out.print("Informe o valor a ser sacado na conta 2: ");
                    valor = leitor.nextDouble();
                    conta2.saque(valor);
                    break;
                case 7:
                    System.out.println("Dados da Conta Corrente 1: ");
                    conta1.printAll();
                    
                    System.out.println("Dados da Conta Corrente 2: ");
                    conta2.printAll();
                    
                    System.out.print("Informe o valor a ser transferido da conta 2 para conta 1: ");
                    valor = leitor.nextDouble();
                    conta2.transferencia(valor, conta2);
                    break;
                case 8:
                    conta2.printAll();
                    break;
                case 0:
                    terminar = true;
                    System.out.println("Encerrando..");
                    break;
                default:
                    System.out.println("Opcao Invalida!!!");
                    break;
            }
        }
        while(!terminar);
        
    }
}
