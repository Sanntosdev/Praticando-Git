public class Personagem {

    public String nome;
    public int idade;
    public String classe;
    public String poder;

    public void imprime(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Classe: " + this.classe);
        System.out.println("Poder: " + this.poder);
    }
}
