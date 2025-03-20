package com.coding.questions.array;

public class StockProfitRunner {
    public static void main(String[] args) {
      int result1 = StockProfit.maxProfit(new int[]{7, 1, 5, 3, 6, 4});
      int result2 = StockProfit.maxProfit(new int[]{7, 6, 4, 3, 1});

      System.out.println("Result 1: " + result1);
      System.out.println("Result 2: " + result2);
    }
}
