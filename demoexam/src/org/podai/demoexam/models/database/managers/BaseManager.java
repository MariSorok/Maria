package org.podai.demoexam.models.database.managers;

import org.podai.demoexam.models.database.MySQLDatabase;

import java.sql.SQLException;
import java.util.List;

abstract public class BaseManager<T> {
    protected MySQLDatabase database;

    public BaseManager() {
        this.database = MySQLDatabase.getInstance();
    }

    abstract public List<T> getAll() throws SQLException;

    abstract public T getOne() throws SQLException;

    abstract public void insert(T entity) throws SQLException;

    abstract public void update(T entity) throws SQLException;

    abstract public void delete(T entity) throws SQLException;
}
