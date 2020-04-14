
package Aula11;

public final class AlunoTecnico extends Aluno{
    private String regimeProfissional;
    
    public final void praticar(){
        System.out.println("O aluno está atuando na area; " +this.getNome());
    }
    
    public void setRegimeProfissional(String umNome){
        this.regimeProfissional = umNome;
    }
    
    public String getNome(){
        return this.regimeProfissional;
    }
}
