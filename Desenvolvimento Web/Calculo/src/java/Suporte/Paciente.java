package Suporte;

public class Paciente {
    private String nome;
    private int idade;
    private String Cpf;
    private float peso;
    private float altura;
    private int pressao_min;
    private int pressao_max;
    private String sexo;
    private String tipo_sangue;
    
    // METODO GET

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getPressao_min() {
        return pressao_min;
    }

    public void setPressao_min(int pressao_min) {
        this.pressao_min = pressao_min;
    }

    public int getPressao_max() {
        return pressao_max;
    }

    public void setPressao_max(int pressao_max) {
        this.pressao_max = pressao_max;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTipo_sangue() {
        return tipo_sangue;
    }

    public void setTipo_sangue(String tipo_sangue) {
        this.tipo_sangue = tipo_sangue;
    }
    
       
}
