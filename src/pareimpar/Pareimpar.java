package pareimpar;

import java.util.Scanner;

public class Pareimpar {

    public static void main(String[] args) 
    {
    Scanner leia = new Scanner(System.in);
    int num1, resu;

    System.out.print("Digite um n° inteiro:");
    num1 = leia.nextInt();
    
    resu = num1 % 2;
    
    if( resu == 0)
    {
    System.out.println("O número é par");
    }
    else 
    {
    System.out.println("O número é impar");
    }
    }    
}
