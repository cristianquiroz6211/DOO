package co.edu.uco.tiendachepito.data.dao.sql.sqlazuresql;

import java.sql.Connection;

public class SqlConnection {
    private Connection connection;

    protected SqlConnection( final Connection connection) {
        this.connection = connection;
    }

    private SqlConnection setConnection( final Connection connection) {
        // TODO: Se debe validar que la conexion este activa
        this.connection = connection;
        return this;
    }

    protected final Connection getConnection() {
        return connection;
    }
}
