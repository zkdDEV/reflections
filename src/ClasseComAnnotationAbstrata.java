@Tabela(value = "Tabela de Classe")
public abstract class ClasseComAnnotationAbstrata {
    @Tabela(value = "Tabela de Propriedade")
    private String name;

    @Tabela(value = "Tabela de Construtor")
    public ClasseComAnnotationAbstrata(String name){
        this.name = name;
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
