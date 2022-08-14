package dao;

import java.util.logging.Logger;


//Different class implementing the IDao interface
public class DaoImpl2 implements IDao{
	
	private Logger logger = Logger.getLogger(""+this.getClass());
	@Override
	public double getTemperature() {		
		int t=15;
		//logger.warning("ERROR !!");
		logger.info("Temperature t="+t+" C°");
		return t;
	}

}
