package offer;

public class OF05 {

    public String replaceSpace(String s) {
        StringBuilder builder = new StringBuilder();
        for (char c : s.toCharArray()) {
            builder.append(c==' '?"%20":c);
        }
        return builder.toString();
    }
}
