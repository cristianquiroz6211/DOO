package co.edu.uco.tiendachepito.data.dao.factory;

import co.edu.uco.tiendachepito.data.dao.CiudadDAO;
import co.edu.uco.tiendachepito.data.dao.DepartamentoDAO;
import co.edu.uco.tiendachepito.data.dao.PaisDAO;

public  abstract class DAOFactory {
    protected abstract void obtenerConeccion();
    public abstract void iniciarTransaccion();
    public abstract void confirmarTransaccion();
    public abstract void cancelarTransaccion();
    public abstract void cerrarConeccion();

    public abstract PaisDAO getPaisDAO();
    public  abstract DepartamentoDAO getDepartamentoDAO();
    public abstract CiudadDAO getCiudadDAO();

}
