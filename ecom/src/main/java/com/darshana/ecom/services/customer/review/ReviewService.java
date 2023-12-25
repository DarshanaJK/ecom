package com.darshana.ecom.services.customer.review;

import com.darshana.ecom.dto.OrderedProductsResponseDto;

public interface ReviewService {

    OrderedProductsResponseDto getOrderedProductsDetailsByOrderId(Long orderId);
}
