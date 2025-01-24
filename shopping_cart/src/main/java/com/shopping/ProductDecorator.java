
package com.shopping;

import com.shopping.Product;

public abstract class ProductDecorator extends Product {
    protected Product decoratedProduct;

    public ProductDecorator(Product decoratedProduct) {
        super(decoratedProduct.getId(), decoratedProduct.getName(), decoratedProduct.getPrice(), decoratedProduct.getQuantity());
        this.decoratedProduct = decoratedProduct;
    }

    @Override
    public int getPrice() {
        return decoratedProduct.getPrice();
    }
}