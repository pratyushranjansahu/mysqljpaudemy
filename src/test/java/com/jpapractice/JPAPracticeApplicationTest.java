package com.jpapractice;

import com.jpapractice.entity.Product;
import com.jpapractice.repos.ProductRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JPAPracticeApplicationTest {

    @Autowired
    ProductRepository repository;

    @Test
    public void testCreate() {
        Product product = new Product();
        product.setId(1);
        product.setName("Iphone");
        product.setDesc("Awesome");
        product.setPrice(1000d);

        repository.save(product);
    }
}
