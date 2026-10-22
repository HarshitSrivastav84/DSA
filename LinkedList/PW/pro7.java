import java.util.*;

class pro7 {
    public static void main(String[] args) {
        int[] weight = {5, 10, 15};
        int[] value = {10, 20, 30};
        int W = 20;

        double[][] items = new double[weight.length][2];

        for (int i = 0; i < weight.length; i++) {
            items[i][0] = weight[i];
            items[i][1] = (double) value[i] / weight[i];
        }

        Arrays.sort(items, (a, b) ->
            Double.compare(b[1], a[1]));

        double total = 0;

        for (int i = 0; i < items.length; i++) {
            if (W == 0)
                break;

            if (items[i][0] <= W) {
                W -= (int) items[i][0];
                total += items[i][0] * items[i][1];
            } else {
                total += W * items[i][1];
                W = 0;
            }
        }

        System.out.printf("%.4f%n", total);
    }
}
