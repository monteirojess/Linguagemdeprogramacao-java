package aula01;

import java.util.Scanner;

public class Pousada {
    public static void main(String[] args) {
        var cadastro = true;
        var diaria = 40;
        var cont_total = 0;


        while (cadastro == true) {


            Scanner dados = new Scanner(System.in);
            System.out.print("Nome do cliente:");
            String nome = dados.next();
            System.out.print("Dias na pousada:");
            float dias = dados.nextFloat();

            if (dias < 10) {
                var taxas_servicos = 15 ;
                var conta = (dias * diaria) + (dias * taxas_servicos);
                cont_total += conta ;
                System.out.println(conta);
            }else {
                var taxas_servicos = 8;
                var conta = (dias * diaria) + (dias * taxas_servicos);
                cont_total += conta ;
                System.out.println(conta);

            }Scanner continuar_dados = new Scanner(System.in);
            System.out.println("Deseja cadastrar mais um cliente ? 'S' [continuar] 'N' [encerrar programa]:");
            String continuar_programa = continuar_dados.next();


            if (continuar_programa.equals("S")) {
                cadastro = true;

            }else {
                cadastro = false;
                System.out.println("Cadastros de clientes encerrado!");
                System.out.println("Total arrecadado pela pousada: R$ " + cont_total );

            }
        }

    }
}
