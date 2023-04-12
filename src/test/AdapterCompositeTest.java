package test;
import org.junit.jupiter.api.Test;

import esercizio1.AAdapter;
import esercizio1.BAdapter;
import esercizio1.CAdapter;
import esercizio1.Component;
import esercizio1.Composite;
import org.junit.Assert;

class AdapterCompositeTest {

	@Test
	void testTest() throws Exception {
		AAdapter a1 = new AAdapter(); BAdapter b = new BAdapter(); CAdapter c1 = new CAdapter();
		CAdapter a2 = new CAdapter(); CAdapter c2 = new CAdapter();
		a1.setState(true);
		a2.setState(false);
		b.setState(true);
		c1.setState(false);
		c2.setState(true);
		
		Component root = new Composite();
		root.addChild(a1);
		root.addChild(b);
		root.addChild(c1);
		root.addChild(a2);
		root.addChild(c2);
		Assert.assertFalse(root.test());
	}

}
