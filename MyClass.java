

public class MyClass implements I_My {
    @Override
    public String getUserName() {
        return "Исполнитель - Иванов Иван МГТУ";
    }
    @Override
    public String getUserPoint() { // Переназначение дефолтного значения
    return "Московская губерния";
    }
}
