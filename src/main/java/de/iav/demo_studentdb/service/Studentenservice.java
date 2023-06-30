package de.iav.demo_studentdb.service;

import de.iav.demo_studentdb.StudentInputController;

public class Studentenservice {
    private static Studentenservice instance;

    public static synchronized Studentenservice getInstance() {
        if (instance == null) {
            instance = new Studentenservice();
        }
        return instance;
    }
}
