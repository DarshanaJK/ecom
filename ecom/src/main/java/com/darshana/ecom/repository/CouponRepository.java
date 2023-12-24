package com.darshana.ecom.repository;

import com.darshana.ecom.entity.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CouponRepository extends JpaRepository<Coupon, Long> {

    boolean existsByCode(String code);
}
