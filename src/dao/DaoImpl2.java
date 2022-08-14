package dao;

//Different class implementing the IDao interface
public class DaoImpl2 implements IDao{

	@Override
	public double getTemperature() {
		int t=15;
		return t;
	}

}
