import java.util.Scanner;

import java.util.Scanner;

public class Menuresult {

    public boolean menuDisplay;

    public boolean isMenuDisplay() {
        return menuDisplay;
    }

    public void setMenuDisplay(boolean menuDisplay) {
        this.menuDisplay = menuDisplay;
    }

    public boolean isLemenu() {
        return lemenu;
    }

    public void setLemenu(boolean lemenu) {
        this.lemenu = lemenu;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public boolean lemenu;

    public Scanner scanner;

    public Menuresult(boolean menuDisplay, boolean lemenu) {
        this.menuDisplay = menuDisplay;
        this.lemenu = lemenu;
    }

    public Menuresult(boolean menuDisplay, boolean lemenu, Scanner scanner) {
        this.menuDisplay = menuDisplay;
        this.lemenu = lemenu;
        this.scanner = scanner;
    }


}
