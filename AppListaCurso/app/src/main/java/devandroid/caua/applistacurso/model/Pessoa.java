package devandroid.caua.applistacurso.model;

public class Pessoa {

    // Atributos - Objetos - moldes - modelo - Templete
    //metodos de Acessos - Gets and Sets

    private String primeiroNome;
    private String sobreNome;
    private String cursoDesejado;
    private String telefoneContado;


    public Pessoa(){}

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getCursoDesejado() {
        return cursoDesejado;
    }

    public void setCursoDesejado(String cursoDesejado) {
        this.cursoDesejado = cursoDesejado;
    }

    public String getTelefoneContado() {
        return telefoneContado;
    }

    public void setTelefoneContado(String telefoneContado) {
        this.telefoneContado = telefoneContado;
    }


    // to String - Para textos - para strings de cara caracteres


    @Override
    public String toString() {
        return "Pessoa{" +
                "primeiroNome='" + primeiroNome + '\'' +
                ", sobreNome='" + sobreNome + '\'' +
                ", cursoDesejado='" + cursoDesejado + '\'' +
                ", telefoneContado='" + telefoneContado + '\'' +
                '}';
    }
}
