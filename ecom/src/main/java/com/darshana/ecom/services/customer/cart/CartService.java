package com.darshana.ecom.services.customer.cart;

import com.darshana.ecom.dto.AddProductInCartDto;
import com.darshana.ecom.dto.OrderDto;
import org.springframework.http.ResponseEntity;

public interface CartService {

    ResponseEntity<?> addProductToCart(AddProductInCartDto addProductInCartDto);

    OrderDto getCartByUserId(Long userId);
}
