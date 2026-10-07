public class Dispositivo {
    private String nombre;
    private String tipo;
    private boolean activo;

    public void mostrarInformacion(){
        System.out.println("Nombre: "+nombre+"\n Tipo: "+tipo+"\n Activo: "+activo);
    }
    void mostrarEstado(){
        String estado = activo?"Activo":"Inhabilitado";
        System.out.println("Nombre: "+nombre+"\n Estado: "+estado);
    }

    public void setNombre(String nombre){
        if (nombre != null && !nombre.isBlank())
            this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        if (tipo != null && !tipo.isBlank())
            this.tipo = tipo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean isActivo() {
        return activo;
    }

}
