package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave(){
        //Given
        List<Product> products = Arrays.asList(new Product("Shotgun"), new Product("Bullets"), new Product("lightsTactical"));

        List<Item> items = new ArrayList<>();
        items.add(new Item(products.get(0), BigDecimal.valueOf(3000), 5, BigDecimal.valueOf(15000)));
        items.add(new Item(products.get(1), BigDecimal.valueOf(2), 1000, BigDecimal.valueOf(2000)));
        items.add(new Item(products.get(2), BigDecimal.valueOf(100), 5, BigDecimal.valueOf(500)));

        Invoice invoice = new Invoice("0001/2021", items);

        //When;
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();

        //Then
        assertNotEquals(0, invoiceId);

        //CleanUp
        try {
            invoiceDao.deleteById(invoiceId);
        }
        catch (Exception e){

        }
    }
}
