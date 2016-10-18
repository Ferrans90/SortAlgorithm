public class SelectSort {
  // 选择排序：从数组中选择最小值排到有序队列中，与冒泡排序相反
  public static void sort(int[] array) {
    int size = array.length;
    for (int i = 0; i < size - 1; ++i) { // 外循环：选择最小值n-1次
      // 令内循环的第一个为最小值（第i个值）
      int minPos = i;
      for (int j = i + 1; j < size; ++j) {
        if (array[j] < array[minPos]) {
          minPos = j;
        }
      }
      swap(array, i, minPos);
    }
  }

  private static void swap(int[] array, int i, int j) {
    int tmp = array[i];
    array[i] = array[j];
    array[j] = tmp;
  }
}
