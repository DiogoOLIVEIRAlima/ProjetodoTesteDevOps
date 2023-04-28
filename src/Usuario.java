import java.time.LocalDate;

public class Usuario {
    private String Nome;
    private String CPF;
    private String telefone;
    private String DataNascimento;
    private String DataAgendamento;
    private String Periodo;

    public Usuario(String nome, String CPF, String telefone, String dataNascimento, String dataAgendamento, String periodo) {
        Nome = nome;
        this.CPF = CPF;
        this.telefone = telefone;
        DataNascimento = dataNascimento;
        DataAgendamento = dataAgendamento;
        Periodo = periodo;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getCPF() {
        return CPF;
    }


    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDataNascimento() {
        return DataNascimento;
    }

    public String getDataAgendamento() {
        return DataAgendamento;
    }

    public void setDataAgendamento(String dataAgendamento) {
        DataAgendamento = dataAgendamento;
    }

    public String getPeriodo() {
        return Periodo;
    }

    public void setPeriodo(String periodo) {
        Periodo = periodo;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "Nome='" + Nome + '\'' +
                ", CPF='" + CPF + '\'' +
                ", telefone='" + telefone + '\'' +
                ", DataNascimento='" + DataNascimento + '\'' +
                ", DataAgendamento='" + DataAgendamento + '\'' +
                ", Periodo='" + Periodo + '\'' +
                '}';
    }
}
