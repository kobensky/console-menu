package menu.notemenu;

import menu.IMenu;
import menu.MenuOptions;

import java.util.Arrays;
import java.util.List;

public class NoteMenu implements IMenu {
    private final List<MenuOptions> noteOptions = Arrays.asList(
            MenuOptions.CREATE_NOTE,
            MenuOptions.SHOW_NOTE,
            MenuOptions.DELETE_NOTE,
            MenuOptions.BACK
    );

    public NoteMenu() {

    }

    @Override
    public List<MenuOptions> getOptions() {
        return noteOptions;
    }
}
