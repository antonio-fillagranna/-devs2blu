package exemplo;

import java.time.*;
import java.lang.reflect.Field;


public class TesteAnnotation {

	public static void main(String[] args) {
		Usuario usuario = new Usuario("Bruno", "42198284863", LocalDate.of(1990,Month.MARCH,14));
		System.out.println(validador(usuario));
	}
	
	public static <T> boolean validador(T objeto) {
		Class<?> classe = objeto.getClass();
		for (Field field : classe.getDeclaredFields()) {
			if (field.isAnnotationPresent(IdadeMinima.class)) {
				IdadeMinima idadeMinima = field.getAnnotation(IdadeMinima.class);
				try {
					field.setAccessible(true);
					LocalDate dataNascimento = (LocalDate) field.get(objeto);
					return Period.between(dataNascimento, LocalDate.now()).getYears() >= idadeMinima.valor();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				}
			}
		
		}
		return false;

	}
}