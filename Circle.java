

class Circle extends ShapeAbs{
    @Override
    void calculate(int x) {
        double s2 = 3.14 * x * x;
        System.out.println("Реализация метода calculate() для Circle. Площадь круга R = " + x + " равна = " + s2 );
        // Реализация метода calculate для круга() 
    }
}
