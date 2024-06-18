import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Demo {

    public static void main(String[] args){
        ClasseComAnnotation object = new ClasseComAnnotation();

        System.out.println("*******************************_Classe_********************************");
        if(object.getClass().isAnnotationPresent(Tabela.class)){
            Tabela annotation = object.getClass().getAnnotation(Tabela.class);
            System.out.println("A Classe '" + object.getClass().getSimpleName() + "' contém a annotation 'Tabela' com o valor: " + annotation.value());
        }

        System.out.println("");

        Field[] campos = object.getClass().getDeclaredFields();
        System.out.println("*******************************_Propriedades_********************************");
        for(Field campo : campos){
            if(campo.isAnnotationPresent(Tabela.class)){
                Tabela annotation = campo.getAnnotation(Tabela.class);
                System.out.println("A Propriedade '" + campo.getName() + "' contém a annotation 'Tabela' com o valor: " + annotation.value());
            }
        }

        System.out.println("");

        System.out.println("*******************************_Construtor_********************************");
        try {
            Constructor<?> constructor = object.getClass().getDeclaredConstructor();
            if(constructor.isAnnotationPresent(Tabela.class)){
                Tabela annotation = (Tabela) constructor.getAnnotation(Tabela.class);
                System.out.println("A Construtor '" + constructor.getName() + "' contém a annotation 'Tabela' com o valor: " + annotation.value());
            }
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }

        System.out.println("");

        System.out.println("*******************************_Métodos_********************************");
        Method[] methods = object.getClass().getDeclaredMethods();
        for (Method method : methods){
            if(method.isAnnotationPresent(Tabela.class)){
                Tabela annotation = method.getAnnotation(Tabela.class);
                System.out.println("O Método '" + method.getName() + "' contém a annotation 'Tabela' com o valor: " + annotation.value());
            }
        }

    }
}
