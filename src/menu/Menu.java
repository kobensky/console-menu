package menu;

import java.util.Set;

public abstract class Menu {
    private Set<MenuOptions> options;

    public Menu(Set<MenuOptions> options) {
        this.options = options;
    }

    public Set<MenuOptions> getOptions() {
        return options;
    }
}
