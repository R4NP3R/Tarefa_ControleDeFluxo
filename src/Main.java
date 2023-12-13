import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

         Scanner S = new Scanner(System.in);

         System.out.println("Digite a Nota do 1 BIM");
         int nota1Bim = S.nextInt();
         System.out.println("Digite a Nota do 2 BIM");
         int nota2Bim = S.nextInt();
         System.out.println("Digite a Nota do 3 BIM");
         int nota3Bim = S.nextInt();
         System.out.println("Digite a Nota do 4 BIM");
         int nota4Bim = S.nextInt();
         
         int MediaGeral = (nota1Bim + nota2Bim + nota3Bim + nota4Bim) / 4;

         String ResultadoFinal = getSituacao(MediaGeral);
         System.out.println(ResultadoFinal);
    }

    public static String getSituacao(int NotaTotal) {
        if (NotaTotal >= 7) {
            return "Aprovado";
        } else if (NotaTotal >= 5) {
            return  "Recuperação";
        } else {
            return "Reprovado";
        }
    }

}
