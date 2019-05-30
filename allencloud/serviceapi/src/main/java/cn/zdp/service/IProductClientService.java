package cn.zdp.service;

import cn.zdp.feign.FeignConfig;
import cn.zdp.vo.Product;
import feign.Feign;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(name = "MICROCLOUD-PROVIDER-PRODUCT",configuration = FeignConfig.class)
public interface IProductClientService {

    @RequestMapping("/prodcut/get/{id}")
    public Product getProduct(@PathVariable("id")long id);

    @RequestMapping("/prodcut/list")
    public List<Product> listProduct() ;

    @RequestMapping("/prodcut/add")
    public boolean addPorduct(Product product) ;
}
