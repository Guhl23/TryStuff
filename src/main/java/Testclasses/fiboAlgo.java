package Testclasses;

import MathAbleitungen.Example;

public class fiboAlgo {

    public Integer algo(Integer n){
        Integer f0=1;
        Integer f1=1;
        switch (n){
            case 0:
                return 1;
            case 1:
                return 1;
            default:
                return algo(n-1)+algo(n-2);
        }
    }
    public static void main(String[] args) {
        Integer n = 46;
        fiboAlgo test = new fiboAlgo();
        System.out.println(test.algo(n));
        for (int i = 0; i<=n; i++){
            System.out.println(test.algo(i));
        }


    }
}
