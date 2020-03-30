
package ArrayList_Exemplo;

public class Pessoa {
    private String nome;
    private char tipo;
    private int qtdLivrosEmprestados;
    
    //Construtor
    public Pessoa(String nome, char tipo){
        this.nome = nome;
        this.tipo = tipo;
    }
    
    //Metodos Get e Set
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public boolean setTipo(char tipo){
        if(this.tipo == 'A' || this.tipo == 'P'){
            return false;
        }
        this.tipo = tipo;
        return true;
    }
    
    public char getTipo(){
        return this.tipo;
    }
    
    public int getQtdLivrosEmprestados(){
        return this.qtdLivrosEmprestados;
    }
    
    public boolean podeEmprestar(){
        if(this.qtdLivrosEmprestados < 5 && this.tipo == 'P' || this.tipo == 'p'){
            return true;
        }
        else{
            if(this.qtdLivrosEmprestados < 3 && this.tipo == 'A' || this.tipo == 'a'){
                return true;
            }
        }
        return false;
    }
    
    public void emprestar(){
        this.qtdLivrosEmprestados++;
    }
    
    public void devolver(){
        this.qtdLivrosEmprestados--;
    }
    
    public void printAll(){
        System.out.println("Informacoes da pessoa");
        System.out.println("Nome: "+getNome());
        System.out.println("Tipo: "+getTipo());
        System.out.println("Quantidade de livros emprestados: "+getQtdLivrosEmprestados());
    }
}
