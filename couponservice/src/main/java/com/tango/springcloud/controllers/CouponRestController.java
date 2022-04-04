package com.tango.springcloud.controllers;

import com.tango.springcloud.Repos.CouponRepos;
import com.tango.springcloud.model.Coupon;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/couponapi")
public class CouponRestController {

  @Autowired
  CouponRepos repo;

  @RequestMapping(value = "/coupons", method = RequestMethod.POST)
  public Coupon create(@RequestBody Coupon coupon)
  {
    return repo.save(coupon);
  }

  @RequestMapping(value = "/coupons/{code}", method = RequestMethod.GET)
  public Coupon getCoupon(@PathVariable("code") String code){
    return repo.findByCode(code);
  }

  @RequestMapping(value = "/coupons", method = RequestMethod.GET)
  public List<Coupon> getAllCoupon(){
    return repo.findAll();
  }

}
