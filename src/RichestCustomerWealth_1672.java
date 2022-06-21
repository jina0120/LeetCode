import java.util.Arrays;

public class RichestCustomerWealth_1672 {
    public int maximumWealth(int[][] accounts) {
        int[] rstArr = new int[accounts.length];

        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;

            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            rstArr[i] = sum;
        }

        return Arrays.stream(rstArr).max().getAsInt();
    }
}
