package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
	
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: department findById ===");
		Department department = departmentDao.findById(10);		
		System.out.println(department);
		
		
		//System.out.println("\n=== TEST 1: department insert ===");
		//Department newDepartment = new Department(22, "Games");
		//departmentDao.insert(newDepartment);
		//System.out.println("Inserted. New id = " + newDepartment.getId());
		
		//System.out.println("\n=== TEST 2: seller update ===");
		//department = departmentDao.findById(1);
		//department.setName("Ramon Jacques");
		//departmentDao.update(department);
		//System.out.println("Update completed.");

	}
}
