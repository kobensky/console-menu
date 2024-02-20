package screen.mainscreen;

import menu.mainmenu.MainMenu;
import screen.Screen;

public class MainScreen extends Screen {
    private final String MAIN_SCREEN_HEADER = "Главный экран.";

    public MainScreen() {
        super(new MainMenu());
        super.setMenuHeader(MAIN_SCREEN_HEADER);
    }

}
