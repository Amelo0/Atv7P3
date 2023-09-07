package Ficha07;
import java.util.Scanner;
public class questao5 {
    //ATRIBUTOS
    private String nome;
    private String cpf;
    private double nota1, nota2, nota3, nota4, calculoMedia;

    //CONSTRUTORES
    public questao5(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }
    public questao5(double calculoMedia){
        this.calculoMedia = calculoMedia;
    }

    //SETTERS E GETTES DO RETORNO DO VALOR DO METHODO
    public double getCalculoMedia() {
        return calculoMedia;
    }
    public void setCalculoMedia(double calculoMedia) {
        this.calculoMedia = calculoMedia;
    }

    //SETTERS E GETTERS DAS NOTAS
    public double getNota1() {
        return nota1;
    }
    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }
    public double getNota2() {
        return nota2;
    }
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    public double getNota3() {
        return nota3;
    }
    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }
    public double getNota4() {
        return nota4;
    }
    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }

    public double media(double nota1, double nota2, double nota3, double nota4) {
        double c = (nota1+nota2+nota3+nota4)/4;
        return c;
    }

    //METODO MAIN PRA CHAMAR OS COMANDOS
    public static void main(String[] args) {
        //DECLARAÇÕES
        Scanner in = new Scanner(System.in);

        //INICIAR OBJ ALUNO
        questao5 aluno = new questao5("Augusto", "12345678-00");

        //INSERIR NOTAS
        System.out.println("Nota 1: ");
        aluno.setNota1(in.nextDouble());
        System.out.println("Nota 2: ");
        aluno.setNota2(in.nextDouble());
        System.out.println("Nota 3: ");
        aluno.setNota3(in.nextDouble());
        System.out.println("Nota 4: ");
        aluno.setNota4(in.nextDouble());

        //DETERMINAR A MEDIA E SALVAR VALOR
        aluno.setCalculoMedia(aluno.media(aluno.nota1, aluno.nota2, aluno.nota3, aluno.nota4));

        //EXIBIR
        System.out.println(aluno.getCalculoMedia());

        //7 QUESITO
        System.out.println("Altere a nota 2: ");
        aluno.setNota2(in.nextDouble());
        //DETERMINAR A MEDIA E SALVAR VALOR 2
        aluno.setCalculoMedia(aluno.media(aluno.nota1, aluno.nota2, aluno.nota3, aluno.nota4));
        //EXIBIR 2
        System.out.println("Nova nota: " + aluno.getCalculoMedia());

        }
    }