

public class Heir implements I_B{
    @Override
    public void num1(int a, int b) {
        int p = (a + b) * 2;
        System.out.println("Method num1 (Значение периметра) = " + p);
    }

    @Override
    public void num2(int a, int b) {
        int s1 = a * b;
        System.out.println("Method num2 (Площадь прямогугольника) = " + s1);
    }

    @Override
    public void num3(int r) {
        double s2 = 3.14 * r * r;
        System.out.println("Method num3 (Площадь круга вписанного в квадрат) со стороной " + 2*r + " равна = " + s2);
    }
    
}

