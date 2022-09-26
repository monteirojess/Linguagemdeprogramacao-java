package aula01;

import java.util.Scanner;

public class Emprestimo {
    public static void main(String[] args) {


        Scanner dadosEmpregado = new Scanner(System.in);
        System.out.print("Digite o salário do(a) empregado(a): R$");
        float salarioFuncionario = dadosEmpregado.nextFloat();



        System.out.print("Qual o valor da parcela? R$");
        var parcelaEmprestimo = dadosEmpregado.nextFloat();



        double PERCENTUAL = (30./100.);
        var limiteSalario = salarioFuncionario * PERCENTUAL;


            if (parcelaEmprestimo > limiteSalario){


            System.out.println("O empréstimo não pode ser concedido, pois ultrapassa o limite de 30% do salário do empregado.");

            } else{
                System.out.println("Parabéns o seu empréstimo foi APROVADO !");
        }

    }
}
