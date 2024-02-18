package screen.notescreen;

import menu.Menu;
import note.Note;
import screen.Screen;

import java.util.ArrayList;
import java.util.List;

public class NoteScreen extends Screen {
    private List<Note> notes = new ArrayList<>();
    private final String NOTE_SCREEN_HEADER = "Записи.";
    public NoteScreen(Menu menu) {
        super(menu);
        super.setMenuHeader(NOTE_SCREEN_HEADER);
    }

    public List<Note> getNotes() {
        return notes;
    }

    public void setNotes(Note note) {
        this.notes.add(note);
    }
}
