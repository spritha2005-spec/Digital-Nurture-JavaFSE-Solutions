public class Main {

    public static void main(String[] args) {

        double currentValue = 10000;
        double growthRate = 0.10; // 10%
        int years = 5;

        double futureValue = FinancialForecasting.predictFutureValue(
                currentValue, growthRate, years);

        System.out.println("Future Value after " + years + " years = " + futureValue);
    }
}