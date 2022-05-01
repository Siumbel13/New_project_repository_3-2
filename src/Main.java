public class Main {

    public static void main(String[] args) {
        BmiService bmiService = new BmiService();

        double bmi = bmiService.calulate(55,1.70);

        System.out.println("Индекс массы тела = " + bmi);
    }
}
