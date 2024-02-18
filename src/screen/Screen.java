package screen;

import menu.Menu;
import menu.MenuOptions;

public abstract class Screen {
    private Menu menu;
    private String menuHeader;

    public Screen(Menu menu) {
        this.menu = menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }
    public Menu getMenu() {
        return menu;
    }
    public String getMenuHeader() {
        return menuHeader;
    }
    public void setMenuHeader(String menuHeader) {
        this.menuHeader = menuHeader;
    }

    public void displayMenu() {
        int index = 1;
        System.out.println(menuHeader);
        for(MenuOptions option : menu.getOptions()) {
            System.out.println("-> " + index++ + " : " + option.getDescription());
        }
    }
}
