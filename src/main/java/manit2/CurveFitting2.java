package manit2;

import java.util.ArrayList;
import java.util.List;

public class CurveFitting2 {

    public Result expFit(List<Double> x, List<Double> y){
        List<Double> v = new ArrayList<>();
        for (Double yWert: y){
            v.add(Math.log10(yWert));
        }
        Line line = new Line();
        Result result = line.fit(x,v);
        return new Result(Math.pow(10.0,result.getA()), Math.pow(10.0,result.getB()));
    }

    public static void main(String[] args) {
        CurveFitting2 test = new CurveFitting2();
        ArrayList<Double> x = new ArrayList<Double>();
        x.add(1.0);
        x.add(3.0);
        x.add(4.0);
        x.add(6.0);
        x.add(7.0);
        ArrayList<Double> y = new ArrayList<Double>();
        y.add(4.5);
        y.add(10.0);
        y.add(15.0);
        y.add(34.0);
        y.add(52.0);
        Result testResult = test.expFit(x,y);
        System.out.println("C: " + testResult.getA());
        System.out.println("D: " + testResult.getB());
    }
}
