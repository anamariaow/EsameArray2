public class Auto {
    private String marca;
    private String modello;
    private Integer cilindrata;
    private Integer numeroPorte;
    private Integer numeroPosti;
    private Double prezzoVendita;
    public Auto(String marca, String modello, Integer cilindrata, Integer numeroPorte, Integer numeroPosti, Double prezzoVendita) {
        this.marca = marca;
        this.modello = modello;
        this.cilindrata = cilindrata;
        this.numeroPorte = numeroPorte;
        this.numeroPosti = numeroPosti;
        this.prezzoVendita = prezzoVendita;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public Integer getCilindrata() {
        return cilindrata;
    }

    public void setCilindrata(Integer cilindrata) {
        this.cilindrata = cilindrata;
    }

    public Integer getNumeroPorte() {
        return numeroPorte;
    }

    public void setNumeroPorte(Integer numeroPorte) {
        this.numeroPorte = numeroPorte;
    }

    public Integer getNumeroPosti() {
        return numeroPosti;
    }

    public void setNumeroPosti(Integer numeroPosti) {
        this.numeroPosti = numeroPosti;
    }

    public Double getPrezzoVendita() {
        return prezzoVendita;
    }

    public void setPrezzoVendita(Double prezzoVendita) {
        this.prezzoVendita = prezzoVendita;
    }

    @Override
    public String  toString() {
        return "Auto{" +
                "marca='" + marca + '\'' +
                ", modello='" + modello + '\'' +
                ", cilindrata=" + cilindrata +
                ", numeroPorte=" + numeroPorte +
                ", numeroPosti=" + numeroPosti +
                ", prezzoVendita=" + prezzoVendita +
                '}';
    }
}
