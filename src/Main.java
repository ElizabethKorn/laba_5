import injection.InjectableTemplate;
import injection.Injector;

/**
 * Главный класс приложения.
 */
public class Main {
    /**
     * Точка входа в программу.
     * Реализует взаимодействие с пользователем.
     * @param args аргументы командной строки.
     */
    public static void main(String[] args) {
        String basicPath = System.getProperty("user.dir") + "\\src\\resources\\";
        String[] testPaths = {
                basicPath + "test1.properties",
                basicPath + "test2.properties",
                basicPath + "test3.properties",
                basicPath + "test4.properties"
        };

        System.out.println("===================================");
        for (int i = 0; i < testPaths.length; i++) {
            System.out.println("" + (i + 1) + " тест : ");
            System.out.println("-----------------------------------");
            try {
                InjectableTemplate test = (new Injector(testPaths[i])).inject(new InjectableTemplate());
                test.printSomething();
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
            System.out.println("===================================");
        }
    }
}
