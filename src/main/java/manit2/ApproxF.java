package manit2;

public class ApproxF {

    public double f(double x){

        return -2*Math.pow((x-5),2)+50;
    }

    public void approxFlaeche(double n, double a, double b){
        double flaeche = 0;
        double width = (b-a)/n;
        for (double i = a+width; i <= b; i+=width){
            flaeche+=width*f(i);
        }
        System.out.println(flaeche);
    }

    public static void main(String[] args) {
        ApproxF test = new ApproxF();
        test.approxFlaeche(100, 0 , 10);
    }

}
