package ex04;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class name {
	
	public static void main(String[] args) {
		
		
		//
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext("autowired");

	
	Printer pt = ctx.getBean(Printer.class);
	System.out.println(pt.getDocument().data);
}
}
