
package SolidosGeometricos;

/**
 *
 * @author Msv Wangley
 */
public class Cone extends SolidoGeo{
    private double altura;
    private double raio;
    
    public Cone(double altura, double raio){
        this.altura = altura;
        this.raio = raio;
    }
    
    public double getAltura(){
        return this.altura;
    }
    
    public void setAltura(double a){
        this.altura = a;
    }
    
    public double getRaio(){
        return this.raio;
    }
    
    public void setRaio(double r){
        this.raio = r;
    }
    
    @Override
    public double volume(){
        return (Math.PI * Math.pow(this.getRaio(), 2) * this.getAltura() / 3);
    }
    
    @Override
    public void printAll(){
        System.out.println("Cone: ");
        System.out.println("Altura: "+this.getAltura());
        System.out.println("Raio: "+this.getRaio());
        System.out.printf("Volume: %.4f\n", this.volume());
    }
}
