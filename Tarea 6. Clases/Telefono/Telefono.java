public class Telefono {
    private String marca;
    private String modelo;
    private int almacenamiento;
    private boolean tieneCamara;

    public Telefono() {
        marca = "";
        modelo = "";
        almacenamiento = 0;
        tieneCamara = false;
    }

    public Telefono(String marca, String modelo, int almacenamiento, boolean tieneCamara) {
        this.marca = marca;
        this.modelo = modelo;
        this.almacenamiento = almacenamiento;
        this.tieneCamara = tieneCamara;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public boolean isTieneCamara() {
        return tieneCamara;
    }

    public void setTieneCamara(boolean tieneCamara) {
        this.tieneCamara = tieneCamara;
    }

    @Override
    public String toString() {
        return "Telefono{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", almacenamiento=" + almacenamiento +
                ", tieneCamara=" + tieneCamara +
                '}';
    }

    public void llamar(String numero) {
        System.out.println("Llamando al número " + numero + "...");
    }

    public void tomarFoto() {
        if (tieneCamara) {
            System.out.println("Tomando una foto...");
        } else {
            System.out.println("Este teléfono no tiene cámara.");
        }
    }

    public void liberarEspacio(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad de espacio a liberar debe ser mayor que 0.");
        } else if (almacenamiento <= cantidad) {
            System.out.println("No hay suficiente espacio para liberar.");
        } else {
            almacenamiento -= cantidad;
            System.out.println("Se han liberado " + cantidad + " GB de espacio.");
        }
    }
}

