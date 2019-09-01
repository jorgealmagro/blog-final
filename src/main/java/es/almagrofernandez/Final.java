package es.almagrofernandez;

import es.almagrofernandez.blog_base.Base;
import es.almagrofernandez.blog_medio.Medio;

public class Final {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		System.out.println("Inicio de Final.main()");
		
		Medio medio = new Medio();
		Base base = new Base();
		
		System.out.println("Final.main() terminado");
	}
}
