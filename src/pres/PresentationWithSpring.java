package pres;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import metier.IMetier;

public class PresentationWithSpring {
	public static void main(String[] args) {
		
		//If the file doesn't exist in the src directory , it throws an IOException 
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "ApplicationContext.xml" });
		IMetier metier = (IMetier)context.getBean("metier");
		System.out.println(metier.conversionFahreneit()+" F°");
		
	}
}
