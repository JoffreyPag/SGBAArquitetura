/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sgbaarquitetura;

/**
 *
 * @author joffr
 */
public class Gerente extends Usuario{
    
    private Gerente(Builder builder) {
        this.id = builder.id;
        this.nome = builder.nome;
        this.cpf = builder.cpf;
        this.email = builder.email;
        this.senha = builder.senha;
        this.telefone = builder.telefone;
        this.matricula = builder.matricula;
        this.tipoUser = builder.tipoUser;
    }

    @Override
    void Salario() {
        System.out.println("0");
    }
    
    public static class Builder {

        private int id;
        private String nome, cpf, email, senha, telefone, matricula;
        private char tipoUser;

        public Builder(String nome, char tipoUser) {
            this.nome = nome;
            this.tipoUser = tipoUser;
        }

        public Builder addId(int id) {
            this.id = id;
            return this;
        }

        public Builder addNome(String nome) {
            this.nome = nome;
            return this;
        }

        public Builder addCpf(String cpf) {
            this.cpf = cpf;
            return this;
        }

        public Builder addEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder addSenha(String senha) {
            this.senha = senha;
            return this;
        }

        public Builder addTelefone(String telefone) {
            this.telefone = telefone;
            return this;
        }

        public Builder addMatricula(String matricula) {
            this.matricula = matricula;
            return this;
        }

        public Builder addTipoUser(char tipoUser) {
            this.tipoUser = tipoUser;
            return this;
        }

        public Gerente build() {
            return new Gerente(this);
        }
    }
}
