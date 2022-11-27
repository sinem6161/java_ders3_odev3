import business.CategoryManager;
import core.DatabaseLogger;
import core.FileLogger;
import core.Logger;
import core.MailLogger;
import dataAccess.HibernateCategoryDao;
import entities.Category;

public class Main {

	public static void main(String[] args) throws Exception {
        Logger[] loggers = {new DatabaseLogger(),new FileLogger(),new MailLogger()};
		
		Category category2 = new Category(2, "Java");
		
		Category category3 = new Category(3, "Java");
		CategoryManager categoryManager1 = new CategoryManager(new HibernateCategoryDao(), loggers);
		categoryManager1.add(category2);
		categoryManager1.add(category3);
		
		//Course course = new Course(1, 1, 1, "Java programming", "Bu kurs ile Java öğrenmek eğlenceli bir hal aldı!", 50);
		//CourseManager courseManager=new CourseManager(new JdbcCourseDao(), loggers);
		//courseManager.add(course);
		
		
		//Educator educator = new Educator(1, "Engin", "Demiroğ");
		//EducatorManager educatorManager = new EducatorManager(new HibernateEducatorDao(), loggers);
		//educatorManager.add(educator);


	}

}
