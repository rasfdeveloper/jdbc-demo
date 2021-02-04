package app;

import model.dao.DaoFactory;
import model.dao.DepartmentDAO;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;

public class Program {

    public static void main(String[] args){

        SellerDAO sellerDao = DaoFactory.createSellerDao();
        DepartmentDAO departmentDAO = DaoFactory.createDepartmentDao();

//        System.out.println("=== TEST 1: seller findById ===");
//        Seller seller = sellerDao.findById(3);
//        System.out.println(seller);
//
//        System.out.println("\n=== TEST 2: seller findByDepartment ===");
//        Department department = new Department(2, null);
//        List<Seller> list = sellerDao.findByDepartment(department);
//        for(Seller obj : list){
//            System.out.println(obj);
//        }
//
//        System.out.println("\n=== TEST 3: seller findAll ===");
//        List<Seller> list2 = sellerDao.findAll();
//        for(Seller obj : list2){
//            System.out.println(obj);
//        }

//        System.out.println("\n=== TEST 4: seller insert ===");
//        Department newDep = new Department(2, "Software");
//        Seller newSeller = new Seller(null, "Greg", "greg8@gmail.com", new Date(), 4000.00, newDep);
//        sellerDao.insert(newSeller);
//        System.out.println("Inserted! new id = " + newSeller.getId());

//        System.out.println("\n=== TEST 5: seller update ===");
//        seller = sellerDao.findById(1);
//        seller.setName("Martha Waine hehehe");
//        sellerDao.update(seller);
//        System.out.println("Update complete");
//
//        System.out.println("\n=== TEST 6: seller delete ===");
//        sellerDao.deleteById(1);
//        System.out.println("Delete complete");

//        System.out.println("Find department by id");
//        Department dep = departmentDAO.findById(7);
//        System.out.println(dep);

//        System.out.println("Find all departments");
//        List<Department> department = departmentDAO.findAll();
//        System.out.println(department);

//        System.out.println("Insert department");
//        Department dep = new Department(null, "Softwares");
//        departmentDAO.insert(dep);

//        System.out.println("Update department");
//        Department department = departmentDAO.findById(7);
//        department.setName("Softwares updated");
//        departmentDAO.update(department);

        System.out.println("Delete department");
        departmentDAO.deleteById(7);

    }

}
