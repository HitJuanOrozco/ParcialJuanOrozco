public class ObjTablet {

    private String serial;
    private String tamaño;
    private String marca;
    private double precio;
    private String nombreUsuarioAsignado;
    private boolean disponible;

    
    public ObjTablet(String serial, String tamaño, String marca, double precio, String nombreUsuarioAsignado,
            boolean disponible) {
        this.serial = serial;
        this.tamaño = tamaño;
        this.marca = marca;
        this.precio = precio;
        this.nombreUsuarioAsignado = nombreUsuarioAsignado;
        this.disponible = disponible;
    }


    public String getSerial() {
        return serial;
    }


    public void setSerial(String serial) {
        this.serial = serial;
    }


    public String getTamaño() {
        return tamaño;
    }


    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }


    public String getMarca() {
        return marca;
    }


    public void setMarca(String marca) {
        this.marca = marca;
    }


    public double getPrecio() {
        return precio;
    }


    public void setPrecio(double precio) {
        this.precio = precio;
    }


    public String getNombreUsuarioAsignado() {
        return nombreUsuarioAsignado;
    }


    public void setNombreUsuarioAsignado(String nombreUsuarioAsignado) {
        this.nombreUsuarioAsignado = nombreUsuarioAsignado;
    }


    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
