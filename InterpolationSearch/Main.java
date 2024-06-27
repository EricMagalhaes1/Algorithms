package InterpolationSearch;

public class Main {
  public static void main(String[] args) {
    int array[] = {1, 2, 4, 8, 16, 32, 64, 128 , 256, 512, 1024};

    int index = interpolationSearch(array, 256);

    if(index != -1){
      System.out.println("Elemento no index " + index);
    }
    else System.out.println("Elemento não encontrado");
  }

  private static int interpolationSearch(int[] array, int value) {
    
    int high = array.length - 1;
    int low = 0;

    while (value >=array[low] && value <= array[high] && low <= high) {
      
      int probe = low + (high - low) * (value - array[low])/(array[high] - array[low]);
      System.out.println(probe);

      if(array[probe] == value){
        return probe;
      }
      else if(array[probe] < value){
        low = probe + 1;
      }
      else{
        high = probe - 1; 
      }
    }

    return 0;
  }
  
}
