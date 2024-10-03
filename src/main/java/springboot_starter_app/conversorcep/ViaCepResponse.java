package springboot_starter_app.conversorcep;

import java.util.Objects;

public class ViaCepResponse {
    private String cep;
    private String logradouro;
    private String localidade;

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    @Override
    public String toString() {
        return "ViaCepResponse{" +
                "cep='" + cep + '\'' +
                ", logradouro='" + logradouro + '\'' +
                ", localidade='" + localidade + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ViaCepResponse that = (ViaCepResponse) o;
        return Objects.equals(getCep(), that.getCep()) && Objects.equals(getLogradouro(), that.getLogradouro()) && Objects.equals(getLocalidade(), that.getLocalidade());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCep(), getLogradouro(), getLocalidade());
    }
}
