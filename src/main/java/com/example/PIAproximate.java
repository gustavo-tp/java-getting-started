package com.example;

public class PIAproximate {
    public PIAproximate() {
    }
  
    public static double getPI(int iteracoes) {      
        double pi = 0.0;
        int divisor = 1;
      
        for (int i = 0; i < iteracoes; i++) {
          if (i%2 == 0)
            pi += (1.0 / divisor);
          else 
            pi -= (1.0 / divisor);
          divisor += 2;
        }
        
        pi *= 4;
        
        return pi;
    }
}