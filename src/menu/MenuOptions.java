package menu;

public enum MenuOptions {
    CREATE_NOTE("Создать запись"),
    SHOW_NOTE("Посмотреть записи"),
    DELETE_NOTE("Удалить запись"),
    BACK("Назад"),
    NOTE("Записи"),
    EXIT("Выйти");

    private final String description;

    MenuOptions(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
