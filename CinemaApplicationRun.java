import java.util.List;
import java.util.Arrays;

/**
 * Основной класс приложения
 */
public class CinemaApplicationRun {
    public static void main(String[] args) {
        List<Viewer> viewers = Arrays.asList(
            new Viewer("user1", 25, 10),
            new Viewer("user2", 30, 15),
            new Viewer("user3", 20, 5),
            new Viewer("user4", 35, 20),
            new Viewer("user5", 28, 12)
        );

        double avgAge = ViewerStatistics.averageAge(viewers);
        System.out.println("Средний возраст: " + avgAge);
    }
}