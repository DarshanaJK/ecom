package com.darshana.ecom.repository;

import com.darshana.ecom.entity.Order;
import com.darshana.ecom.enums.OrderStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

    Order findByUserIdAndOrderStatus(Long userId, OrderStatus orderStatus);

    List<Order> findAllByOrderStatusIn(List<OrderStatus> orderStatusList);

    List<Order> findByUserIdAndOrderStatusIn(Long userId, List<OrderStatus> orderStatus);

    Optional<Order> findByTrackingId(UUID trackingId);
}
