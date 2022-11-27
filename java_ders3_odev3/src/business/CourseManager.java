package business;

import java.util.ArrayList;
import java.util.List;

import core.Logger;
import dataAccess.CourseDao;
import entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;
	private List<Course> courses;
	
	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
		this.courses = new ArrayList<Course>();
	}
	
	public void add(Course course) throws Exception{
		for(Course newCourse : courses) {
			if(course.getPrice() == 0) {
				throw new Exception("Bir kursun fiyatı 0'dan küçük olamaz!");
			}
			if(course.getName() == newCourse.getName()) {
				throw new Exception("Bu kurs ismi zaten kayıtlı!");
			}
			
			courseDao.add(newCourse);
			courses.add(newCourse);
		}
		
		for(Logger logger : loggers) {
			logger.log(course.getName());
		}
		
	}
	
	
	
	
	

}