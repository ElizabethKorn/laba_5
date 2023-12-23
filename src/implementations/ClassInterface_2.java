package implementations;

import interfaces.Interface_2;

/**
 * Первая реализация
 * @see OtherClassInterface_2
 */
public class ClassInterface_2 implements Interface_2 {
    @Override
    public void doSomething() {
        System.out.println("Это строка из ClassInterface_2");
    }
}