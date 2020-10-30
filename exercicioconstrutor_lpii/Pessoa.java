
package exercicioconstrutor_lpii;

public class Pessoa {
    public String nome;
    public int idade;
    public String cpf;
    
    //Construtor
    public Pessoa(String nome, int idade, String cpf){
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    /*//metodo construtor que realiza a atribuicao dos atributos
    public Pessoa(String nome) {
            this.nome = nome;
    }
    */
    
    public void printAll(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
        System.out.println("CPF: "+this.cpf);
    }
}
