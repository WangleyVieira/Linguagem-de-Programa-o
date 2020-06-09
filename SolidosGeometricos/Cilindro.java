
package SolidosGeometricos;

/**
 *
 * @author Msv Wangley
 */
public class Cilindro extends SolidoGeo{
    private double altura;
    private double raio;
    
    public Cilindro(double altura, double raio){
        this.altura = altura;
        this.raio = raio;
    }
    
    public double getAltura(){
        return this.altura;
    }
    
    public void setAltura(double altura){
        this.altura = altura;
    }
    
    public double getRaio(){
        return this.raio;
    }
    
    public void setRaio(double raio){
        this.raio = raio;
    }
    
    @Override //metodo abstrato, sobreposicao
    public double volume(){
        return Math.PI * Math.pow(this.getRaio(), 2) * this.getAltura();
    }
    
    @Override
    public void printAll(){
        System.out.println("Cilindro:");
        System.out.println("Altura: "+this.getAltura());
        System.out.println("Raio: "+this.getRaio());
        System.out.printf("Volume: %.4f\n", this.volume());
    }
}
