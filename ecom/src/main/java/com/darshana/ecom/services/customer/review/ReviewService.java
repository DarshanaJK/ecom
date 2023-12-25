package com.darshana.ecom.services.customer.review;

import com.darshana.ecom.dto.OrderedProductsResponseDto;
import com.darshana.ecom.dto.ReviewDto;

import java.io.IOException;

public interface ReviewService {

    OrderedProductsResponseDto getOrderedProductsDetailsByOrderId(Long orderId);

    ReviewDto giveReview(ReviewDto reviewDto) throws IOException;
}
