package LinearSearch;
public class Main {
    public static void main(String[] args) {
      
      int [] array = {9, 1, 8, 2, 7, 3,6, 4, 5};

      int index = linearSearch(array, 15);

      if (index != -1){
        System.out.println("Elemento encontrado no index: " + index);
      }
      else{
        System.out.println("Elemento não encontrado");
      }

    }

    private static int linearSearch(int[] array, int value){
      
      for(int i = 0; i < array.length;i++){
        if(array[i] == value ){
          return i;
        }
      }
      return -1;

    }
}
