package org.podai.demoexam.models.database.entities;

abstract public class DatabaseEntity {
    protected int id = -1;

    public DatabaseEntity(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
