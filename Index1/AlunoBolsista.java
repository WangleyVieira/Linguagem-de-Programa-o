
package Aula11;

public final class AlunoBolsista extends Aluno { //classe final, não pode ter mais filho
    private float bolsa;
    
    public final void renovarBolsa(){ //nao pode ser sobreposte, esta definido como classe final
        System.out.println("Renovando bolsa");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
    public void printBolsistas(){
        this.printAll();
    }
    
    @Override //sobrepor
    public void pagarMensalidade(){
        System.out.println("eh bolsista: Pagamento facilidado!");
    }
}
