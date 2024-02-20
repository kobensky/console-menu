package screen.notescreen;

import menu.notemenu.NoteMenu;
import note.Note;
import screen.Screen;

import java.util.ArrayList;
import java.util.List;

public class NoteScreen extends Screen {
    private List<Note> notes = new ArrayList<>();
    private final String NOTE_SCREEN_HEADER = "Записи.";

    public NoteScreen() {
        super(new NoteMenu());
        super.setMenuHeader(NOTE_SCREEN_HEADER);
    }

    public List<Note> getNotes() {
        return notes;
    }

    public void setNote(Note note) {
        this.notes.add(note);
    }

    public boolean deleteNote(long noteId) {
        return getNotes().removeIf(note -> note.getNoteId() == noteId);
    }
}
