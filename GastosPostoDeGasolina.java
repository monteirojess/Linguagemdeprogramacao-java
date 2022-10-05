package aula01;

import java.util.Scanner;

public class GastosPostoDeGasolina {
    public static void main(String[] args) {
        Scanner gasolina = new Scanner(System.in);
        System.out.print("Gasolina: ".toUpperCase());
        float litroGasolina = gasolina.nextFloat();
        var precoGasolina = 2.50;
        var contaTotal = litroGasolina * precoGasolina;
        var consumo_Bebidas = 2.00;
        var precoBebidas = 3.00;
        var gastoTotalBebida = consumo_Bebidas * precoBebidas;
        var valor_Total = contaTotal + gastoTotalBebida;
        System.out.println("Litros Gasolina: " + litroGasolina + " Valor por Litro: R$" + precoGasolina + "= " + contaTotal);
        System.out.println("Quantidade de Bebidas: " + consumo_Bebidas + " Valor das Bebidas: R$" + precoBebidas + "= " + gastoTotalBebida);
        System.out.println("Valor Total: R$" + valor_Total);
    }
}
