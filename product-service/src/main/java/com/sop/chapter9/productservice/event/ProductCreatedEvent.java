package com.sop.chapter9.productservice.event;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductCreatedEvent {
    private String productID;
    private String title;
    private BigDecimal price;
    private Integer quantity;
}
