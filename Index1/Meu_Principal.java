
package Aula11;

import java.util.ArrayList;
import java.util.Scanner;

public class Meu_Principal {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        ArrayList<Aluno> listaAlunos = new ArrayList<>();
        ArrayList<Visitante> listaVisitantes = new ArrayList<>();
        ArrayList<Professor> listaProfessores = new ArrayList<>();
        ArrayList<AlunoBolsista> listaAlunosBolsistas = new ArrayList<>();
        ArrayList<AlunoTecnico> listaAlunosTecnicos = new ArrayList<>();
        
        boolean terminar = false;
        int opcao, escolher, idade, valor;
        String sexo, nome, especialidade;
        float salario;
        do{
            System.out.println("--------------------------");
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Cadastrar professor");
            System.out.println("3 - Cadastrar visitante");
            System.out.println("4 - Visualizar todos os alunos cadastrados");
            System.out.println("5 - Visualizar todos os professores cadastrados");
            System.out.println("6 - Visualizar todos os visitantes");
            System.out.println("7 - Sair");
            System.out.println("--------------------------");
            System.out.println("");
            System.out.print("=> ");
            opcao = leitor.nextInt();
            
            switch(opcao){
                case 1:
                    Aluno aluno = new Aluno(); //criado objeto aluno 
                    
                    System.out.print("Nome: ");
                    nome = leitor.next();
                    aluno.setNome(nome);
                    System.out.print("Idade: ");
                    idade = leitor.nextInt();
                    aluno.setIdade(idade);
                    System.out.print("Sexo: ");
                    sexo = leitor.next();
                    aluno.setSexo(sexo);
                    
                    listaAlunos.add(aluno);//adicionado aluno a lista de alunos
                    //listaAlunos(new Aluno());
                    
                    System.out.println("1 - Bolsista");
                    System.out.println("2 - Técnico");
                    System.out.println("3 - Outro");
                    System.out.println("=> ");
                    escolher = leitor.nextInt();
                    if(escolher == 1){
                        
                        AlunoBolsista bolsista = new AlunoBolsista();
                        listaAlunosBolsistas.add(bolsista);
                        
                        System.out.println("1 - Pagar Mensalidade");
                        System.out.println("2 - Renovador Bolsa");
                        System.out.println("3 - Alterar o valor da bolsa");
                        System.out.print("=> ");
                        escolher = leitor.nextInt();
                        if(escolher == 1){
                            bolsista.pagarMensalidade();
                            break;
                        }
                        if(escolher == 2){
                            bolsista.renovarBolsa();
                            break;
                        }
                        if(escolher == 3){
                            System.out.print("Informe o valor: ");
                            valor = leitor.nextInt();
                            bolsista.setBolsa(valor);
                            break;
                        }
                    }
                    if(escolher == 2){
                        AlunoTecnico tecnico = new AlunoTecnico();
                        tecnico.praticar();
                        break;
                    }
                    break;
                    
                case 2://cadastrar professor
                    Professor professor = new Professor();
                    System.out.print("Nome: ");
                    nome = leitor.next();
                    professor.setNome(nome);
                    System.out.print("Idade: ");
                    idade = leitor.nextInt();
                    professor.setIdade(idade);
                    System.out.print("Sexo: ");
                    sexo = leitor.next();
                    professor.setSexo(sexo);
                    System.out.print("Especialidade: ");
                    especialidade = leitor.next();
                    professor.setEspecialidade(especialidade);
                    System.out.print("Salario: ");
                    salario = leitor.nextFloat();
                    professor.setSalario(salario);
                    
                    listaProfessores.add(professor);
                    break;
                    
                case 3://cadastrar visitante
                    Visitante visitante = new Visitante();
                    
                    System.out.print("Nome: ");
                    nome = leitor.next();
                    visitante.setNome(nome);
                    System.out.print("Idade: ");
                    idade = leitor.nextInt();
                    visitante.setIdade(idade);
                    System.out.print("Sexo: ");
                    sexo = leitor.next();
                    visitante.setSexo(sexo);
                    
                    listaVisitantes.add(visitante);
                    break;
                    
                case 4://visualizar todos os cadastrados no sistema
                    for (int i = 0; i < listaAlunos.size(); i++) {
                        System.out.println("Aluno "+i);
                        listaAlunos.get(i).printAll();
                        System.out.println("");
                    }
                    break;
                    
                case 5: //visualizar professores cadastrados
                    for (int i = 0; i < listaProfessores.size(); i++) {
                        System.out.println("Professor(a): "+i);
                        listaProfessores.get(i).printProfessor();
                        System.out.println("");
                    }
                    break;
                    
                case 6://visualizar todos os visitantes
                    for (int i = 0; i < listaVisitantes.size(); i++) {
                        System.out.println("Visitante: "+i);
                        listaVisitantes.get(i).printAll();
                        System.out.println("");
                    }
                    break;
                    
                case 7: //encerrar o programa
                    System.out.println("Encerrando");
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
