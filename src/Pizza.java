import javax.swing.*;

public class Pizza {
    private String masa;
    private boolean relleno;
    private int tipoMasa;
    private boolean salsa;
    private String tipoSalsa;
    private boolean cebolla;
    private boolean sinGluten;
    private boolean extraQueso;
    private boolean piña;
    private boolean champiñones;
    private boolean jamon;

    public Pizza() {
    }

    /**
     * objeto pizza
      * @param masa puede ser fina o pan
     * @param relleno   si lleva (true) o no (false)
     * @param tipoMasa  PEQUE/MEDIANA/FAMILIAR
     * @param salsa si lleva (true) o no (false)
     * @param tipoSalsa barbacoa
     * @param cebolla si lleva (true) o no (false)
     * @param sinGluten si lleva (true) o no (false)
     * @param extraQueso si lleva (true) o no (false)
     * @param piña si lleva (true) o no (false)
     * @param champiñones si lleva (true) o no (false)
     * @param jamon si lleva (true) o no (false)
     */
    public Pizza(String masa, boolean relleno, int tipoMasa, boolean salsa, String tipoSalsa, boolean cebolla, boolean sinGluten, boolean extraQueso, boolean piña, boolean champiñones, boolean jamon) {
        this.masa = masa;
        this.relleno = relleno;
        this.tipoMasa = tipoMasa;
        this.salsa = salsa;
        this.tipoSalsa = tipoSalsa;
        this.cebolla = cebolla;
        this.sinGluten = sinGluten;
        this.extraQueso = extraQueso;
        this.piña = piña;
        this.champiñones = champiñones;
        this.jamon = jamon;

    }

    public String getMasa() {
        return masa;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public boolean isRelleno() {
        return relleno;
    }

    public void setRelleno(boolean relleno) {
        this.relleno = relleno;
    }

    public int getTipoMasa() {
        return tipoMasa;
    }

    public void setTipoMasa(int tipoMasa) {
        this.tipoMasa = tipoMasa;
    }

    public boolean isSalsa() {
        return salsa;
    }

    public void setSalsa(boolean salsa) {
        this.salsa = salsa;
    }

    public String getTipoSalsa() {
        return tipoSalsa;
    }

    public void setTipoSalsa(String tipoSalsa) {
        this.tipoSalsa = tipoSalsa;
    }

    public boolean isCebolla() {
        return cebolla;
    }

    public void setCebolla(boolean cebolla) {
        this.cebolla = cebolla;
    }

    public boolean isSinGluten() {
        return sinGluten;
    }

    public void setSinGluten(boolean sinGluten) {
        this.sinGluten = sinGluten;
    }

    public boolean isExtraQueso() {
        return extraQueso;
    }

    public void setExtraQueso(boolean extraQueso) {
        this.extraQueso = extraQueso;
    }

    public boolean isPiña() {
        return piña;
    }

    public void setPiña(boolean piña) {
        this.piña = piña;
    }

    public boolean isChampiñones() {
        return champiñones;
    }

    public void setChampiñones(boolean champiñones) {
        this.champiñones = champiñones;
    }

    public boolean isJamon() {
        return jamon;
    }

    public void setJamon(boolean jamon) {
        this.jamon = jamon;
    }


    @Override
    public String toString() {
        return "Tu pizza llevaria esto:" +  "\n" +
                "-> masa=" + masa + "\n" +
                "-> relleno=" + relleno +"\n" +
                "-> tipoMasa=" + tipoMasa + "\n" +
                "-> salsa=" + salsa + "\n" +
                "-> tipoSalsa=" + tipoSalsa + "\n" +
                "-> cebolla=" + cebolla + "\n" +
                "-> sinGluten=" + sinGluten + "\n" +
                "-> extraQueso=" + extraQueso + "\n" +
                "-> piña=" + piña + "\n" +
                "-> champiñones=" + champiñones + "\n" +
                "-> jamon=" + jamon + "\n"
                ;
    }
}
