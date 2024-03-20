import java.util.Arrays;
import java.util.Collections;

public class DescendingOrder {
    public static int sortDesc(final int num) {
        String[] array = String.valueOf(num).split("");
        Arrays.sort(array, Collections.reverseOrder());
        return Integer.valueOf(String.join("", array));
    }

    public static void main(String[] args) {
        DescendingOrder descendingOrder = new DescendingOrder();
        int num = 42145;
        int res = sortDesc(num);
        System.out.println(res);
    }
}

