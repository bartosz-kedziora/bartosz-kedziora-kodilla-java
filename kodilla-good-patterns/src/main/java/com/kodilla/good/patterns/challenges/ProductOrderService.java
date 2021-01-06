package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        ProductOrderlProcessor productOrderlProcessor = new ProductOrderlProcessor(
                new MailService(), new ProductService(), new OrderRepository());
        productOrderlProcessor.process(orderRequest);
    }
}
