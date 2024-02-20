package screen;

import menu.IMenu;
import menu.MenuOptions;

public abstract class Screen {
    private IMenu menu;
    private String menuHeader;

    public Screen(IMenu menu) {
        this.menu = menu;
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
