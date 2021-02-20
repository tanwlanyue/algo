package offer;

public class OF67 {
    public int strToInt(String str) {
        char[] array = str.toCharArray();
        int i = 0;
        int length = str.length();
        if (length == 0) {
            return 0;
        }
        int ret = 0;
        while (i < length && array[i] == ' ') {
            i++;
        }
        boolean flag = true;
        if (i < length && (array[i] == '+' || array[i] == '-')) {
            if (array[i] == '-') {
                flag = false;
            }
            i++;
        }
        while (i < length) {
            if (!Character.isDigit(array[i])) {
                break;
            }
            if (ret > Integer.MAX_VALUE / 10 || ret == Integer.MAX_VALUE / 10 && array[i]-'0' > 7) {
                return flag ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            ret = ret * 10 + array[i] - '0';
            i++;
        }
        return flag ? ret : -ret;
    }
}
