
public class BubbleSort {
  public static void Sort(int[] array) {
    int size = array.length;
    for (int i = 0; i < size - 1; ++i) {
      for (int j = 0; j < size - 1 - i; ++j) {
        if (array[j] > array[j + 1]) {
          swap(array, j, j + 1);
        }
      }
    }
  }

  private static void swap(int[] array, int i, int j) {
    int tmp = array[i];
    array[i] = array[j];
    array[j] = tmp;
  }
}
