package note;

import java.time.LocalDateTime;

public class NoteBuilder {
    private Note note;

    public NoteBuilder() {
        note = new Note();
        Note.increaseId();
        note.setNoteId(Note.id);
        note.setNoteTimeStamp(LocalDateTime.now().format(Note.DateFormatter));
    }
    public NoteBuilder noteHeader(String noteHeader) {
        note.setNoteHeader(noteHeader);
        return this;
    }
    public NoteBuilder noteDescription(String noteDescription) {
        note.setNoteDescription(noteDescription);
        return this;
    }
    public Note build() {
        return note;
    }
}
