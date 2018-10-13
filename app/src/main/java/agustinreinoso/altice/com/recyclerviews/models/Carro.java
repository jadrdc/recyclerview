package agustinreinoso.altice.com.recyclerviews.models;

public class Carro {
    private String marca;
    private String pais;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    private String url;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Carro(String marca, String pais) {
        this.marca = marca;
        this.pais = pais;
    }
}
