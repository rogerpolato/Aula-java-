public class TesteExercicio {
public static void main(String[] args){
   Exefisico exercicio1 = new Exefisico();
   exercicio1.nome = "Supino";
   exercicio1.musculo = "Peitoral";
   exercicio1.descricao = "é um exercicio ...";
   exercicio1.serie = 3;
   exercicio1.repeticao = 15;
   exercicio1.carga = 70;
   exercicio1.dificuldade = 3;
   exercicio1.imagem = "imagemSupino.jpg";

   System.out.println("Descrição do exercicio");
   System.out.println(exercicio1.nome + "\n"+ exercicio1.musculo);
   System.out.println("Repetições: " + exercicio1.repeticao);
   System.out.println("Carga: " + exercicio1.carga + "kg");
   System.out.println("Dificuldade: " + exercicio1.dificuldade);

    Exefisico exercicio2 = new Exefisico();
    exercicio2.nome = "Agachamento";
    exercicio2.musculo = "Pernas";
    exercicio2.descricao = "Exercício para membros inferiores";
    exercicio2.serie = 4;
    exercicio2.repeticao = 12;
    exercicio2.carga = 80;
    exercicio2.dificuldade = 4;
    exercicio2.imagem = "imagemAgachamento.jpg";

    System.out.println("\nDescrição do exercicio 2");
    System.out.println(exercicio2.nome + "\n" + exercicio2.musculo);
    System.out.println("Repetições: " + exercicio2.repeticao);
    System.out.println("Carga: " + exercicio2.carga + "kg");
    System.out.println("Dificuldade: " + exercicio2.dificuldade);

    }

}
