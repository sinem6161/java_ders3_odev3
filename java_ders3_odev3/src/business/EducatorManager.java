package business;

import core.Logger;
import dataAccess.EducatorDao;
import entities.Educator;

public class EducatorManager {
	private EducatorDao educatorDao;
	private Logger[] loggers;
	
	public EducatorManager(EducatorDao educatorDao, Logger[] loggers) {
		this.educatorDao = educatorDao;
		this.loggers = loggers;
	}
	
	public void add(Educator educator) {
		educatorDao.add(educator);
		System.out.println("Eğitmen başarılı bir şekilde eklendi.");
		
		for(Logger logger : loggers) {
			logger.log(educator.getFirstName()+" "+educator.getLastName());
		}
	}
	
	
	
}

