/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cart;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import entity.Product;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Hari
 */
public class ShoppingCartItemTest {
   
    ShoppingCartItem instance;

    public ShoppingCartItemTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {

    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
        Date date = new Date();
        BigDecimal price = new BigDecimal("100.0");
        Product movieName = new Product(123,"Mission Impossible",price,date);
        instance = new ShoppingCartItem(movieName);
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getProduct method, of class ShoppingCartItem.
     */
    @Test
    public void testGetProduct() {
        Date date = new Date();
        BigDecimal price = new BigDecimal("100.0");
        System.out.println("getProduct");
        Product expResult = new Product(123,"Mission Impossible",price,date);
        Product result = instance.getProduct();
        assertEquals(expResult, result);
    }

    /**
     * Test of getQuantity method, of class ShoppingCartItem.
     */
    @Test
    public void testGetQuantity() {
        System.out.println("getQuantity");
        short expResult = 1;
        short result = instance.getQuantity();
        assertEquals(expResult, result);
    }

    /**
     * Test of setQuantity method, of class ShoppingCartItem.
     */
    @Test
    public void testSetQuantity() {
        System.out.println("setQuantity");
        short quantity = 0;
        instance.setQuantity(quantity);
    }

    /**
     * Test of incrementQuantity method, of class ShoppingCartItem.
     */
    @Test
    public void testIncrementQuantity() {
        System.out.println("incrementQuantity");
        instance.incrementQuantity();
    }

    /**
     * Test of decrementQuantity method, of class ShoppingCartItem.
     */
    @Test
    public void testDecrementQuantity() {
        System.out.println("decrementQuantity");
        instance.decrementQuantity();

    }

    /**
     * Test of getTotal method, of class ShoppingCartItem.
     */
    @Test
    public void testGetTotal() {
        System.out.println("getTotal");
        double expResult = 100.0;
        double result = instance.getTotal();
        assertEquals(expResult, result, 0.0);
    }

}