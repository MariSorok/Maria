package org.podai.demoexam.models;

import org.podai.demoexam.models.database.entities.Manufacturer;
import org.podai.demoexam.models.database.managers.BaseManager;
import org.podai.demoexam.models.database.managers.ManufacturerManager;

import java.sql.SQLException;
import java.util.List;

public class ManufacturerModel {
    private static ManufacturerModel instance;
    private BaseManager<Manufacturer> manager;
    private List<Manufacturer> manufacturers;

    private ManufacturerModel() {
        try {
            manager = new ManufacturerManager();
            setManufacturers();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static ManufacturerModel getInstance() {
        if (instance == null) {
            instance = new ManufacturerModel();
        }
        return instance;
    }

    public void setManufacturers() throws SQLException {
        this.manufacturers = manager.getAll();
    }

    public List<Manufacturer> getManufacturers() {
        return manufacturers;
    }

//    public void addToModel(Manufacturer manufacturer) throws SQLException {
//        manager.insert(manufacturer);
//        manufacturers.add(manufacturer);
//    }
//
//    public void removeFromModel(Manufacturer manufacturer) throws SQLException {
//        manager.delete(manufacturer);
//        manufacturers.remove(manufacturer);
//    }
}
