package com.test;

import org.junit.Test;
import java.util.Arrays;
import static java.util.Arrays.copyOfRange;

public class Paixu {

    /**
     * 1、冒泡排序（Bubble Sort）算法描述
     * 步骤1: 比较相邻的元素。如果第一个比第二个大，就交换它们两个；
     * 步骤2: 对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对，这样在最后的元素应该会是最大的数；
     * 步骤3: 针对所有的元素重复以上的步骤，除了最后一个；
     * 步骤4: 重复步骤1~3，直到排序完成。
     */
    @Test
    public void maopao() {
        int[] array = {14, 9, 8, 15, 34, 5};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
            System.out.println(Arrays.toString(array));
        }
    }

    /**
     * 2、选择排序（Selection Sort）算法描述
     * n个记录的直接选择排序可经过n-1趟直接选择排序得到有序结果。具体算法描述如下：
     * 步骤1：初始状态：无序区为R[1…n]，有序区为空；
     * 步骤2：第i趟排序(i=1,2,3…n-1)开始时，当前有序区和无序区分别为R[1…i-1]和R(i…n）。该趟排序从当前无序区中-选出关键字最小的记录 R[k]，
     * 将它与无序区的第1个记录R交换，使R[1…i]和R[i+1…n)分别变为记录个数增加1个的新有序区和记录个数减少1个的新无序区；
     * 步骤3：n-1趟结束，数组有序化了。
     */
    @Test
    public void xuanze() {
        int[] array = {14, 9, 8, 15, 34, 5};
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[minIndex]) {//找到最小的数
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
            System.out.println(Arrays.toString(array));
        }
    }

    /**
     * 3、插入排序（Insertion Sort）算法描述
     * 一般来说，插入排序都采用in-place在数组上实现。具体算法描述如下：
     * 步骤1: 从第一个元素开始，该元素可以认为已经被排序；
     * 步骤2: 取出下一个元素，在已经排序的元素序列中从后向前扫描；
     * 步骤3: 如果该元素（已排序）大于新元素，将该元素移到下一位置；
     * 步骤4: 重复步骤3，直到找到已排序的元素小于或者等于新元素的位置；
     * 步骤5: 将新元素插入到该位置后；
     * 步骤6: 重复步骤2~5。
     */
    @Test
    public void charu1() {
        int[] array = {14, 9, 8, 15, 34, 5};
        int current;
        for (int i = 0; i < array.length - 1; i++) {
            current = array[i + 1];
            int preIndex = i;
            while (preIndex >= 0 && current < array[preIndex]) {
                array[preIndex + 1] = array[preIndex];
                preIndex--;
            }
            array[preIndex + 1] = current;
            System.out.println(Arrays.toString(array));
        }
    }

    @Test
    public void charu2() {
        int arr[] = {2, 1, 5, 3, 6, 4, 9, 8, 7};
        int temp;
        for (int i = 1; i < arr.length; i++) {
            //待排元素小于有序序列的最后一个元素时，向前插入
            if (arr[i] < arr[i - 1]) {
                temp = arr[i];
                for (int j = i; j >= 0; j--) {
                    if (j > 0 && arr[j - 1] > temp) {
                        arr[j] = arr[j - 1];
                    } else {
                        arr[j] = temp;
                        break;
                    }
                }
            }
            System.out.println(Arrays.toString(arr));
        }
    }


    /**
     * 4、希尔排序（Shell Sort）算法描述
     * 先将整个待排序的记录序列分割成为若干子序列分别进行直接插入排序，具体算法描述：
     * <p>
     * 选择一个增量序列t1，t2，…，tk，其中ti>tj，tk=1；
     * 按增量序列个数k，对序列进行k 趟排序；
     * 每趟排序，根据对应的增量ti，将待排序列分割成若干长度为m 的子序列，分别对各子表进行直接插入排序。
     * 仅增量因子为1 时，整个序列作为一个表来处理，表长度即为整个序列的长度。
     */
    @Test
    public void xier() {
        int[] array = {14, 9, 8, 15, 34, 5};
        int len = array.length;
        int temp, gap = len / 2;
        while (gap > 0) {
            for (int i = gap; i < len; i++) {
                temp = array[i];
                int preIndex = i - gap;
                while (preIndex >= 0 && array[preIndex] > temp) {
                    array[preIndex + gap] = array[preIndex];
                    preIndex -= gap;
                }
                array[preIndex + gap] = temp;
            }
            gap /= 2;
            System.out.println(Arrays.toString(array));
        }
    }

    /**
     * 5、归并排序（Merge Sort）
     * 步骤1：把长度为n的输入序列分成两个长度为n/2的子序列；
     * 步骤2：对这两个子序列分别采用归并排序；
     * 步骤3：将两个排序好的子序列合并成一个最终的排序序列。
     */
    @Test
    public void binggui() {
        int[] array = {14, 9, 8, 15, 34, 5};
        MergeSort(array);
        System.out.println(Arrays.toString(array));

    }

    /**
     * 归并排序
     *
     * @param array
     * @return
     */
    public static int[] MergeSort(int[] array) {
        if (array.length < 2) return array;
        int mid = array.length / 2;
        int[] left = copyOfRange(array, 0, mid);
        int[] right = copyOfRange(array, mid, array.length);
        return merge(MergeSort(left), MergeSort(right));
    }

    /**
     * 归并排序——将两段排序好的数组结合成一个排序数组
     *
     * @param left
     * @param right
     * @return
     */
    public static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        for (int index = 0, i = 0, j = 0; index < result.length; index++) {
            if (i >= left.length)
                result[index] = right[j++];
            else if (j >= right.length)
                result[index] = left[i++];
            else if (left[i] > right[j])
                result[index] = right[j++];
            else
                result[index] = left[i++];
        }
        return result;
    }


    /**
     * 6、快速排序（Quick Sort）
     * 快速排序使用分治法来把一个串（list）分为两个子串（sub-lists）。具体算法描述如下：
     * 步骤1：从数列中挑出一个元素，称为 “基准”（pivot ）；
     * 步骤2：重新排序数列，所有元素比基准值小的摆放在基准前面，所有元素比基准值大的摆在基准的后面（相同的数可以到任一边）。
     * 在这个分区退出之后，该基准就处于数列的中间位置。这个称为分区（partition）操作；
     * 步骤3：递归地（recursive）把小于基准值元素的子数列和大于基准值元素的子数列排序。
     */
    @Test
    public void kuaisu() {
        int arr[] = {65, 58, 95, 10, 57, 62, 13, 106, 78, 23, 85};
        System.out.println("排序前：" + Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);
        System.out.println("排序后：" + Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int left, int right) {
        int pivot = 0;
        if (left < right) {
            pivot = partition(arr, left, right);
            quickSort(arr, left, pivot - 1);
            quickSort(arr, pivot + 1, right);
        }
    }

    private static int partition(int[] arr, int left, int right) {
        int key = arr[left];
        while (left < right) {
            while (left < right && arr[right] >= key) {
                right--;
            }
            arr[left] = arr[right];

            while (left < right && arr[left] <= key) {

                left++;
            }
            arr[right] = arr[left];
        }
        arr[left] = key;
        return left;
    }

    /**
     * https://www.cnblogs.com/onepixel/articles/7674659.html
     * 7、堆排序（Heap Sort）
     * 将初始待排序关键字序列(R1,R2….Rn)构建成大顶堆，此堆为初始的无序区；
     * 将堆顶元素R[1]与最后一个元素R[n]交换，此时得到新的无序区(R1,R2,……Rn-1)和新的有序区(Rn),且满足R[1,2…n-1]<=R[n]；
     * 由于交换后新的堆顶R[1]可能违反堆的性质，因此需要对当前无序区(R1,R2,……Rn-1)调整为新堆，然后再次将R[1]与无序区最后一个元素交换，
     * 得到新的无序区(R1,R2….Rn-2)和新的有序区(Rn-1,Rn)。不断重复此过程直到有序区的元素个数为n-1，则整个排序过程完成。
     */

    /**
     * 8、计数排序（Counting Sort）
     * 计数排序不是基于比较的排序算法，其核心在于将输入的数据值转化为键存储在额外开辟的数组空间中。
     * 作为一种线性时间复杂度的排序，计数排序要求输入的数据必须是有确定范围的整数。
     * 8.1 算法描述
     * 找出待排序的数组中最大和最小的元素；
     * 统计数组中每个值为i的元素出现的次数，存入数组C的第i项；
     * 对所有的计数累加（从C中的第一个元素开始，每一项和前一项相加）；
     * 反向填充目标数组：将每个元素i放在新数组的第C(i)项，每放一个元素就将C(i)减去1。
     */

    /**
     * 9、桶排序（Bucket Sort）
     * 桶排序是计数排序的升级版。它利用了函数的映射关系，高效与否的关键就在于这个映射函数的确定。
     * 桶排序 (Bucket sort)的工作的原理：假设输入数据服从均匀分布，将数据分到有限数量的桶里，每个桶再分别排序
     * （有可能再使用别的排序算法或是以递归方式继续使用桶排序进行排）。
     * 9.1 算法描述
     * 设置一个定量的数组当作空桶；
     * 遍历输入数据，并且把数据一个一个放到对应的桶里去；
     * 对每个不是空的桶进行排序；
     * 从不是空的桶里把排好序的数据拼接起来。
     *
     * @param args
     */

    /**
     * 10、基数排序（Radix Sort）
     * 基数排序是按照低位先排序，然后收集；再按照高位排序，然后再收集；依次类推，直到最高位。
     * 有时候有些属性是有优先级顺序的，先按低优先级排序，再按高优先级排序。
     * 最后的次序就是高优先级高的在前，高优先级相同的低优先级高的在前。
     * 10.1 算法描述
     * 取得数组中的最大数，并取得位数；
     * arr为原始数组，从最低位开始取每个位组成radix数组；
     * 对radix进行计数排序（利用计数排序适用于小范围数的特点）；
     *
     * @param args
     */

}
