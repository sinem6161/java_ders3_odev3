package business;

import java.util.List;
import java.util.*;

import core.Logger;
import dataAccess.CategoryDao;
import entities.Category;

public class CategoryManager {
	private CategoryDao categoryDao;
	private Logger[] loggers;
	private List<Category> categories;
	

	
	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
		this.categories = new ArrayList<Category>();
	}



	public void add(Category category) throws Exception{
		for(Category newCategory : categories) {
			if(category.getName() == newCategory.getName()) {
				throw new Exception("Bu kategori ismi zaten kayıtlı!");
			}
			
			categoryDao.add(newCategory);
			categories.add(newCategory);
		}
		
		
		for(Logger logger:loggers) {
			logger.log(category.getName());
		}
		
		
	}
	

}
