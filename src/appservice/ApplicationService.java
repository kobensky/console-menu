package appservice;

import menu.MenuOptions;
import menu.mainmenu.MainMenu;
import menu.notemenu.NoteMenu;
import note.Note;
import note.NoteBuilder;
import screen.mainscreen.MainScreen;
import screen.Screen;

import java.util.Scanner;

public class ApplicationService {
    private boolean isRunning = true;
    private final Scanner scanner;
    private Screen screen;

    public ApplicationService() {
        this.scanner = new Scanner(System.in);
        this.screen = new MainScreen(new MainMenu());
    }

    public void run() {
        while (isRunning) {
            screen.displayMenu();
            String userInput = scanner.nextLine();
            if (MenuOptions.NOTE.getDescription().equals(userInput)) {
                screen.setMenu(new NoteMenu());
            } else if (MenuOptions.CREATE_NOTE.getDescription().equals(userInput)) {
                Note note1 = new NoteBuilder()
                        .noteHeader("Первая запись, Хеллоу!")
                        .noteDescription("Описание первой записи")
                        .build();

            } else {
                isRunning = false;
            }
        }
        scanner.close();
    }
}
