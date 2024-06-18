
@Tabela(value = "Tabela de Classe")
public class ClasseComAnnotation {
    @Tabela(value = "Tabela de Propriedade")
    private String name;

    @Tabela(value = "Tabela de Construtor")
    public ClasseComAnnotation(){
    }
    @Tabela(value = "Tabela de Método sem parâmetro")
    public String getName() {
        return name;
    }

    @Tabela(value = "Tabela de Método com parâmetro")
    public void setName(String name) {
        this.name = name;
    }
}
