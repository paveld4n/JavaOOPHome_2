


public class Task implements I_Const{
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(2, 4);

        Сalculations c1 = new Сalculations();

        Heir h = new Heir();

        MyClass m = new MyClass();


        // Было в задании сем 1
        r1.calculateArea();
        r2.calculateArea();
        r1.calculatePerimeter();
        r2.calculatePerimeter();
        // - интерфейсы,
        c1.setStart(2,4);
        System.out.printf("Периметр через интерфейс: %d\n", c1.getPerimeter());
        System.out.printf("Площадь через интерфейс: %d\n", c1.getSquare());
        // Kонстанты
        double Ck;
        Ck = Pi * 4 * 4;
        System.out.println("Площадь круга вписанного в квадрат 4X4 (учет Константа Пи)= " + Ck);
        // Наследует / расширен
        h.num1(2, 4);
        h.num2(2, 4);
        h.num3(4);

        System.out.println("Имя пользователя (default method): " + m.getUserName());
        System.out.println("Место расположения (default method): " + m.getUserPoint());
        //- default методы
        ShapeAbs circle = new Circle();
        circle.calculate(4); // вызов метода drew для Circle

        ShapeAbs square = new Square();
        square.calculate(4); // вызов метода drew для Прямоугольника

    }
    
}

