package dataAccess;

import entities.Educator;

public class JdbcEducatorDao implements EducatorDao{
	public void add(Educator educator) {
		System.out.println("JDBC ile veritabanına eklendi");
		
	}

}
