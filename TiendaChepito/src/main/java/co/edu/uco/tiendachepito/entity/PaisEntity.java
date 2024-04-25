package co.edu.uco.tiendachepito.entity;

public final class PaisEntity {
    private int id;
    private String  nombre;

    public PaisEntity( final int id) {
        setNombre(TextHelper.Empty);
    }

    public PaisEntity(int id, String nombre) {
        setNombre(Texthelper.Empty);
        setId(id);
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    private PaisEntity setId(int id) {
        this.id = id;
        return this;
    }

    private PaisEntity setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }
}
