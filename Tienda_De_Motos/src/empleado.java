class Empleado {
    private int idEmpleado;
    private String nombreEmpleado;
    private String apellidoPaternoEmpleado;
    private String apellidoMaternoEmpleado;

    public Empleado(int idEmpleado, String nombreEmpleado, String apellidoPaternoEmpleado, String apellidoMaternoEmpleado) {
        this.idEmpleado = idEmpleado;
        this.nombreEmpleado = nombreEmpleado;
        this.apellidoPaternoEmpleado = apellidoPaternoEmpleado;
        this.apellidoMaternoEmpleado = apellidoMaternoEmpleado;
    }

    public Empleado() {
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getApellidoPaternoEmpleado() {
        return apellidoPaternoEmpleado;
    }

    public void setApellidoPaternoEmpleado(String apellidoPaternoEmpleado) {
        this.apellidoPaternoEmpleado = apellidoPaternoEmpleado;
    }

    public String getApellidoMaternoEmpleado() {
        return apellidoMaternoEmpleado;
    }

    public void setApellidoMaternoEmpleado(String apellidoMaternoEmpleado) {
        this.apellidoMaternoEmpleado = apellidoMaternoEmpleado;
    }
}
