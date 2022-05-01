public class BmiService {

    public double calculate(int weight, double hight) {

        double calculate = weight / Math.pow(hight, 2);

        return calculate;

    }

}


