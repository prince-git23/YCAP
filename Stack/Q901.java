import java.util.*;

class StockSpanner {
    List<Integer> prices;

    public StockSpanner() {
        prices = new ArrayList<>();
    }

    public int next(int price) {
        prices.add(price);
        int span = 1;
        int i = prices.size() - 2;

        while (i >= 0 && prices.get(i) <= price) {
            span++;
            i--;
        }
        return span;
    }
}

public class Q901{
    public static void main(String[] args) {
        StockSpanner obj = new StockSpanner();

        int[] inputs = {100, 80, 60, 70, 60, 75, 85};

        for (int price : inputs) {
            System.out.println(obj.next(price));
        }
    }
}
