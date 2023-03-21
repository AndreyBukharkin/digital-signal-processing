package lab1;

public class Results {

    private void round(double[] numb){
        for (int i = 0; i < numb.length; i++) {
            numb[i] *= 100;
            numb[i] = Math.round(numb[i]);
            numb[i] /= 100;
        }
    }

    public double[] div(double[] o1, double o2){
        double [] result = new double[o1.length];
        for (int i = 0; i < o1.length; i++) {
            result[i] = o1[i] / o2;
            round( result);
        }
        return  result;

    }

    public double[] mul(double[] o1, double[] divResult){
        double [] result = new double[o1.length];
        for (int i = 0; i < o1.length; i++) {
            result[i] = o1[i] * divResult[i];
            round(result);
        }
        return result;
    }

    public double[] add(double[] mulResult, double o2){
        double [] result = new double[mulResult.length];
        for (int i = 0; i < mulResult.length; i++) {
            result[i] = mulResult[i] + o2;
            round(result);
        }
        return result;
    }

    public double[] pow(double[] o1){
        double [] result = new double[o1.length];
        for (int i = 0; i < o1.length; i++) {
            result[i] = Math.pow(o1[i], 3);
            round(result);
        }
        return result;
    }
}