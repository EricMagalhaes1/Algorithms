package Stack;
import java.util.Stack;

public class stack{
  public static void main(String[] args) {
     
    Stack<String> stack = new Stack<String>();

    
    stack.push("Minecraft");
    stack.push("Skyrin");
    stack.push("Doom");
    stack.push("Borderlands 3");
    stack.push("FFVII");

    //String myFavGame = stack.pop();

    System.out.println(stack.peek());
    System.out.println(stack);

    System.out.println(stack.search("Minecraft"));
  
  }
}