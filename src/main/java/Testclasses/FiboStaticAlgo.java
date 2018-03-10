package Testclasses;

public class FiboStaticAlgo {
    public Integer algo(Integer n){
        Integer f0=1;
        Integer f1=1;
        switch (n){
            case 0:
                return 1;
            case 1:
                return 1;
            default:
                Integer i=2;
                while (i<=n) {
                    Integer zwischenR=f1;
                    f1 += f0;
                    f0 = zwischenR;
                    i++;
                }
                return f1;
        }
    }
    public static void main(String[] args) {
        Integer n = 100;
        FiboStaticAlgo test = new FiboStaticAlgo();
        System.out.println(test.algo(n));
        for (int i = 0; i<=n; i++){
            System.out.println(test.algo(i));
        }
    }
}
