public class Main {
    public static void main(String[] args) {

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

        p1.imprime();
        p2.imprime();

    }
}