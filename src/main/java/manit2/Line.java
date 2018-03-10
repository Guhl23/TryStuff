package manit2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Line {


    public Result fit (List<Double> x, List<Double> y){
        Double xTilde = 0.0;
        Double yTilde = 0.0;
        for (Double zahl: x) {
            xTilde+=zahl;
        }
        xTilde = xTilde / x.size();

        for (Double zahl: y) {
            yTilde+=zahl;
        }
        yTilde = yTilde / y.size();

        Double obe = 0.0;
        Double unne = 0.0;
        for(int i = 0; i < x.size(); i++){
            obe += (x.get(i)-xTilde) * (y.get(i)-yTilde);
            unne += (x.get(i)-xTilde)*(x.get(i)-xTilde);
        }
        Double a = obe / unne;
        Double b = yTilde - a*xTilde;
        System.out.println("A: "+a);
        System.out.println("B: "+b);
        return new Result(a,b);
    }
    public Double gerade(Result result, Double x){
        return result.getA()*x + result.getB();
    }
    public Double geradeReverse(Result result, Double y){
        return (y-result.getB())/result.getA();
    }

    public static void main(String[] args) {
        Line test = new Line();
        ArrayList<Double> x = new ArrayList<Double>();
        x.add(1.0);
        x.add(4.0);
        x.add(5.0);
        x.add(8.0);
        x.add(9.0);
        ArrayList<Double> y = new ArrayList<Double>();
        y.add(6.0);
        y.add(12.0);
        y.add(14.0);
        y.add(18.0);
        y.add(19.0);
        test.fit(x,y);
        System.out.println(test.gerade(test.fit(x,y),9.0));
        Double[] xVals = new Double[]{
                10.0,
                42.0,
                38.0,
                15.0,
                22.0,
                32.0,
                40.0,
                14.0,
                26.0,
                32.0,
                38.0,
                25.0,
                48.0,
                28.0,
                22.0,
                45.0,
                18.0,
                24.0,
                30.0,
                43.0,
        };

        Double[] yVals = new Double[]{
                450.0,
                1050.0,
                900.0,
                525.0,
                710.0,
                854.0,
                800.0,
                493.0,
                730.0,
                894.0,
                940.0,
                733.0,
                985.0,
                763.0,
                583.0,
                850.0,
                798.0,
                754.0,
                805.0,
                1085.0,
        };

        List<Double> x2 = Arrays.asList(xVals);
        List<Double> y2 = Arrays.asList(yVals);
        Result test2 = test.fit(x2,y2);
        System.out.println(test.gerade(test2, 50.0));
        //Aufgabe 4
        System.out.println(test.gerade(test2, 36.0));
        //Aufgabe 5
        System.out.println(test.geradeReverse(test2,1000.0));
    }
}
