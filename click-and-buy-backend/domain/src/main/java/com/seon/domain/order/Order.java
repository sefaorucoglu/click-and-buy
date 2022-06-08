package com.seon.domain.order;

import com.seon.domain.annotations.Aggregate;

@Aggregate(id="OrderID")
public class Order {
    private OrderID orderID;
    private OrderData orderData;
    private Status status;

}
