package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: department findById ===");
		Department department = departmentDao.findById(2);		
		System.out.println(department);
		
		System.out.println("\n=== TEST 2: department update ===");
		department = departmentDao.findById(1);
		department.setName("Clothes");
		departmentDao.update(department);
		System.out.println("Update completed.");
		
		System.out.println("\n=== TEST 3: seller findAll ===");
		List<Department> list = departmentDao.findAll();
		for(Department obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TEST 4: department insert ===");
		Department newDepartment = new Department(6, "Tools");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted. New id = " + newDepartment.getId());
		
		System.out.println("\n=== TEST 5: department delete ===");
		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();
		departmentDao.deletById(id);
		System.out.println("Delete completed.");

		sc.close();
	}
}
