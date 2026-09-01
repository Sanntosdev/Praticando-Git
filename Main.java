import java.util.Scanner;

public class Main {

    static int  resp(){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual personagem vc quer ver");
        System.out.println("1 - P1");
        System.out.println("2 - P2");
        System.out.println("3 - P3");
        System.out.print("Escolha : ");
        int resp1 = entrada.nextInt();
        System.out.println("--------------");

        return resp1;


    }
    public static void main(String[] args) {

        Personagem p1 = new Personagem();
        String resp = "";
        Scanner entrada = new Scanner(System.in);

        p1.nome = "Luffy";
        p1.idade = 18;
        p1.classe = "Pirata";
        p1.poder = "Borracha";

        Personagem p2 = new Personagem();
        p2.nome = "Musashi";
        p2.idade = 17;
        p2.classe = "Espadachim";
        p2.poder = "Sabedoria";

        Personagem p3 = new Personagem();
        p3.nome = "Sung jin woo";
        p3.idade = 21;
        p3.classe = "Monarca";
        p3.poder = "Necromancia";

        do {

            switch (resp()){

                case 1 :
                    p1.imprime();
                    break;
                case 2 :
                    p2.imprime();
                    break;
                case 3 :
                    p3.imprime();
                    break;



            }

            System.out.print("Deseja ver mais algum : ");
            resp = entrada.nextLine();

        }while (resp.equalsIgnoreCase("Sim"));






    }
}