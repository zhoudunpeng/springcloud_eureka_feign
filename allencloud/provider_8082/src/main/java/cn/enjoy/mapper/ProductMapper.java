package cn.enjoy.mapper;

import cn.zdp.vo.Product;

import java.util.List;
public interface ProductMapper {
    boolean create(Product product);
    public Product findById(Long id);
    public List<Product> findAll();
}