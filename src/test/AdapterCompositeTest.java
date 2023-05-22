package test;

import esercizio1.A;
import esercizio1.AAdapter;
import esercizio1.B;
import esercizio1.BAdapter;
import esercizio1.C;
import esercizio1.CAdapter;
import esercizio1.Component;
import esercizio1.Composite;
import esercizio1.Leaf;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class AdapterCompositeTest {
	
	@Test
	public void testAdapterA() {
		AAdapter a = new AAdapter(); 
		Assert.assertFalse(a.test());
		a.setA(new A(true));
		Assert.assertTrue(a.test());
	}
	
	@Test
	public void testAdapterB() {
		BAdapter b = new BAdapter(); 
		Assert.assertFalse(b.test());
		b.setB(new B(true));
		Assert.assertTrue(b.test());
		
		
	}
	
	@Test
	public void testAdapterC() {
		CAdapter c = new CAdapter();
		Assert.assertFalse(c.test());
		c.setC(new C(true));
		Assert.assertTrue(c.test());
	}
	
	@Test(expected = Exception.class)
	public void testAddChildOnLeaf() throws Exception {
		Leaf l = new AAdapter();
		Leaf child = new AAdapter();
		l.addChild(child);
	}
	
	@Test
	public void testAddChildInComposite() throws Exception {
		Composite c = new Composite();
		Assert.assertEquals(0, c.getChildNumber());
		Leaf child = new AAdapter();
		c.addChild(child);
		Assert.assertEquals(1, c.getChildNumber());
		c.addChild(new AAdapter());
		Assert.assertEquals(2, c.getChildNumber());
	}
	
	@Test
	public void testSuccessCreateGerachia() throws Exception {
		Component upLevel = new Composite();
		upLevel.addChild(new AAdapter());
		Component firstGroundLevel = new Composite();
		upLevel.addChild(firstGroundLevel);
		Assert.assertEquals(1, firstGroundLevel.getLevel());
		firstGroundLevel.addChild(new AAdapter());
		Component secondGroundLevel = new Composite();
		secondGroundLevel.addChild(new AAdapter());
		firstGroundLevel.addChild(secondGroundLevel);
		Assert.assertEquals(2, secondGroundLevel.getLevel());
	}
	
	@Test
	public void testRecogniseFailInAllLevel() throws Exception {
		Component upLevel = new Composite();
		AAdapter a = new AAdapter();
		upLevel.addChild(a);
		Assert.assertFalse(upLevel.test());
		a.setA(new A(true));
		Assert.assertTrue(upLevel.test());
		Component firstGroundLevel = new Composite();
		AAdapter ag1 = new AAdapter();
		firstGroundLevel.addChild(ag1);
		Assert.assertFalse(firstGroundLevel.test());
		upLevel.addChild(firstGroundLevel);
		Assert.assertFalse(upLevel.test());
		ag1.setA(new A(true));
		Assert.assertTrue(firstGroundLevel.test());
		Assert.assertTrue(upLevel.test());
		Component secondGroundLevel = new Composite();
		AAdapter ag2 = new AAdapter();
		secondGroundLevel.addChild(ag2);
		AAdapter ag3 = new AAdapter();
		secondGroundLevel.addChild(ag3);
		Assert.assertFalse(secondGroundLevel.test());
		firstGroundLevel.addChild(secondGroundLevel);
		Assert.assertFalse(firstGroundLevel.test());
		Assert.assertFalse(upLevel.test());
		ag2.setA(new A(true));
		ag3.setA(new A(true));
		Assert.assertTrue(secondGroundLevel.test());
		Assert.assertTrue(firstGroundLevel.test());
		Assert.assertTrue(upLevel.test());
	}
	
	@Test
	public void testRecogniseAllFailLevel() throws Exception {
		Component upLevel = new Composite();
		AAdapter a = new AAdapter();
		upLevel.addChild(a);
		Component firstGroundLevel = new Composite();
		AAdapter ag1 = new AAdapter();
		ag1.setA(new A(true));
		firstGroundLevel.addChild(ag1);
		upLevel.addChild(firstGroundLevel);
		Component secondGroundLevel = new Composite();
		AAdapter ag2 = new AAdapter();
		ag2.setA(new A(true));
		secondGroundLevel.addChild(ag2);
		AAdapter ag3 = new AAdapter();
		secondGroundLevel.addChild(ag3);
		firstGroundLevel.addChild(secondGroundLevel);
		upLevel.test();
		ArrayList<Integer> failLevel = upLevel.getFailLevel();
		Assert.assertTrue(failLevel.contains(Integer.valueOf(1)));
		Assert.assertTrue(failLevel.contains(Integer.valueOf(2)));
		Assert.assertTrue(failLevel.contains(Integer.valueOf(3)));
	}
}
