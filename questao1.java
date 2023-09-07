package Ficha07;

import java.util.Scanner;

public class questao1 {
    //atributos
    private String codigo, nome, dataNascimento, sexo, planoSaude, alergia, tipoSanguineo;

    //construtores
    public questao1(String codigo, String nome, String dataNascimento, String sexo, String planoSaude, String alergia, String tipoSanguineo){
        this.codigo = "40028922" ;
        this.nome = "Arthur ";
        this.dataNascimento = "2505";
        this.sexo = "Masculino";
        this.planoSaude = "Plano2024FullHDLegendado";
        this.alergia = "Suor de girafa";
        this.tipoSanguineo = "A-";
    }
    @Override
    public String toString() {
        return "Dados do Paciente, " + nome + ": " + '\n' +
                "==============================" + '\n' +
                "codigo: " + codigo + '\n' +
                "nome: " + nome + '\n' +
                "dataNascimento: " + dataNascimento + '\n' +
                "sexo: " + sexo + '\n' +
                "planoSaude: " + planoSaude + '\n' +
                "alergia: " + alergia + '\n' +
                "tipoSanguineo: " + tipoSanguineo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getPlanoSaude() {
        return planoSaude;
    }

    public void setPlanoSaude(String planoSaude) {
        this.planoSaude = planoSaude;
    }

    public String getAlergia() {
        return alergia;
    }

    public void setAlergia(String alergia) {
        this.alergia = alergia;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public static void main(String[] args) {
            //Declaraçoes
            Scanner in = new Scanner(System.in);
            /*String codigo, nome, dataNascimento, sexo, planoSaude, alergia, tipoSanguineo;*/

            String nome, codigo, dataNascimento, sexo, planoSaude, alergia, tipoSanguineo;
            questao1 paciente1;
            paciente1 = new questao1(nome = null, codigo = null, dataNascimento = null, sexo = null, planoSaude = null, alergia = null, tipoSanguineo = null);

            //exibir meu cadastro
            String out1 = paciente1.toString();
            System.out.println(out1);

            //Sobrescrever novo cadastro
            System.out.println('\n' +"Qual o nome do paciente: ");
            paciente1.setNome(in.nextLine());
            System.out.println("Qual o codigo do paciente: ");
            paciente1.setCodigo(in.nextLine());
            System.out.println("Qual a data de nascimento do paciente: ");
            paciente1.setDataNascimento(in.nextLine());
            System.out.println("Qual o sexo do paciente: ");
            paciente1.setSexo(in.nextLine());
            System.out.println("Qual o plano de saúde do paciente: ");
            paciente1.setPlanoSaude(in.nextLine());
            System.out.println("O paciente tem alergia à: ");
            paciente1.setAlergia(in.nextLine());
            System.out.println("Qual o tipo sanguineo do paciente: ");
            paciente1.setTipoSanguineo(in.nextLine());

            //Chamar metodo toString
            String out2 = paciente1.toString();
            System.out.println(out2);
    }



}// end of class


