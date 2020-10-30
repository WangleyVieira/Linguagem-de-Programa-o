
package Lista_6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Msv Wangley
 */
public class MenuPrincipalFigurasGeo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        ArrayList<Circulo> listaCirculo = new ArrayList<>();
        ArrayList<Quadrado> listaQuadrado = new ArrayList<>();
        ArrayList<Retangulo> listaRetangulo = new ArrayList<>();
        
        boolean terminar = false;
        int opcao, escolherFigura, posicao;
        double lado, raio, base, altura, nBase, nAltura, nRaio;
        do{
            System.out.println("------------------------------");
            System.out.println("1 - Adicionar figura geometrica");
            System.out.println("2 - Alterar figura geometrica");
            System.out.println("3 - Remover figura geometrica");
            System.out.println("4 - Visualizar figura geometrica");
            System.out.println("5 - Sair");
            System.out.println("------------------------------");
            System.out.print("=> ");
            opcao = leitor.nextInt();
            
            switch(opcao){
                case 1: //adicionar figura geometrica
                    System.out.println("************************");
                    System.out.println("1 - Quadrado");
                    System.out.println("2 - Circulo");
                    System.out.println("3 - Retangulo");
                    System.out.println("************************");
                    System.out.print("Informe a figura a ser adicionada: ");
                    escolherFigura = leitor.nextInt();
                    
                    switch(escolherFigura){
                        case 1: //adicionar quadrado
                            System.out.print("Informe o tamanho do lado: ");
                            lado = leitor.nextDouble();
                        
                            listaQuadrado.add(new Quadrado(lado));//instanciamento do objeto Quadrado no add do arraylist
                        
                            System.out.println("Quadrado adicionado!\n");
                            break;
                            
                        case 2: //adicionar circulo
                            System.out.print("Informe o tamanho do raio: ");
                            raio = leitor.nextDouble();
                        
                            Circulo circulo = new Circulo(raio);
                        
                            listaCirculo.add(circulo);
                            System.out.println("Circulo adicionado\n");
                            break;
                            
                        case 3: //adicionar retangulo
                            System.out.print("Base: ");
                            base = leitor.nextDouble();
                            System.out.print("Altura: ");
                            altura = leitor.nextDouble();
                            Retangulo retangulo = new Retangulo(base, altura);
                        
                            listaRetangulo.add(retangulo);
                            System.out.println("Circulo adicionado");
                            break;
                            
                        default:
                            System.out.println("Opcao Invalida!");
                            break;
                    }
                    
                case 2: //alterar figura geometrica
                    System.out.println("************************");
                    System.out.println("1 - Quadrado");
                    System.out.println("2 - Circulo");
                    System.out.println("3 - Retangulo");
                    System.out.println("************************");
                    System.out.print("Informe a figura a ser alterada: ");
                    escolherFigura = leitor.nextInt();
                    
                    switch(escolherFigura){
                        case 1: //alterar quadrado
                            System.out.print("Informe a posicao do quadrado: ");
                            posicao = leitor.nextInt();
                            
                            if(posicao >= 0 && posicao < listaQuadrado.size()){
                                System.out.print("Informe o novo lado: ");
                                lado = leitor.nextDouble();
                                //acessando a listaQuadrado por meio do indice do ArrayList e alterando o lado do quadrado
                                listaQuadrado.get(posicao).setLadoQuadrado(lado);
                                System.out.println("Alterado com sucesso!\n");
                            }
                            else{
                                System.out.println("Posicao invalida!\n");
                            }
                        break;
                        
                        case 2: //alterar circulo
                            System.out.print("Informe a posicao do circulo: ");
                            posicao = leitor.nextInt();
                            
                            if(posicao >= 0 && posicao < listaCirculo.size()){
                                System.out.print("Informe o novo raio: ");
                                nRaio = leitor.nextDouble();
                            
                                listaCirculo.get(posicao).setRaio(nRaio);
                                System.out.println("Alterado com sucesso!\n");
                            }
                            else{
                                System.out.println("Posicao invalida!\n");
                            }
                            break;
                            
                        case 3://alterar retangulo
                            System.out.print("Informe a posicao do retangulo: ");
                            posicao = leitor.nextInt();
                            
                            if(posicao >= 0 && posicao < listaRetangulo.size()){
                                System.out.print("Informe a nova base: ");
                                nBase = leitor.nextDouble();
                                System.out.print("Informe a nova altura: ");
                                nAltura = leitor.nextDouble();

                                listaRetangulo.get(posicao).setBaseRetangulo(nBase);
                                listaRetangulo.get(posicao).setAlturaRetangulo(nAltura);
                                System.out.println("Alterado com sucesso!\n");
                            }
                            else{
                                System.out.println("Posicao invalida!\n");
                            }
                            break;
                            
                        default:
                            System.out.println("Opcao Invalida!");
                            break;
                    }
                    
                case 3: //remover figura geometrica
                    System.out.println("************************");
                    System.out.println("1 - Quadrado");
                    System.out.println("2 - Circulo");
                    System.out.println("3 - Retangulo");
                    System.out.println("************************");
                    System.out.print("Informe a figura a ser removida: ");
                    escolherFigura = leitor.nextInt();
                    
                    switch(escolherFigura){
                        case 1: //remover quadrado
                            System.out.print("Informe a posicao do quadrado a ser removido: ");
                            posicao = leitor.nextInt();
                        
                            if(posicao >= 0 && posicao < listaQuadrado.size()){
                                listaQuadrado.remove(posicao);
                                System.out.println("Quadrado removido\n");
                            }
                            else{
                                System.out.println("Posicao invalida!\n");
                            }
                            break;
                            
                        case 2://remover circulo
                            System.out.print("Informe a posicao do circulo a ser removido: ");
                            posicao = leitor.nextInt();
                            if(posicao >= 0 && posicao < listaCirculo.size()){
                                listaQuadrado.remove(posicao);
                                System.out.println("Circulo removido\n");
                            }
                            else{
                                System.out.println("Posicao invalida!\n");
                            }
                            break;
                            
                        case 3: //remover retangulo
                            System.out.print("Informe a posicao do retangulo a ser removido: ");
                            posicao = leitor.nextInt();
                            if(posicao >= 0 && posicao < listaQuadrado.size()){
                                listaRetangulo.remove(posicao);
                                System.out.println("Retangulo removido\n");
                            }
                            else{
                                System.out.println("Posicao invalida!\n");
                            }
                            break;
                            
                        default:
                            System.out.println("Opcao Invalida!");
                            break;
                    }

                    
                case 4: //visualizar figuras geometricas
                    System.out.println("************************");
                    System.out.println("1 - Quadrado");
                    System.out.println("2 - Circulo");
                    System.out.println("3 - Retangulo");
                    System.out.println("************************");
                    System.out.print("Informe a figura a ser visualizada: ");
                    escolherFigura = leitor.nextInt();
                    
                    if(escolherFigura == 1){ //visualizar quadrado
                        if(listaQuadrado.isEmpty()){//caso a lista quadrado esteja vazio
                            System.out.println("Nenhum quadrado inserido!");
                        }
                        
                        for (int i = 0; i < listaQuadrado.size(); i++) {
                            System.out.println("Quadrado ["+i+" ]:");
                            listaQuadrado.get(i).printQuadrado();
                            System.out.println("");
                        }
                    }
                    if(escolherFigura == 2){ //visualizar circulo
                        if(listaCirculo.isEmpty()){ //se a lista estiver vazio
                            System.out.println("Nenhum circulo inserido!");
                        }
                        
                        for (int i = 0; i < listaCirculo.size(); i++) {
                            System.out.println("Circulo ["+i+" ]:");
                            listaCirculo.get(i).printCirculo();
                            System.out.println("");
                        }
                    }
                    if(escolherFigura == 3){ //visualizar retangulo
                        if(listaRetangulo.isEmpty()){
                            System.out.println("Nenhum retangulo inserido!");
                        }
                        for (int i = 0; i < listaRetangulo.size(); i++) {
                            System.out.println("Retangulo ["+i+" ]:");
                            listaRetangulo.get(i).printRetangulo();
                            System.out.println("");
                        }
                    }
                    break;
                    
                case 5: //encerrar o programa
                    System.out.println("Saindo...");
                    terminar = true;
                    break;
                    
                default:
                    System.out.println("Opcao invalida meu chapa!");
                    break;
            }
        }while(!terminar);
    }
}
