	public class EquationsApp {
    public static void main(String[] args) {
        CalculateTheEquationInterface calc = new CalculateTheEquation();
        System.out.println("  y=tg(x)*ctg(2x)  = " + calc.doCalculation(200));
        System.out.println("   y=tg(x)*ctg(2x) = " + calc.doCalculation(80));
        System.out.println("   y=tg(x)*ctg(2x) = " + calc.doCalculation(-5555));

        System.out.println("   y=tg(x)*ctg(2x) = " + calc.doCalculationWithInputInside());
    }
}
