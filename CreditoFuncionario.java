import java.util.Scanner;

public class CreditoFuncionario {
    public void dadosEmprestimo(String nome,int idade, double valorEmprestimo, double jurosEmprestimo,int mesesParaPagar) {

        if (idade >= 18 & idade < 23) {
            double calculo =  (valorEmprestimo / mesesParaPagar) * jurosEmprestimo;
            String resultado = String.format("%.2f", calculo);
            String converterVE = String.format("%.2f", valorEmprestimo);

            System.out.println("O valor do empréstimo de " + nome + " foi de R$ " + valorEmprestimo  + ". Com juros de " + jurosEmprestimo + " %, o valor final dividido para " + mesesParaPagar + " meses foi de: R$ " + resultado + ".");

        } else if (idade > 23 && idade <= 33) {
            double calculo = (valorEmprestimo * mesesParaPagar) / jurosEmprestimo;
            String resultado = String.format("%.2f", calculo);
            String converterVE = String.format("%.2f", valorEmprestimo);

            System.out.println("O valor do empréstimo de " + nome + " foi de R$ " + converterVE  + ". Com juros de " + jurosEmprestimo + " %, o valor final dividido para " + mesesParaPagar + " meses foi de: R$ " + resultado + ".");
        }
    }
}
