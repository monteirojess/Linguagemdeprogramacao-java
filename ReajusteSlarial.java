package aula01;

import java.util.Scanner;

public class ReajusteSlarial {
    public static void main(String[] args) {


        var adicionar_salario = true;
        var encerrar = "FIM";


        while (adicionar_salario == true) {
            System.out.println("------------------ REAJUSTE SALARIAL DOS(AS) FUNCIONÁRIOS(AS) ------------------");

            Scanner funcionario = new Scanner(System.in) ;
            System.out.print("Digite o nome do(a) funcionário(a):".toUpperCase());
            String cadastro = funcionario.next().toUpperCase();


            if (cadastro.equals(encerrar)) {
                adicionar_salario = false;

            }else {
                Scanner salario = new Scanner(System.in);
                System.out.print("Digite o salário do(a) funcionário(a), ".toUpperCase() +  cadastro + ":");
                float calcular_salario = salario.nextFloat();


                if (calcular_salario < 500) {
                    double reajuste_valor = (20./100.);


                    var correcao = calcular_salario * reajuste_valor;
                    var novo_salario = correcao + calcular_salario;

                    System.out.println("O salário do(a) funcionário(a) ".toUpperCase() + cadastro + " com o reajuste de 20% ficou: R$".toUpperCase() + novo_salario + " e antes do rejuste era: R$".toUpperCase() + calcular_salario + ".");


                }else {
                    System.out.println("O(a) funcionário(a) ".toUpperCase() + cadastro + " não tem direito ao aumento.".toUpperCase());

                }
            }




        }


    }
}




