package aula01;

import java.util.Scanner;

public class Emprestimo {
    public static void main(String[] args) {


        Scanner dadosEmpregado = new Scanner(System.in);
        System.out.print("Digite o sal�rio do(a) empregado(a): R$");
        float salarioFuncionario = dadosEmpregado.nextFloat();



        System.out.print("Qual o valor da parcela? R$");
        var parcelaEmprestimo = dadosEmpregado.nextFloat();



        double PERCENTUAL = (30./100.);
        var limiteSalario = salarioFuncionario * PERCENTUAL;


            if (parcelaEmprestimo > limiteSalario){


            System.out.println("O empr�stimo n�o pode ser concedido, pois ultrapassa o limite de 30% do sal�rio do empregado.");

            } else{
                System.out.println("Parab�ns o seu empr�stimo foi APROVADO !");
        }

    }
}
