package note;

import java.time.format.DateTimeFormatter;

public class Note {
    public static long id = 0;
    public static DateTimeFormatter DateFormatter = DateTimeFormatter.ofPattern("dd-MMMM-yyyy HH:mm:ss");
    private long noteId;
    private String noteTimeStamp;
    private String noteHeader;
    private String noteDescription;

    public Note() {
    }
    public long getNoteId() {
        return noteId;
    }

    public void setNoteId(long noteId) {
        this.noteId = noteId;
    }

    public String getNoteTimeStamp() {
        return noteTimeStamp;
    }

    public void setNoteTimeStamp(String noteTimeStamp) {
        this.noteTimeStamp = noteTimeStamp;
    }

    public String getNoteHeader() {
        return noteHeader;
    }

    public void setNoteHeader(String noteHeader) {
        this.noteHeader = noteHeader;
    }

    public String getNoteDescription() {
        return noteDescription;
    }

    public void setNoteDescription(String noteDescription) {
        this.noteDescription = noteDescription;
    }

    public static void increaseId() {
        id++;
    }

    @Override
    public String toString() {
        return "Запись{" +
                "Номер записи=" + noteId +
                ", Время записи=" + noteTimeStamp + '\'' +
                ", Заголовок='" + noteHeader + '\'' +
                ", Описание='" + noteDescription + '\'' +
                '}' + "\n";
    }
}
