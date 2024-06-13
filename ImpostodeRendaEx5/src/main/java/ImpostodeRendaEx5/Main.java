package ImpostodeRendaEx5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o seu nome:");
        String nome = scanner.nextLine();
        System.out.println("Digite o seu salário:");
        double salario = scanner.nextDouble();
        scanner.close();

        Pessoa pessoa = new Pessoa(nome, salario);
        ImpostoDeRenda impostoDeRenda = new ImpostoDeRenda(pessoa);
        impostoDeRenda.imprimir();
    }
}