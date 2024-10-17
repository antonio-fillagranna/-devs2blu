package ex11;
import java.util.ArrayList;
import java.util.List;

public class ProjetoPesquisa {
    private String codigo;
    private String titulo;
    private String dataInicio;
    private String dataFim;
    private Professor professorResponsavel;
    private List<Pesquisador> equipe;

    public ProjetoPesquisa(String codigo, String titulo, String dataInicio2, String dataFim2, Professor professorResponsavel) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.dataInicio = dataInicio2;
        this.dataFim = dataFim2;
        this.professorResponsavel = professorResponsavel;
        this.equipe = new ArrayList<>();
    }

    public void adicionarPesquisador(Pesquisador pesquisador) {
        equipe.add(pesquisador);
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public Professor getProfessorResponsavel() {
        return professorResponsavel;
    }

    public List<Pesquisador> getEquipe() {
        return equipe;
    }
}
