
package Lista_6;

/**
 *
 * @author Msv Wangley
 */
public class Retangulo {
    private double baseRetangulo;
    private double alturaRetangulo;
    
    //construtor
    public Retangulo(double base, double altura){
        this.baseRetangulo = base;
        this.alturaRetangulo = altura;
    }
    
    public double areaRetangulo(){
        return this.baseRetangulo * this.alturaRetangulo;
    }
    
    public double perimetroRetangulo(){
        return 2 * (this.baseRetangulo + this.alturaRetangulo);
    }
    
    public void setBaseRetangulo(double b){
        this.baseRetangulo = b;
    }
    
    public double getBaseRetangulo(){
        return this.baseRetangulo;
    }
    
    public void setAlturaRetangulo(double h){
        this.alturaRetangulo = h;
    }
    
    public double getAlturaRetangulo(){
        return this.alturaRetangulo;
    }
    
    public void printRetangulo(){
        System.out.println("Base retangulo: "+this.getBaseRetangulo());//largura do retangulo
        System.out.println("Altura retangulo: "+this.getAlturaRetangulo());
        System.out.printf("Area: %.2f", this.areaRetangulo());
        System.out.printf("Perimetro: %.2f", this.perimetroRetangulo());
    }
}
