package org.podai.demoexam.models.database.managers;

import org.podai.demoexam.models.database.entities.Manufacturer;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class ManufacturerManager extends BaseManager<Manufacturer> {
    public ManufacturerManager() {
        super();
    }

    @Override
    public List<Manufacturer> getAll() throws SQLException {
        try (Connection c = database.getConnection()) {

        }
    }

    @Override
    public Manufacturer getOne() throws SQLException {
        try (Connection c = database.getConnection()) {

        }
    }

    @Override
    public void insert(Manufacturer entity) throws SQLException {
        try (Connection c = database.getConnection()) {

        }
    }

    @Override
    public void update(Manufacturer entity) throws SQLException {
        try (Connection c = database.getConnection()) {

        }
    }

    @Override
    public void delete(Manufacturer entity) throws SQLException {
        try (Connection c = database.getConnection()) {

        }
    }
}
