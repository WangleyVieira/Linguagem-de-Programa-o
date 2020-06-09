
package SolidosGeometricos;

/**
 *
 * @author Msv Wangley
 */
public class Piramide extends SolidoGeo{
    private double altura;
    private double lado;
    
    public Piramide(double altura, double lado){
        this.altura = altura;
        this.lado = lado;
    }
    
    public double getAltura(){
        return this.altura;
    }
    
    public void setAltura(double altura){
        this.altura = altura;
    }
    
    public double getLado(){
        return this.lado;
    }
    
    public void setLado(double lado){
        this.lado = lado;
    }
    
    @Override
    public double volume(){
        return (Math.pow(this.getLado(), 2) * this.getAltura()) / 3;
    }
    
    @Override
    public void printAll(){
        System.out.println("Piramide: ");
        System.out.println("Altura: "+this.getAltura());
        System.out.println("Lado: "+this.getLado());
        System.out.printf("Volume: %.4f\n", this.volume());
    }
}
