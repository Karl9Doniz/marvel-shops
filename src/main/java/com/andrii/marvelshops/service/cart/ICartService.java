package com.andrii.marvelshops.service.cart;

import com.andrii.marvelshops.model.Cart;
import com.andrii.marvelshops.model.User;

import java.math.BigDecimal;

public interface ICartService {
    Cart getCart(Long id);
    void clearCart(Long id);
    BigDecimal getTotalPrice(Long id);

    Cart initializeNewCart(User user);

    Cart getCartByUserId(Long userId);
}