public class BmiService {
    double weight;
    double height;
    public double calculate(double weight, double height) {
        double bmi = weight / (height * height);
        System.out.println("Your body mass index is " + bmi);
        return bmi;
    }
}
