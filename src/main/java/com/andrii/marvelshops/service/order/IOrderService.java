package com.andrii.marvelshops.service.order;

import com.andrii.marvelshops.dto.OrderDto;
import com.andrii.marvelshops.model.Order;

import java.util.List;

public interface IOrderService {
    Order placeOrder(Long userId);
    OrderDto getOrder(Long orderId);
    List<OrderDto> getUserOrders(Long userId);

    OrderDto convertToDto(Order order);
}