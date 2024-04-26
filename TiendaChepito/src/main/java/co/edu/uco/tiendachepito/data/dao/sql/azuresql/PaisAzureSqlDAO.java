package co.edu.uco.tiendachepito.data.dao.sql.azuresql;

import co.edu.uco.tiendachepito.data.dao.PaisDAO;
import co.edu.uco.tiendachepito.data.dao.sql.SqlConnection;
import co.edu.uco.tiendachepito.entity.PaisEntity;

import java.sql.Connection;
import java.util.List;

public final class PaisAzureSqlDAO extends SqlConnection implements PaisDAO {
    public PaisAzureSqlDAO(final Connection connection) {
        super(connection);
    }


    @Override
    public void actualizar(final PaisEntity entidad) {
        //cambiar nombre de pais con codigo 1 a 'Venezuela'
        final var sentencia = new StringBuilder();
        sentencia.append("UPDATE PAIS SET Nombre = 'Venezuela' WHERE ID = 1");

    }

    @Override
    public List<PaisEntity> consultar(final PaisEntity entidad) {
        //Consultar pais con codigo 1
        final var sentencia = new StringBuilder();
        sentencia.append("SELECT id, nombre FROM PAIS");
        sentencia.append("ORDER BY id ASC");
        return null;


    }

    @Override
    public void crear(final PaisEntity entidad) {
        final var sentencia = new StringBuilder();
        sentencia.append("INSERT INTO PAIS (Nombre)");
        sentencia.append("VALUES ('Colombia')");

    }

    @Override
    public void eliminar(final int id) {
        //Eliminar pais con codigo 1
        final var sentencia = new StringBuilder();
        sentencia.append("DELETE FROM PAIS WHERE ID = 1");

    }
}
