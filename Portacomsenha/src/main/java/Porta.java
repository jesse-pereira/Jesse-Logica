public class Porta {

    private String cor;
    private int password;
    private String estado;

    public Porta(String cor, int password) {
        this.cor = cor;
        this.password = password;
        this.estado = "Fechada";
    }

    public String getEstado() {
        return estado;
    }

    @Override
    public String toString() {
        return "cor: " + cor +
                "\npassword: " + password +
                "\nestado: " + estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public void abrirPorta(int senha) {
        if(senha == this.password) {
            setEstado("Aberta");
        } else {
            setEstado("Fechada");
        }
    }
}
