// Question 4: Stock Span Promble
// max no of consecutive days for which ==> price <= today price

import java.util.Stack;

public class Question4StockSpan {
    
    static void stockSpan(int[] stocks, int[] span) {
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);
        for (int i = 1; i < stocks.length; i++) {
            int currPrice = stocks[i];
            
            while (!s.isEmpty() && currPrice > stocks[s.peek()]) {
                s.pop();
            }

            if (s.isEmpty()) {
                System.out.println("Hek" + stocks.length);
                span[i] = i + 1;
            }
            else{
                int preHigh = s.peek();
                span[i] = i - preHigh;
            }
            s.push(i);
        }
        
    }

    public static void main(String[] args) {
        int stocks[] = {100,40,60,40,120};
        int span[] = new int[stocks.length];
        stockSpan(stocks, span);

        for(int i = 0; i<span.length; i++){
            System.out.print(span[i] + " ");
        }
    }
}