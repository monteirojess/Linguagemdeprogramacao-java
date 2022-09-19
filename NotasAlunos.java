package aula01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class NotasAlunos {
      static DecimalFormat df = new DecimalFormat("0.0");


    public static void main(String[] args) {
        var cont_alunos = 1;
        var alunos_aprovados = 0;
        var alunos_reprovados = 0;
        var alunos_exame = 0;
        var media_classe = 0;
        var alunos_total = 0;
        var total = 0;

        for (int i = 0; i < 6; i++) {


            Scanner notas = new Scanner(System.in);
            System.out.print("Digite a nota 1 do aluno(a) "  + cont_alunos++ + ":" );
            float nota1 = notas.nextFloat();
            System.out.print("Digite a nota 2:" );
            float nota2 = notas.nextFloat();


            media_classe += nota1 + nota2;
            alunos_total++;
            var media_total_alunos = media_classe / alunos_total;
            total = media_total_alunos;


            var media_aluno = (nota1 + nota2) / 2;
            System.out.println(media_aluno);


            if (media_aluno < 3){
                System.out.println("Reprovado !");
                alunos_reprovados++;


            }else if (media_aluno >= 3 & media_aluno <= 7 ){
                System.out.println("Exame !");
                alunos_exame++;

            }else{
                System.out.println("Aprovado !");
                alunos_aprovados ++;

            }
        }
        System.out.println("Tivemos " + (alunos_aprovados) + " alunos(as) aprovados(as) !");
        System.out.println("Tivemos " + (alunos_reprovados) + " alunos(as) reprovado(as) !");
        System.out.println("Tivemos " + (alunos_exame) + " alunos(as) em exame !");
        System.out.println("A média total da classe foi: " + df.format(total) + ".");

    }

}