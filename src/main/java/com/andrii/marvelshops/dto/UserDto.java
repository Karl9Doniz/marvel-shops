package com.andrii.marvelshops.dto;

import com.andrii.marvelshops.model.Cart;
import com.andrii.marvelshops.model.Order;
import lombok.Data;

import java.util.List;

@Data
public class UserDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private List<OrderDto> orders;
    private CartDto cart;
}