package data;

public class Email {
    private String endereco;
    private TipoEmail tipoEmail;

    public Email(String endereco, TipoEmail tipoEmail) {
        this.endereco = endereco;
        this.tipoEmail = tipoEmail;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public TipoEmail getTipoEmail() {
        return tipoEmail;
    }

    public void setTipoEmail(TipoEmail tipoEmail) {
        this.tipoEmail = tipoEmail;
    }

    @Override
    public String toString() {
        return endereco;
    }

    @Override
    public boolean equals(Object item) {
        if (this.endereco.equals(((Email) item).getEndereco()) &&
                this.tipoEmail.equals(((Email) item).getTipoEmail())) {
            return true;
        }
        return false;
    }

}
