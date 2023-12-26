package com.darshana.ecom.services.customer.wishlist;

import com.darshana.ecom.dto.WishlistDto;
import com.darshana.ecom.entity.Product;
import com.darshana.ecom.entity.User;
import com.darshana.ecom.entity.Wishlist;
import com.darshana.ecom.repository.ProductRepository;
import com.darshana.ecom.repository.UserRepository;
import com.darshana.ecom.repository.WishlistRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class wishlistServiceImpl implements WishlistService{

    private final UserRepository userRepository;

    private final ProductRepository productRepository;

    private final WishlistRepository wishlistRepository;

    public WishlistDto addProductToWishlist(WishlistDto wishlistDto){
        Optional<Product> optionalProduct = productRepository.findById(wishlistDto.getProductId());
        Optional<User> optionalUser = userRepository.findById(wishlistDto.getUserId());

        if (optionalProduct.isPresent() && optionalUser.isPresent()){
            Wishlist wishlist = new Wishlist();
            wishlist.setProduct(optionalProduct.get());
            wishlist.setUser(optionalUser.get());

            return wishlistRepository.save(wishlist).getWishlistDto();
        }
        return null;
    }

    public List<WishlistDto> getWishlistByUserId(Long userId){
        return wishlistRepository.findAllByUserId(userId).stream().map(Wishlist::getWishlistDto).collect(Collectors.toList());
    }
}
