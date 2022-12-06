public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 96;
        double height = 1.87;
        double bmi = service.calculate(weight, height);
        ;
    }
}