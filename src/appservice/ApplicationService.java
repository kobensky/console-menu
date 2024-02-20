package appservice;

import menu.MenuOptions;
import note.NoteBuilder;
import screen.mainscreen.MainScreen;
import screen.notescreen.NoteScreen;

import java.util.Scanner;

public class ApplicationService {
    private boolean isRunning = true;
    private final Scanner scanner;
    private final MainScreen mainScreen;
    private final NoteScreen noteScreen;

    public ApplicationService() {
        this.scanner = new Scanner(System.in);
        this.mainScreen = new MainScreen();
        this.noteScreen = new NoteScreen();
    }

    public void run() {
        while (isRunning) {
            mainScreen.displayMenu();
            String menuInput = scanner.nextLine();
            if (MenuOptions.NOTE.getDescription().equals(menuInput)) {
                noteMenuRun();
            } else {
                isRunning = false;
            }
        }
        scanner.close();
    }

    private void noteMenuRun() {
        boolean isRunning = true;
        while (isRunning) {
            noteScreen.displayMenu();
            String noteMenuInput = scanner.nextLine();
            if (MenuOptions.CREATE_NOTE.getDescription().equals(noteMenuInput)) {
                createNoteDialog();
            } else if (MenuOptions.SHOW_NOTE.getDescription().equals(noteMenuInput)) {
                System.out.println(noteScreen.getNotes());
            } else if (MenuOptions.DELETE_NOTE.getDescription().equals(noteMenuInput)) {
                System.out.println("Введите номер записи которую хотите удалить:");
                System.out.println(noteScreen.deleteNote(Integer.parseInt(scanner.nextLine())));
            } else {
                isRunning = false;
            }
        }
    }

    private void createNoteDialog() {
        System.out.println("Введите заголовок записи:");
        String headerInput = scanner.nextLine();
        System.out.println("Введите запись:");
        String descriptionInput = scanner.nextLine();
        noteScreen.setNote(new NoteBuilder().noteHeader(headerInput).noteDescription(descriptionInput).build());
    }
}
