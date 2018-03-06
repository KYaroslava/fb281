package ua.com.likeshop.fb28.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import ua.com.likeshop.fb28.entity.Product;

public interface ProductRepisitory extends CrudRepository<Product, Long>, PagingAndSortingRepository<Product, Long> {

}
