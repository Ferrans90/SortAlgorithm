
public class BubbleSort {
  // 冒泡排序：将大数向数组右侧移动
  // 时间复杂度：o(n2)
  // 空间复杂度：o(1)(交换时存放临时变量tmp)
  // 稳定排序
  public static void sort(int[] array) {
    int size = array.length;
    for (int i = size - 1; i > 1; --i) { // 外循环：确定内循环冒泡比较次数，从何size-1次到2次
      for (int j = 0; j < i; ++j) {
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
