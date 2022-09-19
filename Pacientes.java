package aula01;
import java.util.Scanner;


public class Pacientes {
    public static void main(String[] args) {


        var cont_pacientes = 0;
        var media_homens = 0;
        var cont_homens = 0;
        var cont_mulheres = 0;
        var cont_idade = 0;
        var pacientes_DezoitoeVinteCinco = 0;
        var altura_minima = 1.60;
        var altura_maxima = 1.70;
        var idade_paciente_velho = 0;
        var nome_pvelho = "";
        var altura_mulher_baixa = 0.0;
        var nome_mbaixa = "";


        var continuar = true;

        while (continuar == true){


            Scanner dados = new Scanner(System.in);
            System.out.print("Digite o nome do paciente ou 'FIM' para encerrar o programa:");
            String nome = dados.next().toUpperCase();


            if (nome.equals("FIM")) {
                continuar = false;


            }else{
                cont_pacientes++;


                System.out.println("Digite o sexo do paciente, 'f' (feminino) e 'm' (Masculino):");
                String sexo = dados.next();
                System.out.println("Digite o peso:");
                float peso = dados.nextFloat();
                System.out.println("Digite a idade:");
                int idade = dados.nextInt();
                System.out.println("Digite a altura:");
                float altura = dados.nextFloat();


                if (sexo.equals("f") && altura >= altura_minima && altura <= altura_maxima && peso > 70) {
                    cont_mulheres ++;


                }if (sexo.equals("m")){
                    cont_homens++;
                    cont_idade+= idade;
                    media_homens = cont_idade /cont_homens;


                }if (sexo.equals("f") || (sexo.equals("m") && idade >= 18 && idade <= 25 )){
                    pacientes_DezoitoeVinteCinco++;


                }if (sexo.equals("f")){
                    if (altura > altura_mulher_baixa);{
                        altura_mulher_baixa = altura;
                        nome_mbaixa = nome;
                    }


                if (sexo.equals("f") || (sexo.equals("m"))){

                    }if (idade > idade_paciente_velho){
                        idade_paciente_velho = idade;
                        nome_pvelho = nome;

                    }

                }


            }



        }
        System.out.println("A quantidade de pacientes consultados(as) foram: " + cont_pacientes);
        System.out.println("A média de idade dos homens consultados foram: " + media_homens);
        System.out.println("A quantidade de mulheres com altura entre 1,60 e 1,70 e peso acima de 70kg:" + cont_mulheres);
        System.out.println("A quantidade de pessoas com idade entre 18 anos e 25 anos: " + pacientes_DezoitoeVinteCinco);
        System.out.println("O nome da mulher mais baixa é:" + nome_mbaixa);
        System.out.println("O(a) paciente mais velho(a) é:" + nome_pvelho);

    }

}