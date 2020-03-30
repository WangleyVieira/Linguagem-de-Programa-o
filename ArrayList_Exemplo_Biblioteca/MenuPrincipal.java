
package ArrayList_Exemplo;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuPrincipal {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        ArrayList<Pessoa> listaPessoas = new ArrayList<>();//criando objeto listaPessoas ArrayList
        ArrayList<Livro> listaLivro = new ArrayList<>(); //criando objeto listaLivro ArrayList
        ArrayList<Emprestimo> emprestimos = new ArrayList<>();//criando objeto emprestimos ArrayList
        
        int idPessoa, posicaoLivro, idLivro;
        System.out.println("B I B L I O T E C A");
        byte opcao;
        do{
            System.out.println("-------------------------------------------");
            System.out.println("1 - Criar uma pessoa");
            System.out.println("2 - Visualizar todos as pessoas");
            System.out.println("3 - Criar um livro");
            System.out.println("4 - Visualizar todos os livros");
            System.out.println("5 - Realizar um emprestimo");
            System.out.println("6 - Visualizar todos os emprestimos");
            System.out.println("7 - Realizar a devolucao de um emprestimo");
            System.out.println("8 - Sair");
            System.out.println("-------------------------------------------");
            
            System.out.print("=> ");
            opcao = leitor.nextByte();
            //int posicaoPessoa;
            switch(opcao){
                case 1://criando objeto pessoa
                    System.out.print("Informe o nome: ");
                    String nome = leitor.next();
                    System.out.println("Informe o tipo(A - aluno/ P - professor): ");
                    char tipo = leitor.next().charAt(0);
                    
                    Pessoa objetoPessoa = new Pessoa(nome, tipo); //criando objeto objetoPessoa
                    listaPessoas.add(objetoPessoa);
                    //listaPessoas.add(new Pessoa(nome, cpf));
                    break;
                    
                case 2://visualizar todos as pessoas
                    for (int i = 0; i < listaPessoas.size(); i++) {
                        listaPessoas.get(i).printAll();
                        System.out.println("");
                    }
                    break;
                    
                case 3://criar objeto livro
                    System.out.print("Nome do livro: ");
                    String nomeLivro = leitor.next();
                    System.out.print("Ano de lancamento: ");
                    int ano = leitor.nextInt();
                    System.out.print("Quantidade de exemplares disponiveis: ");
                    int qtdDisponivel = leitor.nextInt();
                    
                    Livro objetoLivro = new Livro(nomeLivro, ano, qtdDisponivel);//objeto livro
                    
                    listaLivro.add(objetoLivro); 
                    break;
                    
                case 4://visualizar todos os livros
                    for (int i = 0; i < listaLivro.size(); i++) {
                        System.out.println("Livro = "+i+": ");
                        listaLivro.get(i).printAll();
                        System.out.println("");
                    }
                    break;
                    
                case 5://realizar um emprestimo
                    System.out.print("Informe a posicao da pessoa: ");
                    idPessoa = leitor.nextInt();
                    
                    if(listaPessoas.get(idPessoa).podeEmprestar()){
                        System.out.print("Informe o livro: ");
                        posicaoLivro = leitor.nextInt();
                        if(listaLivro.get(posicaoLivro).podeSerEmprestado()){//verifica a posicaoLivro no ArrayList e caso encontre acessa o 
                            //metodo podeSerEmprestado()
                            
                            Emprestimo emprestimoLivros = new Emprestimo(listaPessoas.get(idPessoa), listaLivro.get(posicaoLivro));
                            //obejeto emprestimoLivros
                            
                            emprestimos.add(emprestimoLivros);//adiciona objeto emprestimosLivros ao ArrayList emprestimos
                            listaPessoas.get(idPessoa).emprestar();//acessa o ArrayList atraves do metodo get() e procura o diPessoa na lista
                            //caso encontre, entao acessa o metodo emprestar() o livro
                            listaLivro.get(posicaoLivro).emprestar();
                            System.out.println("Emprestimo realizado!");
                        }
                        else{
                            System.out.println("Nao possui exemplares do livro");
                        }   
                    }
                    else{
                        System.out.println("A pessoa nao pode fazer emprestimos!");
                    }
                    System.out.println("");
                    break;
                    
                case 6: //visualizar todos os emprestimos
                    System.out.println("\nVisualizando todos os emprestimos");
                    for (int i = 0; i < emprestimos.size(); i++) {
                        System.out.println("");
                        emprestimos.get(i).printAll();
                        System.out.println("");
                    }
                    System.out.println("");
                    break;
                    
                case 7://realizando a devolucao
                    System.out.println("");
                    System.out.print("Informe a posicao da pessoa: ");
                    idPessoa = leitor.nextInt();
                    System.out.print("Informe o livro: ");
                    idLivro = leitor.nextInt();
                    
                    listaPessoas.get(idPessoa).devolver();
                    listaLivro.get(idLivro).devolver();
                    System.out.println("Devolucao com sucesso!");
                    break;
                    
                case 8:
                    System.out.println("Encerrando...");
                    break;
                    
                default:
                    System.out.println("Opcao invalida!");
                    break;
            }
            
        }
        while(opcao != 8);
    }
}
