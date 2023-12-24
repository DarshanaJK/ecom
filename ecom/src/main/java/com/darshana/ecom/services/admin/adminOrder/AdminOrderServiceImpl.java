package com.darshana.ecom.services.admin.adminOrder;

import com.darshana.ecom.dto.OrderDto;
import com.darshana.ecom.entity.Order;
import com.darshana.ecom.enums.OrderStatus;
import com.darshana.ecom.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AdminOrderServiceImpl implements AdminOrderService{

    private final OrderRepository orderRepository;

    public List<OrderDto> getAllPlacedOrders(){

        List<Order> orderList = orderRepository.findAllByOrderStatusIn(List.of(OrderStatus.Placed, OrderStatus.Shipped, OrderStatus.Delivered));

        return orderList.stream().map(Order::getOrderDto).collect(Collectors.toList());
    }
}
