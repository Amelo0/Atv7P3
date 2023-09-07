package Ficha07;

import java.util.Scanner;

public class questao2 {
    public class Endereco {
        //ATRIBUTOS
        //rua,numero,complemento,bairro,cidade,uf,cep.
        private String rua, numero, complemento, bairro, cidade, uf, cep;

        //CONSTRUTORES

        public Endereco(String rua, String numero, String complemento, String bairro, String cidade, String uf, String cep) {
            this.rua = rua;
            this.numero = numero;
            this.complemento = complemento;
            this.bairro = bairro;
            this.cidade = cidade;
            this.uf = uf;
            this.cep = cep;
        }
        //METODOS

        public String getRua() {
            return rua;
        }

        public void setRua(String rua) {
            this.rua = rua;
        }

        public String getNumero() {
            return numero;
        }

        public void setNumero(String numero) {
            this.numero = numero;
        }

        public String getComplemento() {
            return complemento;
        }

        public void setComplemento(String complemento) {
            this.complemento = complemento;
        }

        public String getBairro() {
            return bairro;
        }

        public void setBairro(String bairro) {
            this.bairro = bairro;
        }

        public String getCidade() {
            return cidade;
        }

        public void setCidade(String cidade) {
            this.cidade = cidade;
        }

        public String getUf() {
            return uf;
        }

        public void setUf(String uf) {
            this.uf = uf;
        }

        public String getCep() {
            return cep;
        }

        public void setCep(String cep) {
            this.cep = cep;
        }

        @Override
        public String toString() {
            return "O endereço é " + rua + ", " + numero + " " + complemento + ". " + bairro + ", " + cidade +
                    ", " + uf + + '\n' + ". O CEP é: " + cep;
        }
    }

    public class Medico {
        //ATRIBUTOS
        private String codigo, nome, sexo, especialidade, endereco;

        //CONSTRUTORES

        public Medico(String codigo, String nome, String sexo, String especialidade, Ficha07.codiguins.Endereco endereco) {
            this.codigo = codigo;
            this.nome = nome;
            this.sexo = sexo;
            this.especialidade = especialidade;
        }

        //METODOS


        @Override
        public String toString() {
            return "Medico{" +
                    "- Codigo: " + codigo + '\n' +
                    "- Nome: " + nome + '\n' +
                    "- Sexo: " + sexo + '\n' +
                    "- Especialidade: " + especialidade + '\n' +
                    "- Endereco: " + endereco + '\n';
        }
    }

    public static void main(String[] args) {
        //Declarações
        Scanner in = new Scanner(System.in);
        String rua, numero, complemento, bairro, cidade, uf, cep;
        String codigo, nome, sexo, especialidade;

        //Instanciar OBJ endereco
        Ficha07.codiguins.Endereco endereco;
        endereco = new Ficha07.codiguins.Endereco(rua = null, numero = null, complemento = null, bairro = null, cidade = null, uf = null, cep = null);

        System.out.println("Rua: ");

        System.out.println("Numero: ");
        numero = in.nextLine();
        System.out.println("Complemento: ");
        complemento = in.nextLine();
        System.out.println("Bairro: ");
        bairro = in.nextLine();
        System.out.println("Cidade: ");
        cidade = in.nextLine();
        System.out.println("Unidade Federativa: ");
        uf = in.nextLine();
        System.out.println("CEP: ");
        cep = in.nextLine();

        //Instanciar OBJ medico
        Ficha07.codiguins.Medico medico = new Ficha07.codiguins.Medico(codigo = null, nome = null, sexo = null, especialidade = null, endereco);

        System.out.println("Codigo: ");
        codigo = in.nextLine();
        System.out.println("Nome: ");
        nome = in.nextLine();
        System.out.println("Sexo: ");
        sexo = in.nextLine();
        System.out.println("Especialidade: ");
        especialidade = in.nextLine();

        System.out.println(medico.toString());
    }
}// end of class
