public class Testereceita{
    public static void main(String[] args){
      // criar objetos
      Receita minhaReceita = new Receita();
      minhaReceita.autor = "Vanessa Souza";
      minhaReceita.nome = "Bolo de Milho";
      minhaReceita.tempoPreparo = 50;
      minhaReceita.avaliacao = 4.8/5.0;
      minhaReceita.dificuldade = "Muito Facil";
      System.out.println(minhaReceita.autor);
      System.out.println(minhaReceita.nome);
      System.out.println(minhaReceita.tempoPreparo);
      System.out.println(minhaReceita.avaliacao);
      System.out.println(minhaReceita.dificuldade);
}
}
