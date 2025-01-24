
package com.shopping;

import com.shopping.Product;

public class WarrantyDecorator extends ProductDecorator {
    private static final int WARRANTY_PRICE = 300;

    public WarrantyDecorator(Product decoratedProduct) {
        super(decoratedProduct);
    }

    @Override
    public int getPrice() {
        return super.getPrice() + WARRANTY_PRICE;
    }
}