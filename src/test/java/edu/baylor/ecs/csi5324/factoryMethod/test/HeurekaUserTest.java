package edu.baylor.ecs.csi5324.factoryMethod.test;


import edu.baylor.ecs.csi5324.factoryMethod.product.Product;
import edu.baylor.ecs.csi5324.factoryMethod.product.impl.HeurekaProduct;
import edu.baylor.ecs.csi5324.factoryMethod.store.Store;
import edu.baylor.ecs.csi5324.factoryMethod.store.impl.Heureka;

public class HeurekaUserTest extends UserTest {

	// pick a store
	protected Store makeStore() {
		// Mall();
		return new Heureka();
	}

	protected Product makeProduct(String name) {
		return new HeurekaProduct(name);
	}



}
