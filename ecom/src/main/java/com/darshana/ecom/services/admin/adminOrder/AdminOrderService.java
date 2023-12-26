package com.darshana.ecom.services.admin.adminOrder;

import com.darshana.ecom.dto.AnalyticsResponse;
import com.darshana.ecom.dto.OrderDto;

import java.util.List;

public interface AdminOrderService {

    List<OrderDto> getAllPlacedOrders();

    OrderDto changeOrderStatus(Long orderId, String status);

    AnalyticsResponse calculateAnalytics();
}
