import java.util.Arrays;

public class prog7 {
    public static int[] mergesort(int[] sortArr) {
        int[] b1 = Arrays.copyOf(sortArr, sortArr.length);
        int[] b2 = new int[sortArr.length];
        int[] result = mergeSortInner(b1, b2, 0, sortArr.length);
        return result;
    }

    public static int[] mergeSortInner(int[] b1, int[] b2, int si, int ei) {
        if (si >= ei - 1) {
            return b1;
        }

        int mid = si + (ei - si) / 2;
        int[] sorted1 = mergeSortInner(b1, b2, si, mid);
        int[] sorted2 = mergeSortInner(b1, b2, mid, ei);

        int index1 = si;
        int index2 = mid;
        int destIndex = si;
        int[] result = sorted1 == b1 ? b2 : b1;
        while (index1 < mid && index2 < ei) {
            result[destIndex++] = sorted1[index1] < sorted2[index2] ? sorted1[index1++] : sorted2[index2++];
        }
        while (index1 < mid) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < ei) {
            result[destIndex++] = sorted2[index2++];
        }
    return result;
    }
    public static void main(String args[]) {
        int[] sortArr = {12,6,4,1,15,10,2};
        int[] result = mergesort(sortArr);
        System.out.println(Arrays.toString(result));
    }
}