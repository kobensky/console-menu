package screen.mainscreen;

import menu.Menu;
import screen.Screen;

public class MainScreen extends Screen {
    private final String MAIN_SCREEN_HEADER = "Главный экран.";

    public MainScreen(Menu menu) {
        super(menu);
        super.setMenuHeader(MAIN_SCREEN_HEADER);
    }
}
