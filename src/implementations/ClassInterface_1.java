package implementations;

import interfaces.Interface_1;

/**
 * Первая реализация
 * @see OtherClassInterface_1
 */
public class ClassInterface_1 implements Interface_1 {
    @Override
    public void doSomething() {
        System.out.println("Это строка из ClassInterface_1");
    }
}
