
public class QuickSort {
  // 快排
  // 时间复杂度：o(nlog2n)
  // 空间负责度：o(log2n)
  // 不稳定排序
  public static void sort(int[] array) {
    recurSort(array, 0, array.length-1);
  }

  private static void recurSort(int[] array, int begin, int end) {
    if (begin < end) {
      int a = begin;
      int b = end;
      int mid = (begin + end) / 2;
      int pivot = array[mid];
      while (a < b) {
        while (array[a] < pivot && a <= array.length) {
          ++a;
        }
        while (array[b] > pivot && b >= 0) {
          --b;
        }
        if (a < b) {
          swap(array, a, b);
        }
      }
      recurSort(array, begin, mid - 1);
      recurSort(array, mid + 1, end);
    }
  }

  private static void swap(int[] array, int i, int j) {
    int tmp = array[i];
    array[i] = array[j];
    array[j] = tmp;
  }
}
