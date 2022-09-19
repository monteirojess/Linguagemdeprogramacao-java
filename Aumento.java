package aula01;

import java.util.Scanner;

public class Aumento {
    public static void main(String[] args) {
        Scanner salario = new Scanner(System.in);
        System.out.println("Digite um salario: ");
        float salario_atual = salario.nextFloat();

        Scanner aumento = new Scanner(System.in);
        System.out.println("Digite o percentual de aumento: ");
        float aumento_salarial = aumento.nextFloat();

        var reajuste = salario_atual * aumento_salarial / 100;
        var salario_atualizado = salario_atual + reajuste;
        System.out.println("O salário era" + salario_atual + "e tivemos um aumento de R$ " + reajuste + "o novo salário é de:" + salario_atualizado );
    }
}