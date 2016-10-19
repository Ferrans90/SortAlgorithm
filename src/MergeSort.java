
public class MergeSort {
  // 归并排序，使用recursion实现
  // 时间复杂度：o(nlog2n)
  // 空间复杂度：o(n)
  // 稳定排序
  public static void sort(int[] array) {
    recurSort(array, 0, array.length - 1);
  }

  private static void recurSort(int[] array, int begin, int end) {
    if (begin == end) {
      return;
    } else {
      int mid = (begin + end) / 2;
      recurSort(array, begin, mid);
      recurSort(array, mid + 1, end);
      merge(array, begin, mid + 1, end);
    }
  }

  private static void merge(int[] array, int begin, int mid, int end) {
    int n = end - begin + 1;
    int[] tmp = new int[n];// 临时数组，保存merge结果
    int p = 0;
    // 两个子array合并：begin至mid-1，mid至end
    int start1 = begin;
    int start2 = mid;
    while (start1 <= mid - 1 && start2 <= end) {
      if (array[start1] < array[start2]) {
        tmp[p++] = array[start1++];
      } else {
        tmp[p++] = array[start2++];
      }
    }
    while (start1 <= mid - 1) {
      tmp[p++] = array[start1++];
    }
    while (start2 <= end) {
      tmp[p++] = array[start2++];
    }
    // 将merge结果覆盖到array上。
    System.arraycopy(tmp, 0, array, begin, tmp.length);
//    for (int i = begin; i <= end; ++i) {
//      array[i] = tmp[i - begin];
//    }
  }


}
