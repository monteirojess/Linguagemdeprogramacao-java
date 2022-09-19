package aula01;

public class Cerveja {
    public static void main(String[] args) {
        var cerveja = 99;
        while (cerveja > 0) {
            System.out.println( cerveja + " cervejas na freezer !");
            System.out.println("Pego uma garrafa, passo pra frente.");
            cerveja = cerveja - 1;
            if (cerveja == 0) {
                System.out.println("ACABOU :( ");
            } else {
                System.out.println("Agora sao: " + cerveja + " cervejas na freezer !");
            }
        }
    }
}
