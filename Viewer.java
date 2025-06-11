import java.util.List;

/**
 * Обновленный класс пользователя с списком фильмов
 */
public class Viewer {
    private String nickname;
    private int age;
    private List<Cinema> viewedFilms;

    public Viewer(String nickname, int age, List<Cinema> viewedFilms) {
        this.nickname = nickname;
        this.age = age;
        this.viewedFilms = viewedFilms;
    }

    // Геттеры
    public String getNickname() { return nickname; }
    public int getAge() { return age; }
    public List<Cinema> getViewedFilms() { return viewedFilms; }
    
    /**
     * @return количество просмотренных фильмов
     */
    public int getViewedFilmsCount() {
        return viewedFilms != null ? viewedFilms.size() : 0;
    }
}