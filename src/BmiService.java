public class BmiService {
    public int calculate(double weightInKilogram, double growthInMetres) {
        double bmi = weightInKilogram / growthInMetres / growthInMetres;
        return (int) bmi;

    }
}
