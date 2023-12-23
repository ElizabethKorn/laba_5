package implementations;

import interfaces.Interface_1;

/**
 * Вторая реализация
 * @see ClassInterface_1
 */
public class OtherClassInterface_1 implements Interface_1 {
    @Override
    public void doSomething() {
        System.out.println("Это строка из OtherClassInterface_1");
    }
}
