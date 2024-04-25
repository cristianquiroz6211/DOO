package co.edu.uco.tiendachepito.entity;
import co.edu.uco.tiendachepito.dto.DepartamentoDTO;
import org.springframework.context.annotation.Import;
import static co.edu.uco.tiendachepito.crosscutting.helpers.NumericHelper.ZERO;


public  final class CiudadEntity {
    private int id;
    private String  nombre;
    private DepartamentoEntity departamento;

    private CiudadEntity( final int id) {
        setId(id);
        setNombre(TextHelper.Empty);
        setDepartamento(departamento.build());
    }

    private CiudadEntity( final DepartamentoEntity departamento, final  int id, final String nombre) {
        setId(id);
        setNombre(nombre);
        setDepartamento(departamento);
    }

    public static final ciudadEntity build( final int id) {
        return new CiudadEntity(id);
    }

    public static final ciudadEntity build( final id, final String nombre, final DepartamentoEntity departamento) {
        return new CiudadEntity(departamento, id, nombre);
    }
    private CiudadEntity setId(int id) {
        this.id = id;
        return this;
    }

    private CiudadEntity setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    private CiudadEntity setDepartamento(DepartamentoEntity departamento) {
        this.departamento = departamento;
        return this;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public DepartamentoEntity getDepartamento() {
        return departamento;
    }
    private static  final ciudadEntity build() {
        return new ciudadEntity(ZERO);
    }
}
