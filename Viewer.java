/**
 * Класс пользователя онлайн-кинотеатра
 */
public class Viewer {
    private String nickname;
    private int age;
    private int viewedFilmsCount;

    public Viewer(String nickname, int age, int viewedFilmsCount) {
        this.nickname = nickname;
        this.age = age;
        this.viewedFilmsCount = viewedFilmsCount;
    }

    // Геттеры
    public String getNickname() { return nickname; }
    public int getAge() { return age; }
    public int getViewedFilmsCount() { return viewedFilmsCount; }
}