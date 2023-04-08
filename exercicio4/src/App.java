import java.util.Scanner;
class Main {
  public static void main(String[] args){
    //passo 1:variavel
    double nota1;
    double nota2;
    double nota3;
    double nota4;
    double soma;
    double media;

    //passo 2: entrada de dados 
    Scanner teclado = new Scanner(System.in);
    System.out.println("escreva suas 4 notas:");
    nota1 = teclado.nextDouble();
    nota2 = teclado.nextDouble();
    nota3 = teclado.nextDouble();
    nota4 = teclado.nextDouble();
    
    // passo 3: calcular soma
    soma = nota1 + nota2 + nota3 + nota4;
    media = soma / 4;

    // passo 4: exibir salario 
   System.out.println("sua media é :" + media);
  }
}
