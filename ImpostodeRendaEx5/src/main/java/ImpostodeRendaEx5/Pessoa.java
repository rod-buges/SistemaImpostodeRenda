package ImpostodeRendaEx5;

import java.util.Scanner;

class Pessoa {
    private String nome;
    private double salario;

    Pessoa(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    String getNome() {
        return this.nome;
    }

    double getSalario() {
        return this.salario;
    }
}