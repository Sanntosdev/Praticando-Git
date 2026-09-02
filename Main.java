import java.util.Scanner;


public class Main {

    static int escolhardepersonagem() {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual personagem vc quer ver");
        System.out.println("1 - P1");
        System.out.println("2 - P2");
        System.out.println("3 - P3");
        System.out.println("4 - P4");
        System.out.print("Escolha : ");
        int resp1 = entrada.nextInt();
        System.out.println("--------------");

        return resp1;


    }

    static int escolhardearma(){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual arma vc quer ver");
        System.out.println("1 - A1");
        System.out.println("2 - A2");
        System.out.println("3 - A3");
        System.out.println("4 - A4");
        System.out.println("5 - A5");
        System.out.print("Escolha : ");
        int resp = entrada.nextInt();
        System.out.println("--------------");

        return resp;


    }

    public static void main(String[] args) {

        String resp = "";
        Scanner entrada = new Scanner(System.in);


        Personagem p1 = new Personagem();
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

        Personagem p4 = new Personagem();
        p4.nome = "Gon";
        p4.idade = 12;
        p4.classe = "Caçador";
        p4.poder = "Técnica de Caça";

        do {

            switch (escolhardepersonagem()) {

                case 1:
                    p1.imprime();
                    break;
                case 2:
                    p2.imprime();
                    break;
                case 3:
                    p3.imprime();
                    break;
                case 4:
                    p4.imprime();
                    break;


            }

            System.out.print("Deseja ver mais algum : ");
            resp = entrada.nextLine();

        } while (resp.equalsIgnoreCase("Sim"));

        System.out.println("---------------------------");


        String[] armas = {"Espada", "Adaga", "Machado", "Lança", "Bastão"};
        for (int i = 0; i < armas.length; i++) {

            System.out.println(armas[i]);
        }
        System.out.println("---------------------");

       String leitor = "";


        do {

            switch (escolhardearma()) {

                case 1:
                    System.out.println("Você escolheu a arma : " + armas[0]);
                    break;
                case 2:
                    System.out.println("Você escolheu a arma : " + armas[1]);
                    break;
                case 3:
                    System.out.println("Você escolheu a arma : " + armas[2]);
                    break;
                case 4:
                    System.out.println("Você escolheu a arma : " + armas[3]);
                    break;
                case 5 :
                    System.out.println("Você escolheu a arma : " + armas[4]);
                    break;

            }

            System.out.print("Deseja escolher mais alguma arma : ");
            leitor = entrada.nextLine();


        } while (leitor.equalsIgnoreCase("Sim"));

        System.out.println("----------------------------");
        System.out.println("Agora que vc já viu a nossa escolha de personagem e armas");
        System.out.println("Agora monte o seu");
        System.out.println("--------------------------");

        Personagem p5 = new Personagem();

        System.out.print("Digite o nome : ");
        p5.nome = entrada.nextLine();

        System.out.print("Digite a idade : ");
        p5.idade = entrada.nextInt();
        entrada.nextLine(); // Consumir a quebra de linha após nextInt()
        System.out.print("Digite a classe : ");
        p5.classe = entrada.nextLine();

        System.out.print("Digite o poder : ");
        p5.poder = entrada.nextLine();

        System.out.println("Quer ver o menu do seu personagem");
        String resposta = entrada.nextLine();

        if(resposta.equalsIgnoreCase("Sim")){

            p5.imprime();


        }else{

            System.out.println("Então procure o que fazer viu ");
        }

        //agora ver e quebre o codigo viu palhaço


        String [] musica = {"Rock", "Pop", "Rap", "Trap", "Mpb"};
    for (int i = 0; i < musica.length; i++){

        System.out.println(musica[i]);

    }
    System.out.println("---------------------");

    System.out.println("Escolha um estilo musical : " );
    System.out.println("1 - M1");
    System.out.println("2 - M2");
    System.out.println("3 - M3");
    System.out.println("4 - M4");
    System.out.println("5 - M5");
    System.out.print("Escolha : ");
    String leitor2 = entrada.nextLine();

    do {

        switch (leitor2){

            case "1" :
                System.out.println("Você escolheu o estilo musical : " + musica[0]);
                break;
            case "2" :
                System.out.println("Você escolheu o estilo musical : " + musica[1]);
                break;
            case "3" :
                System.out.println("Você escolheu o estilo musical : " + musica[2]);
                break;
            case "4" :
                System.out.println("Você escolheu o estilo musical : " + musica[3]);
                break;
            case "5" :
                System.out.println("Você escolheu o estilo musical : " + musica[4]);
                break;

        }

        System.out.print("Deseja escolher mais algum estilo musical : ");
        leitor2 = entrada.nextLine();
}
while (leitor2.equalsIgnoreCase("Sim"));










    }
}