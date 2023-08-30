public class Main {
    public static void main(String[] args) {

        //Classe Objeto          Construtor
        Turista mochileiro = new Turista();

        // Definir formato do objeto
        mochileiro.nome = "Lindsay";
        mochileiro.cpf = "123";
        Turista mochileira = new Turista();
        mochileira.nome = "James Gun";

        // Definir comportamento
        String retorno = mochileira.viajar();
        System.out.printl(retorno);              }
}
