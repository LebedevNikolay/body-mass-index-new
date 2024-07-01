public class BmiService {
    public int calculate(double weight, double height) {
        double myBodyMassIndex = weight / Math.pow(height, 2);
        int Index = (int) myBodyMassIndex;
        return Index;
    }
}