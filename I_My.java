

public interface I_My {
    String getUserName(); // объявление обычного метода интерфейса, кот не включет определение реализации

    default String getUserPoint() { // демонстрация метода по умолчанию. Можноперназначить в классе My_class
    return "Москва";
    }
}
