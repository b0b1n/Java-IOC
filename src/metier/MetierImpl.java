package metier;

import dao.IDao;

public class MetierImpl implements IMetier {
	private IDao dao;

	@Override
	public double conversionFahreneit() {
		double t = dao.getTemperature();
		return t*9/5 + 32;
	}
	
	public void setDao(IDao dao) {
		this.dao = dao;
	}

}
