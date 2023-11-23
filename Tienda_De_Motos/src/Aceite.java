class Aceite {
    private int idAceite;
    private String tipoAceite;
    private String viscosidadAceite;
    private double costoAceite;

    public Aceite(int idAceite, String tipoAceite, String viscosidadAceite, double costoAceite) {
        this.idAceite = idAceite;
        this.tipoAceite = tipoAceite;
        this.viscosidadAceite = viscosidadAceite;
        this.costoAceite = costoAceite;
    }

    public Aceite() {
    }

    public int getIdAceite() {
        return idAceite;
    }

    public void setIdAceite(int idAceite) {
        this.idAceite = idAceite;
    }

    public String getTipoAceite() {
        return tipoAceite;
    }

    public void setTipoAceite(String tipoAceite) {
        this.tipoAceite = tipoAceite;
    }

    public String getViscosidadAceite() {
        return viscosidadAceite;
    }

    public void setViscosidadAceite(String viscosidadAceite) {
        this.viscosidadAceite = viscosidadAceite;
    }

    public double getCostoAceite() {
        return costoAceite;
    }

    public void setCostoAceite(double costoAceite) {
        this.costoAceite = costoAceite;
    }
}

