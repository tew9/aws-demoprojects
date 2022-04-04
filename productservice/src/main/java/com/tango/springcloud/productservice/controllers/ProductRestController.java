package com.tango.springcloud.productservice.controllers;

import com.tango.springcloud.productservice.Repos.ProductRepo;
import com.tango.springcloud.productservice.model.Product;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/productapi")
public class ProductRestController {
  @Autowired
  ProductRepo repo;
  @RequestMapping(value = "/product", method = RequestMethod.POST)
  public Product create(@RequestBody Product product){
    return repo.save(product);
  }
  @RequestMapping(value = "/product", method = RequestMethod.GET)
  public List<Product> getProduct(){
    return repo.findAll();
  }
}
