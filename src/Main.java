public class Main {
    public static void main(String[] args) {
        BmiService body = new BmiService();
        double index = body.calculate(1.64, 57);
        System.out.println("Ваш индекс массы тела = " + index);

    }
}
