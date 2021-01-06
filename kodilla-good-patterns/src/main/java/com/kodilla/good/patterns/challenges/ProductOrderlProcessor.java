package com.kodilla.good.patterns.challenges;

public class ProductOrderlProcessor
{
    private InformationService informationService;
    private ProductsOrderService productsOrderService;
    private ProductOrderRepository productOrderRepository;

    public ProductOrderlProcessor(final InformationService informationService,
                               final ProductsOrderService productOrderService,
                               final ProductOrderRepository productOrderRepository) {
        this.informationService = informationService;
        this.productsOrderService = productOrderService;
        this.productOrderRepository = productOrderRepository;
    }

    public PurchaseDto process(final OrderRequest orderRequest) {
        boolean isAvailable = productsOrderService.order(orderRequest.getUser(), orderRequest.getDateOfPurchase());

        if (isAvailable) {
            informationService.inform(orderRequest.getUser());
            productOrderRepository.createOrder(orderRequest.getUser(), orderRequest.getDateOfPurchase());
            return new PurchaseDto(orderRequest.getUser(), true);
        } else {
            return new PurchaseDto(orderRequest.getUser(), false);
        }
    }
}
