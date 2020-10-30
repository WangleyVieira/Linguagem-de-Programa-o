
package Lista_6;

/**
 *
 * @author Msv Wangley
 */
public class Circulo {
    private double raio; 

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    //metodo que calcula a area do circulo
    public double area() {
        return Math.PI * Math.pow(this.raio, 2);
    }
    //metodo que calcula o perimetro do circulo
    public double perimetro() {
        return 2 * Math.PI * this.raio;
    }
    
    public void printCirculo() {
        System.out.println("Raio: " + this.getRaio());
        System.out.printf("Área: %.2f\n", this.area());
        System.out.printf("Perímetro: %.2f\n", this.perimetro());
    }   
    
}
