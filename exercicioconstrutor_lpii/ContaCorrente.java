
package exercicioconstrutor_lpii;

public class ContaCorrente {
    //atributos
    public Pessoa correntista; //objeto Pessoa 
    public double saldo;
    public String agencia;
    public String numero;
    
    //Construtor
    public ContaCorrente(Pessoa correntista, double saldo, String agencia, String numero){
        this.correntista = correntista;
        this.saldo = saldo;
        this.agencia = agencia;
        this.numero = numero;
    }
    
    public void printAll(){
        System.out.println("Dados do correntista");
        this.correntista.printAll(); //acessa os atributos do objeto Pessoa e imprime-as
        System.out.println("Saldo: "+this.saldo);
        System.out.println("Agencia: "+this.agencia);
        System.out.println("Numero: "+this.numero);
    }
    
    public void deposito(double valor){
        this.saldo += valor;
    }
    
    public boolean saque(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }
        System.out.println("Impossvel sacar!");
        return false;
    }
    
    public boolean transferencia(double valor, ContaCorrente contaDestino){
        if(this.saldo >= valor){
            this.saldo -= valor;
            contaDestino.saldo += valor;//acessando o saldo e acrescentando o valor
            return true;
        }
        return false;
    }
}
