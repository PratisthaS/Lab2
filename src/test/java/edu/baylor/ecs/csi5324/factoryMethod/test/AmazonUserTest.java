package edu.baylor.ecs.csi5324.factoryMethod.test;


import edu.baylor.ecs.csi5324.factoryMethod.cart.Cart;
import edu.baylor.ecs.csi5324.factoryMethod.product.Product;
import edu.baylor.ecs.csi5324.factoryMethod.product.impl.AmazonProduct;
import edu.baylor.ecs.csi5324.factoryMethod.store.Store;
import edu.baylor.ecs.csi5324.factoryMethod.store.impl.Amazon;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertTrue;

public class AmazonUserTest extends UserTest {

    // pick a store
    protected Store makeStore() {
        // Mall();
        return new Amazon();
    }

    protected Product makeProduct(String name) {
        return new AmazonProduct(name);
    }

    @Test
    public void testTotal() throws Exception {
        Cart cart = makeAnOrder();
        assertTrue(cart.getTotal().equals(new BigDecimal("171")));
    }



}
