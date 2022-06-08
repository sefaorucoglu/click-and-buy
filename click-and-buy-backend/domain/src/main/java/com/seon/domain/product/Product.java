package com.seon.domain.product;

import com.seon.domain.annotations.Aggregate;
import com.seon.domain.user.User;
@Aggregate(id="ProductID")
public class Product {
    private ProductID productID;
    private ProductName productName;
    private Price price;
    private Category category;
    private User seller;



}
