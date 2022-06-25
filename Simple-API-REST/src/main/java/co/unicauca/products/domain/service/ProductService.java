/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.unicauca.products.domain.service;
import co.unicauca.products.access.IProductRepository;
import co.unicauca.products.domain.entity.Product;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
/**
 *
 * @author JARMX
 */
@RequestScoped
public class ProductService {
@Inject
@Default
IProductRepository repo;
public ProductService() {
}
public List<Product> findAll() {
return repo.findAll();
}
public Product findById(int id) {
return repo.findById(id);
}
public boolean create(Product prod) {
return repo.create(prod);
}
public boolean update(Product prod) {
return repo.update(prod);
}
public boolean delete(int id) {
return repo.delete(id);
}
}
