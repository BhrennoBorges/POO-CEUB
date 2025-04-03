package AVA2-IMC;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite seu peso (kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite sua altura (m): ");
        double altura = scanner.nextDouble();

        Pessoa pessoa = new Pessoa(nome, peso, altura);
        double imc = pessoa.calcularIMC();
        String analise = pessoa.obterAnalise();

        System.out.printf("Nome: %s\n", pessoa.getNome());
        System.out.printf("IMC: %.2f\n", imc);
        System.out.println("Análise: " + analise);

        scanner.close();
    }
}