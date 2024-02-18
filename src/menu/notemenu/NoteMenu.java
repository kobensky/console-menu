package menu.notemenu;

import menu.Menu;
import menu.MenuOptions;

import java.util.Set;

public class NoteMenu extends Menu {
    public NoteMenu() {
        super(Set.of(MenuOptions.CREATE_NOTE, MenuOptions.SHOW_NOTE, MenuOptions.DELETE_NOTE, MenuOptions.BACK));
    }
}
