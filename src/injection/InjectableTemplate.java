package injection;
import annotations.AutoInjectable;
import interfaces.Interface_1;
import interfaces.Interface_2;

/**
 * Класс для демонстрации работы
 * @see AutoInjectable
 */
public class InjectableTemplate {
    @AutoInjectable
    private Interface_1 field1;
    @AutoInjectable
    private Interface_2 field2;

    public void printSomething() {
        field1.doSomething();
        field2.doSomething();
    }
}
