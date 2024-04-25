package co.edu.uco.tiendachepito.data.dao.sql.sqlazuresql;

import co.edu.uco.tiendachepito.data.dao.PaisDAO;
import co.edu.uco.tiendachepito.entity.PaisEntity;

import java.sql.Connection;

public final class   PaisaZureSql extends SqlConnection  implements PaisDAO {
    public PaisaZureSql( final Connection connection) {
        super(connection);
    }


    @Override
    public void actualizar(PaisEntity entidad) {
        //cambiar nombre de pais con codigo 1 a 'Venezuela'
        final var sentencia = new StringBuilder();
        sentencia.append("UPDATE PAIS SET Nombre = 'Venezuela' WHERE ID = 1");

    }

    @Override
    public List<E> consultar(PaisEntity entidad) {
        //Consultar pais con codigo 1
        fianl var sentencia = new StringBuilder();
        sentencia.append("SELECT id, nombre FROM PAIS");
        sentencia.append("ORDER BY id ASC");
        return null;


    }

    @Override
    public void crear(PaisEntity entidad) {
        final var sentencia = new StringBuilder();
        sentencia.append("INSERT INTO PAIS (Nombre)");
        sentencia.append("VALUES ('Colombia')");

    }

    @Override
    public void eliminar(int id) {
        //Eliminar pais con codigo 1
        final var sentencia = new StringBuilder();
        sentencia.append("DELETE FROM PAIS WHERE ID = 1");

    }
}
