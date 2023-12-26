package com.darshana.ecom.services.customer;

import com.darshana.ecom.dto.ProductDetailDto;
import com.darshana.ecom.dto.ProductDto;

import java.util.List;

public interface CustomerProductService {

    List<ProductDto> searchProductByTitle(String title);

    List<ProductDto> getAllProducts();

    ProductDetailDto getProductDetailById(Long productId);

}
