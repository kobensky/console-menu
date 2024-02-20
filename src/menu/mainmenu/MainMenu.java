package menu.mainmenu;

import menu.IMenu;
import menu.MenuOptions;

import java.util.Arrays;
import java.util.List;

public class MainMenu implements IMenu {
    private final List<MenuOptions> mainMenuOptions = Arrays.asList(
            MenuOptions.NOTE,
            MenuOptions.EXIT
    );

    public MainMenu() {
    }

    @Override
    public List<MenuOptions> getOptions() {
        return mainMenuOptions;
    }
}
