
package SolidosGeometricos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Msv Wangley
 */
public class MenuExecucao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        ArrayList<SolidoGeo> solidos = new ArrayList<>();
        
        int opcao;
        
        boolean terminar = false;
        
        do{
            double altura, raio, lado;
            
            System.out.println("------------------------------------------------");
            System.out.println("M E N U ");
            System.out.println("1 - Criar um cilindro");
            System.out.println("2 - Criar um cone");
            System.out.println("3 - Criar uma piramide");
            System.out.println("4 - Ver volume de todos os solidos geometricos");
            System.out.println("0 - Sair");
            System.out.println("------------------------------------------------\n");
            System.out.print("Opcao: ");
            opcao = leitor.nextInt();
            
            switch(opcao){
                case 1: //Cilindro
                    System.out.print("Altura: ");
                    altura = leitor.nextDouble();
                    System.out.print("Raio: ");
                    raio = leitor.nextDouble();
                    
                    Cilindro cilindro = new Cilindro(altura, raio);
                    
                    solidos.add(cilindro);
                    System.out.println("Adicionado com sucesso!\n");
                    break;
                    
                case 2: //cone
                    System.out.print("Altura: ");
                    altura = leitor.nextDouble();
                    System.out.print("raio: ");
                    raio = leitor.nextDouble();
                    
                    solidos.add(new Cone(altura, raio));
                    System.out.println("Adicionado com sucesso!\n");
                    break;
                    
                case 3: //piramide
                    System.out.print("Altura: ");
                    altura = leitor.nextDouble();
                    System.out.print("lado: ");
                    lado = leitor.nextDouble();
                    
                    solidos.add(new Piramide(altura, lado));
                    System.out.println("Adicionado com sucesso!\n");
                    break;
                    
                case 4: //exibir o volume de todos os solidos geometricos
                    for (int i = 0; i < solidos.size(); i++) {
                        solidos.get(i).printAll();
                        System.out.println("");
                    }
                    break;
                    
                case 0:
                    System.out.println("Encerrando...");
                    terminar = true;
                    break;
                    
                default: 
                    System.out.println("Opcao invalida!");
                    break;
            }
        }
        while(!terminar);
    }
}
