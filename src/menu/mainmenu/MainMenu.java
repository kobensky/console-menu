package menu.mainmenu;

import menu.Menu;
import menu.MenuOptions;

import java.util.Set;

public class MainMenu extends Menu {
    public MainMenu() {
        super(Set.of(MenuOptions.NOTE, MenuOptions.EXIT));
    }
}
