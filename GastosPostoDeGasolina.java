package aula01;

import java.util.Scanner;

public class GastosPostoDeGasolina {
    public static void main(String[] args) {
        Scanner gasolina = new Scanner(System.in);
        System.out.print("Gasolina: ".toUpperCase());
        float litro_gasolina = gasolina.nextFloat();
        var PRECO_GASOLINA = 2.50;
        var conta_total = litro_gasolina * PRECO_GASOLINA;
        var CONSUMO_BEBIDAS = 2.00;
        var PRECO_BEBIDAS = 3.00;
        var GASTO_BEBIDAS_TOTAL = CONSUMO_BEBIDAS * PRECO_BEBIDAS;
        var valor_total = conta_total + GASTO_BEBIDAS_TOTAL;
        System.out.println("Litros Gasolina: " + litro_gasolina + " Valor por Litro: R$" + PRECO_GASOLINA + "= " + conta_total);
        System.out.println("Quantidade de Bebidas: " + CONSUMO_BEBIDAS + " Valor das Bebidas: R$" + PRECO_BEBIDAS + "= " + GASTO_BEBIDAS_TOTAL);
        System.out.println("Valor Total: R$" + valor_total);
    }
}
