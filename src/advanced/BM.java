package advanced;

import java.util.Arrays;

/**
 * TODO
 * 坏字符+好后缀 选择向后滑动最大的那个
 * 好后缀要注意后缀的子串 不能过度滑动
 */
public class BM {

    private int[] generateBC(char[] array) {
        int[] bc = new int[256];// 记录模式串中每个字符最后出现的位置
        Arrays.fill(bc,-1);
        for (int i = 0; i < array.length; i++) {
            bc[(int)array[i]] = i;
        }
        return bc;
    }

    // b 表示模式串，m 表示长度，suffix，prefix 数组事先申请好了
    private void generateGS(String str2, int[] suffix, boolean[] prefix) {
        char[] b=str2.toCharArray();
        int m=b.length;
        Arrays.fill(suffix,-1);
        Arrays.fill(prefix,false);
        for (int i = 0; i < m - 1; ++i) { // b[0, i]
            int j = i;
            int k = 0; // 公共后缀子串长度
            while (j >= 0 && b[j] == b[m-1-k]) { // 与 b[0, m-1] 求公共后缀子串
                --j;
                ++k;
                suffix[k] = j+1; //j+1 表示公共后缀子串在 b[0, i] 中的起始下标
            }
            if (j == -1) prefix[k] = true; // 如果公共后缀子串也是模式串的前缀子串
        }
    }





    public int bm(String str1, String str2) {
        char[] a=str1.toCharArray();
        char[] b=str2.toCharArray();
        int n=a.length;
        int m=b.length;
        int[] bc = generateBC(b);
        int i = 0; // i表示主串与模式串对齐的第一个字符
        while (i <= n - m) {
            int j;
            for (j = m - 1; j >= 0; --j) { // 模式串从后往前匹配
                if (a[i+j] != b[j]) break; // 坏字符对应模式串中的下标是 j
            }
            if (j < 0) {
                return i; // 匹配成功，返回主串与模式串第一个匹配的字符的位置
            }
            // 这里等同于将模式串往后滑动 j-bc[(int)a[i+j]] 位
            i = i + (j - bc[(int)a[i+j]]);
        }
        return -1;
    }
}
