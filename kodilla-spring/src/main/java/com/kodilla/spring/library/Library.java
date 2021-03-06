package com.kodilla.spring.library;

import java.util.ArrayList;
import java.util.List;

public final class Library {

    private final List<String> books = new ArrayList<>();
    private LibraryDbController libraryDbController;

    public Library(final LibraryDbController libraryDbController) {
        this.libraryDbController = libraryDbController;
    }

    public Library() {
        //do nothing
        //W sytuacji, gdy klasa posiada więcej niż jeden konstruktor,
        // konieczne jest wskazanie w jakiś sposób Springowi,
        // którego konstruktora ma użyć do wstrzyknięcia beanów.
        // Robimy to przy pomocy adnotacji @Autowired:
    }

    public void saveToDb() {
        libraryDbController.saveData();
    }

    public void loadFromDb() {
        libraryDbController.loadData();
    }
}
