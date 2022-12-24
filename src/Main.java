public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float growth = 165;
        float weight = 61.4F;
        float bmi = service.calculate(weight, growth);
        System.out.println(bmi);

    }
}
