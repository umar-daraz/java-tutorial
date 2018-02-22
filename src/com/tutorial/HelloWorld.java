package com.tutorial;

import inventory.LineItem;
import inventory.Order;
import inventory.ProductID;
import inventory.Stock;
import inventory.ProductRepository;

public class HelloWorld {

    public static void main (String[] args) {
        Stock stock = new Stock();
        ProductRepository productRepository = new ProductRepository();
        LineItem surfExcel = new LineItem(productRepository.read(new ProductID(1)), 20);
        LineItem vim = new LineItem(productRepository.read(new ProductID(2)), 30);
        Order order = new Order(stock);
        order.newLineItem(vim);
        order.newLineItem(surfExcel);
        System.out.println("vim stock before checkout " + stock.productStock(new ProductID(2)));
        order.checkout();
        System.out.println("vim stock after checkout " + stock.productStock(new ProductID(2)));

    }
}