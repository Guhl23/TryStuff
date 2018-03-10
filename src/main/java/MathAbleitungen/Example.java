package MathAbleitungen;

public class Example {

    public double f(double x){
        return Math.pow(x,2);
    }

    public double differentiate(double x0){
        return (f(x0+0.001)-f(x0))/0.001;
    }

    public static void main(String[] args) {
        double x0 = 1;
        Example example = new Example();
        System.out.println(example.differentiate(x0));

    }
}
