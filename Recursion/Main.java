package Recursion;

public class Main {
  public static void main(String[] args) {
    
    //System.out.println(fatorial(7));

    System.out.println(power(2,8));
  }

  private static int power(int base, int expoente) {

    if(expoente < 1) return 1;//base case
    return base * power(base, expoente -1);//recursividade

  }

  private static int fatorial(int num) {
    
    if(num < 1) return 1;//base case
    return num * fatorial(num - 1 );//recursao
  }


}
