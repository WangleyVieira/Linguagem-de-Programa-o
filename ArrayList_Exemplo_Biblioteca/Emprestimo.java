
package ArrayList_Exemplo;


public class Emprestimo {
    private Pessoa pessoa;
    private Livro livro;
    
    public Emprestimo(Pessoa pessoa, Livro livro){
        this.pessoa = pessoa;
        this.livro = livro;
    }
    
    public void serPessoa(Pessoa pessoa){
        this.pessoa = pessoa;
    }
    public Pessoa getPessoa(){ //retorna objeto do tipo Pessoa
        return this.pessoa;
    }
    public void setLivro(Livro emprestarLivro){
        this.livro = emprestarLivro;
    }
    public Livro getLivro(){
        return this.livro;
    }
    public void printAll(){
        System.out.println("Informacoes do emprestimo");
        //this.pessoa.printAll();
        System.out.println("Pessoa: "+getPessoa().getNome());
        System.out.println("Livro emprestado: "+getLivro().getNome());
    }
}
