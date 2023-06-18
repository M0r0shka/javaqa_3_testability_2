public class Main {
    public static void main(String[] args) {
        double weightInKilogram = 98;
        double growthInMetres = 1.87;

        BmiService service = new BmiService();
        int bmi = service.calculate(weightInKilogram, growthInMetres);
        System.out.println(bmi);

    }
}