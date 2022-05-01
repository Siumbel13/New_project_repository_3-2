public class BmiService {

    public double calulate (int weight, double hight) {

       double calculate = weight / Math.pow(hight,2);

       return calculate;

        //System.out.println("Индекс массы тела = " + calculate);
    }

}


