public class Main {

  public static void main(String[] args) {
    int[] array = {1, 3, 6, 32, 5, 7, 2, 4, 1};
    MergeSort.sort(array);
    for (int i : array) {
      System.out.print(i + " ");
    }
    System.out.println();
  }
}
