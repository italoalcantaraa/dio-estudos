package Enums;

public enum EstadoBrasileiro {
    SAO_PAULO("SP", "São Paulo", 35),
    RIO_DE_JANEIRO("RJ", "Rio de Janeiro", 33),
    MINAS_GERAIS("MG", "Minas Gerais", 31);

    private String nome;
    private String sigla;
    private int codigo;

    private EstadoBrasileiro(String sigla, String nome,  int codigo){
        this.nome = nome;
        this.sigla = sigla;
        this.codigo = codigo;
    }

    public String getEstadosNome() {
        return nome;
    }

    public String getEstadosSigla() {
        return sigla;
    }

    public int getEstadosCodigo() {
        return codigo;
    }

    public String getEstadosNomeMaiusculo() {
        return nome.toUpperCase();
    }
}