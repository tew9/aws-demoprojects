package com.tango.springcloud.Repos;

import com.tango.springcloud.model.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CouponRepos extends JpaRepository<Coupon, Long> {
  Coupon findByCode(String code);
}
