
package ArrayList_Exemplo;

public class Livro {
    private String nome;
    private int anoLancamento;
    private int qtdExemplaresDisponiveis;
    
    public Livro(String nome, int anoLancamento, int qtdExemplaresDisponiveis){
        this.nome = nome;
        this.anoLancamento = anoLancamento;
        this.qtdExemplaresDisponiveis = qtdExemplaresDisponiveis;
    }
    
    public void setNome(String nomeLivro){
        this.nome = nomeLivro;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setAnoLancamento(int anoLancamento){
        this.anoLancamento = anoLancamento;
    }
    
    public int getAnoLancamento(){
        return this.anoLancamento;
    }
    
    public void setQtdExemplaresDisp(int qtdExemplaresEmp){
        this.qtdExemplaresDisponiveis = qtdExemplaresEmp;
    }
    
    public int getQtdExemplaresDisp(){
        return this.qtdExemplaresDisponiveis;
    }
    
    public boolean podeSerEmprestado(){
        if(this.qtdExemplaresDisponiveis > 0){
            return true;
        }
        return false;
    }
    
    public void emprestar(){
        this.qtdExemplaresDisponiveis--;
    }
    
    public void devolver(){
        this.qtdExemplaresDisponiveis++;
    }
    
    public void printAll(){
        System.out.println("Informacao do livro");
        System.out.println("Nome do livro: "+getNome());
        System.out.println("Ano de Lancamento: "+getAnoLancamento());
        System.out.println("Quantidade de exemplares disponiveis: "+getQtdExemplaresDisp());
        System.out.println("");
    }
    
}
