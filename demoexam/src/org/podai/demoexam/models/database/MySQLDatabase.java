package org.podai.demoexam.models.database;

import com.mysql.cj.jdbc.MysqlDataSource;
import org.podai.demoexam.utilities.DBConstants;

import java.sql.Connection;
import java.sql.SQLException;

public class MySQLDatabase {
    private static MySQLDatabase instance;
    private MysqlDataSource source;

    private MySQLDatabase() {

    }

    public static MySQLDatabase getInstance() {
        if (instance == null) {
            instance = new MySQLDatabase();
        }
        return instance;
    }

    public Connection getConnection() throws SQLException {
        if (source == null) {
            source = new MysqlDataSource();
            source.setServerName(DBConstants.DB_HOST);
            source.setPort(DBConstants.DB_PORT);
            source.setDatabaseName(DBConstants.DB_NAME);
            source.setUser(DBConstants.DB_USER);
            source.setPassword(DBConstants.DB_PASS);

            source.setCharacterEncoding("UTF-8");
            source.setServerTimezone("UTC");
        }
        return source.getConnection();
    }
}
