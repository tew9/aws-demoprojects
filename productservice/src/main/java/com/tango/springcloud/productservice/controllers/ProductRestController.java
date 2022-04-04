package com.tango.springcloud.productservice.controllers;

import com.tango.springcloud.productservice.Repos.ProductRepo;
import com.tango.springcloud.productservice.dto.Coupon;
import com.tango.springcloud.productservice.model.Product;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/productapi")
public class ProductRestController {
  @Autowired
  ProductRepo repo;

  @Autowired
  RestTemplate restTemplate;

  @Value("${couponService.url}")
  private String couponServiceUrl;

  @RequestMapping(value = "/product", method = RequestMethod.POST)
  public Product create(@RequestBody Product product){
    Coupon coupon = restTemplate.getForObject(couponServiceUrl+product.getCouponCode(),
        Coupon.class);
    //set the price with the discount set to it.
    product.setPrice(product.getPrice().subtract(coupon.getDiscount()));
    return repo.save(product);
  }
  @RequestMapping(value = "/product", method = RequestMethod.GET)
  public List<Product> getProduct(){
    return repo.findAll();
  }
}
