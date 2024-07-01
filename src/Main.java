public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 120; // Масса тела в КГ
        double height = 1.9; // Рост в метрах
        double myBodyMassIndex = service.calculate(weight, height);

        System.out.println("Ваш индекс массы тела:" + myBodyMassIndex);
    }
}