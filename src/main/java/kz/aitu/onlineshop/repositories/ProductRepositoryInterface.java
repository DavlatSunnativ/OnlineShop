package kz.aitu.onlineshop.repositories;

import kz.aitu.onlineshop.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepositoryInterface extends JpaRepository<Product,Integer> {
    List<Product> findBySalesmanId(int id);
}
