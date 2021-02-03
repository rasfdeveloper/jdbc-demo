package app;

import model.dao.DaoFactory;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;

public class Program {

    public static void main(String[] args){

        SellerDAO sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== TEST 1: seller findById ===");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("\n=== TEST 2: seller findByDepartment ===");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for(Seller obj : list){
            System.out.println(obj);
        }

        System.out.println("\n=== TEST 3: seller findAll ===");
        List<Seller> list2 = sellerDao.findAll();
        for(Seller obj : list2){
            System.out.println(obj);
        }

        System.out.println("\n=== TEST 4: seller insert ===");
        Department newDep = new Department(2, "Software");
        Seller newSeller = new Seller(null, "Greg", "greg6@gmail.com", new Date(), 4000.00, newDep);
        sellerDao.insert(newSeller);
        System.out.println("Inserted! new id = " + newSeller.getId());

        System.out.println("\n=== TEST 5: seller update ===");
        seller = sellerDao.findById(1);
        seller.setName("Martha Waine hehehe");
        sellerDao.update(seller);
        System.out.println("Update complete");

    }

}
