
package Lista_6;

/**
 *
 * @author Msv Wangley
 */
public class Quadrado {
    private double ladoQuadrado;
    
    //Construtor
    public Quadrado(double lado){
        this.ladoQuadrado = lado;
    }
    
    public double areaQuadrado(){
        return Math.pow(this.ladoQuadrado, 2); //calcula a raiz quadrada do lado do quadrado
    }
    
    public double perimetroQuadrado(){
        return 4 * this.ladoQuadrado;
    }
    
    public double diagonalQuadrado(){
         return this.ladoQuadrado * (Math.sqrt(this.ladoQuadrado));
    }
    //metdos Gettters e Setters
    public void setLadoQuadrado(double ladoQuadrado){
        this.ladoQuadrado = ladoQuadrado;
    }
    
    public double getLadoQuadrado(){
        return this.ladoQuadrado;
    }
    
    public void printQuadrado(){
        System.out.println("Lado: "+this.getLadoQuadrado());
        System.out.printf("Area: %.2f\n", this.areaQuadrado());//impressao formatada em 2 casas decimais pos virgula
        System.out.printf("Perimetro: %.2f\n", this.perimetroQuadrado());
        System.out.printf("Diagonal do quadrado: %.2f\n", this.diagonalQuadrado());
    }
}
