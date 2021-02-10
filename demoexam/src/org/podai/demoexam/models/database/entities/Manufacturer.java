package org.podai.demoexam.models.database.entities;

public class Manufacturer extends DatabaseEntity {
    private String name;

    public Manufacturer(int id, String name) {
        super(id);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
