package pres;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.Scanner;

import dao.DaoImpl;
import dao.IDao;
import metier.IMetier;
import metier.MetierImpl;

public class Presentation {
	public static void main(String[] args) {

		/*
		 * Static programming DaoImpl dao = new DaoImpl(); MetierImpl metier =new
		 * MetierImpl(); metier.setDao(dao);
		 * System.out.println(metier.conversionFahreneit() + "F");
		 */

		try {
			// Getting class names from the file: config.txt
			Scanner scanner = new Scanner(new File("config.txt"));
			String daoClassName = scanner.next();
			String metierClassName = scanner.next();

			// Dynamically loading the classes in the memory
			Class cDao = Class.forName(daoClassName);
			Class cMetier = Class.forName(metierClassName);

			// newInstance() method is deprecated
			// Instantiating the objects
			IDao dao = (IDao) cDao.newInstance();
			IMetier metier = (IMetier) cMetier.newInstance();

			// original syntax : Method m = cMetier.getMethod("setDao", new Class[] { IDao.class });
			Method m = cMetier.getMethod("setDao", IDao.class);
			//original syntax : m.invoke(metier, new Object[] { dao });
			m.invoke(metier, dao);

			System.out.println(dao.getTemperature() + " C°");
			System.out.println(metier.conversionFahreneit()+" F°");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
