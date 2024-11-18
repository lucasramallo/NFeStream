package com.github.lucasramallo.nfestream.core.mappers;

import com.github.lucasramallo.nfestream.core.entity.Imposto;
import com.github.lucasramallo.nfestream.core.entity.NfeJAXBModel;
import com.github.lucasramallo.nfestream.core.util.EnumMatcher;
import com.github.lucasramallo.nfestream.core.util.ImpostoTypes;
import com.github.lucasramallo.nfestream.core.util.ImpostoValoresTags;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * Classe responsável por mapear um objeto de Imposto da classe NfeJAXBModel para um objeto Imposto do domínio,
 * utilizando Reflection para acessar dinamicamente os campos da classe NfeJAXBModel.InfNFe.Det.Imposto.
 * <p>
 * Esta classe converte os dados do objeto de imposto, incluindo o tipo e valor, para uma lista de objetos Imposto.
 * O método recursivo {@link #mapFields(Object, int)} é utilizado para percorrer os campos do objeto de entrada,
 * permitindo a adaptação de diferentes estruturas de dados sem a necessidade de definir explicitamente os campos.
 * </p>
 */
public abstract class JaxbToImposto{
    private static ArrayList<Imposto> impostos;
    private static Imposto imposto;

    public static ArrayList<Imposto> execute(NfeJAXBModel.InfNFe.Det.Imposto nfeJAXBModel) {
        impostos = new ArrayList<>();
        imposto = new Imposto();

        // Chama o método recursivo para imprimir os atributos
        mapFields(nfeJAXBModel, 0);

        return impostos;
    }
    
    private static void mapFields(Object obj, int indentLevel) {
        if (obj == null || isSystemClass(obj.getClass())) {
            return;
        }

        Field[] fields = obj.getClass().getDeclaredFields();

        for (Field field : fields) {
            field.setAccessible(true);
            try {
                Object valor = field.get(obj);


                // Adiciona o nome do imposto ao objeto Imposto
                if(EnumMatcher.matchEnum(ImpostoTypes.class, field.getName())) {
                    imposto.setTipoImposto(field.getName());
                }

                // Adiciona o valor do imposto ao Imposto e adiciona o imposto a Lista e torna Imposto null para a procima recursão
                if (EnumMatcher.matchEnum(ImpostoValoresTags.class, field.getName())) {
                    BigDecimal bigDecimalValue = new BigDecimal(String.valueOf(field.get(obj)));
                    imposto.setValor(bigDecimalValue);

                    impostos.add(imposto);
                    imposto = new Imposto();
                }

                if (valor != null && !isPrimitiveOrWrapper(valor.getClass())) {
                    mapFields(valor, indentLevel + 1); // Chama recursivamente para subobjetos
                }

            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }

    private static boolean isSystemClass(Class<?> clazz) {
        return clazz.getName().startsWith("com.sun") ||
                clazz.getName().startsWith("java.") ||
                clazz.getName().startsWith("jdk.");
    }

    // Método que verifica se uma classe é um tipo primitivo ou wrapper
    private static boolean isPrimitiveOrWrapper(Class<?> clazz) {
        return clazz.isPrimitive() ||
                clazz.equals(String.class) ||
                clazz.equals(Integer.class) ||
                clazz.equals(Long.class) ||
                clazz.equals(Double.class) ||
                clazz.equals(Float.class) ||
                clazz.equals(Boolean.class) ||
                clazz.equals(Byte.class) ||
                clazz.equals(Character.class) ||
                clazz.equals(Short.class);
    }
}
