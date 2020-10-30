
package Aula11;


public abstract class Pessoa {
    private int idade;
    private String nome;
    private String sexo;
    
    public void fazerAniversario(){
        this.idade++;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public int getIdade(){
        return this.idade;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public void printAll(){
        System.out.println("Nome: " +this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Sexo: " +this.getSexo());
    }
}
