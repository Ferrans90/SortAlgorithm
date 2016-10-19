
public class InsertSort {
  // 插入排序：从i=1，2，3...n-1逐渐将a[i]插入前面的有序数组中
  // 时间复杂度：o(n2)
  // 空间复杂度：0(1)(存放临时变量)
  // 稳定排序
  public static void sort(int[] array) {
    int size = array.length;
    for (int i = 1; i < size; ++i) { //决定数组插入位，1到size-1
      int tmp = array[i]; // 保存i处的值
      int p = i; // p：前一个的位置
      while (p > 0 && tmp < array[p - 1]) {
        array[p] = array[p - 1];
        --p;
      }
      array[p] = tmp;
    }
  }
}
