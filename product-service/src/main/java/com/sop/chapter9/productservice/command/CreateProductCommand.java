package com.sop.chapter9.productservice.command;

import lombok.Builder;
import lombok.Data;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

import java.math.BigDecimal;

@Builder
@Data
public class CreateProductCommand {
    @TargetAggregateIdentifier
    private final String productID;
    private final String title;
    private final BigDecimal price;
    private final Integer quantity;
}
