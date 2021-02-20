package basic;

public class BinarySearch {

    // 查找第一个值等于给定值的元素
    private int firstEquals(int[] arr, int target) {
        int l = 0, r = arr.length - 1;
        while (l < r) {
            int mid = l + ((r - l) >> 1);
            if (arr[mid] < target) l = mid + 1;
            else r = mid; // 收缩右边界不影响 first equals
        }
        if (arr[l] == target && (l == 0 || arr[l - 1] < target)) return l;
        return -1;
    }

    // 查找最后一个值等于给定值的元素
    private int lastEquals(int[] arr, int target) {
        int l = 0, r = arr.length - 1;
        while (l < r) {
            int mid = l + ((r - l + 1) >> 1);
            if (arr[mid] > target) r = mid - 1;
            else l = mid; // 收缩左边界不影响 last equals
        }
        if (arr[l] == target && (l == arr.length - 1 || arr[l + 1] > target)) return l;
        return -1;
    }

    // 查找第一个大于等于给定值的元素
    private int firstLargeOrEquals(int[] arr, int target) {
        int l = 0, r = arr.length - 1;
        while (l < r) {
            int mid = l + ((r - l) >> 1);
            if (arr[mid] < target) l = mid + 1;
            else r = mid; // 收缩右边界不影响 first equals
        }
        if (arr[l] >= target && (l == 0 || arr[l - 1] < target)) return l; // >=
        return -1;
    }

    // 查找最后一个小于等于给定值的元素
    private int lastLessOrEquals(int[] arr, int target) {
        int l = 0, r = arr.length - 1;
        while (l < r) {
            int mid = l + ((r - l + 1) >> 1);
            if (arr[mid] > target) r = mid - 1;
            else l = mid; // 收缩左边界不影响 last equals
        }
        if (arr[l] <= target && (l == arr.length - 1 || arr[l + 1] > target)) return l; // <=
        return -1;
    }
}
