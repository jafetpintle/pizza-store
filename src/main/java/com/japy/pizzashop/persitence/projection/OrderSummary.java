package com.japy.pizzashop.persitence.projection;

import java.time.LocalDate;
import java.time.LocalDateTime;

public interface OrderSummary {
    Integer getIdOrder();
    String getCustomerName();
    LocalDateTime getOrderDate();
    Double getOrderTotal();
    String getPizzaNames();
}
