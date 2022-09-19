package aula01;

import java.util.Scanner;

public class Emprestimo {
    public static void main(String[] args) {


        Scanner dados_empregado = new Scanner(System.in);
        System.out.print("Digite o salário do(a) empregado(a): R$");
        float salario_funcionario = dados_empregado.nextFloat();



        System.out.print("Qual o valor da parcela? R$");
        var parcela_emprestimo = dados_empregado.nextFloat();



        double PERCENTUAL = (30./100.);
        var limite_salario = salario_funcionario * PERCENTUAL;


            if (parcela_emprestimo > limite_salario){


            System.out.println("O empréstimo não pode ser concedido, pois ultrapassa o limite de 30% do salário do empregado.");

            } else{
                System.out.println("Parabéns o seu empréstimo foi APROVADO !");
        }

    }
}
