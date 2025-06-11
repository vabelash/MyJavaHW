import java.util.List;
import java.util.Arrays;

/**
 * Обновленная версия основного класса
 */
public class CinemaApplicationRun {
    public static void main(String[] args) {
        // Создаем несколько фильмов
        Cinema film1 = new Cinema("Интерстеллар", "фантастика", 2.49);
        Cinema film2 = new Cinema("Крестный отец", "драма", 2.55);
        Cinema film3 = new Cinema("Побег из Шоушенка", "драма", 2.22);
        Cinema film4 = new Cinema("Начало", "фантастика", 2.28);
        Cinema film5 = new Cinema("Форрест Гамп", "драма", 2.22);

        // Создаем пользователей с просмотренными фильмами
        List<Viewer> viewers = Arrays.asList(
            new Viewer("user1", 25, Arrays.asList(film1, film2)),
            new Viewer("user2", 30, Arrays.asList(film3, film4, film5)),
            new Viewer("user3", 20, Arrays.asList(film1)),
            new Viewer("user4", 35, Arrays.asList(film2, film3, film4, film5)),
            new Viewer("user5", 28, Arrays.asList(film1, film3, film5))
        );

        double avgAge = ViewerStatistics.averageAge(viewers);
        System.out.println("Средний возраст: " + avgAge);
        
        // Дополнительная информация
        viewers.forEach(viewer -> 
            System.out.printf("%s (%d лет): просмотрено %d фильмов%n",
                viewer.getNickname(),
                viewer.getAge(),
                viewer.getViewedFilmsCount()));
    }
}