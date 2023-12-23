package implementations;

import interfaces.Interface_2;

/**
 * Вторая реализация
 * @see ClassInterface_2
 */
public class OtherClassInterface_2 implements Interface_2 {
    @Override
    public void doSomething() {
        System.out.println("Это строка из OtherClassInterface_2");
    }
}
