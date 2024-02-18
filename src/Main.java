import appservice.ApplicationService;
import note.Note;
import note.NoteBuilder;

public class Main {
    public static void main(String[] args) {
        Note note1 = new NoteBuilder()
                .noteHeader("Первая запись, Хеллоу!")
                .noteDescription("Описание первой записи")
                .build();
        System.out.println(note1);
        ApplicationService app = new ApplicationService();
        app.run();
    }
}
