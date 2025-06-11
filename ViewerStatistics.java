import java.util.List;

/**
 * Утилитный класс для статистики по пользователям
 */
public class ViewerStatistics {
    /**
     * Вычисляет средний возраст пользователей
     * @param viewers список пользователей
     * @return средний возраст
     */
    public static double averageAge(List<Viewer> viewers) {
        return viewers.stream()
                .mapToInt(Viewer::getAge)
                .average()
                .orElse(0);
    }
}