package co.edu.uco.tiendachepito.entity;

public final  class DepartamentoEntity {

    private int id;
    private String  nombre;
    private paisEntity  Pais;

    public DepartamentoEntity(int id) {
        setId(id);
    }

    public DepartamentoEntity(int id, String nombre, paisEntity pais) {
        setId(id);
        setNombre(TextHelper.Empty);
        setPais(PaisEntity.build(0));
    }

    public int getId() {
        return id;
    }

    private static DepartamentoEntity build(final int id) {
        return new DepartamentoEntity(id);
    }

    public String getNombre() {
        return nombre;
    }

    private DepartamentoEntity setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public paisEntity getPais() {
        return Pais;
    }

    private DepartamentoEntity setPais(paisEntity pais) {
        Pais = pais;
        return this;
    }
}
