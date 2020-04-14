
package Aula11;

public class Professor extends Pessoa{
    private String especialidade;
    private float salario;
    
    public final void receberAumento(float aumento){
        this.salario = aumento;
    }
    
    public void setEspecialidade(String especialidade){
        this.especialidade = especialidade;
    }
    
    public String getEspecialidade(){
        return this.especialidade;
    }
    
    public void setSalario(float salario){
        this.salario = salario;
    }
    
    public float getSalario(){
        return this.salario;
    }
    
    public void printProfessor(){
        this.printAll();
        System.out.println("Salario: "+this.getSalario());
        System.out.println("Especialidade: "+this.getEspecialidade());
    }
}
