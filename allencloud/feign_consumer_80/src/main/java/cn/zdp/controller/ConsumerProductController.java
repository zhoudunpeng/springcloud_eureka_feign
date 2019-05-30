package cn.zdp.controller;

import cn.zdp.service.IProductClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/consumer")
public class ConsumerProductController {

    @Autowired
    private IProductClientService iProductClientService;

    @RequestMapping(value = "/product/get",method = RequestMethod.POST)
    public Object getProduct(@RequestParam("id")long id){
        return iProductClientService.getProduct(id);
    }


}
