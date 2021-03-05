/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankcharges;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class BankChargesTest {

    public BankChargesTest() {
    }
    
    @Test
    public void testCalculateCharges() {
        System.out.println("calculateCharges");
        double result = BankCharges.calculateCharges(19);
        assertEquals(11.9, result, 1);
        double result1 = BankCharges.calculateCharges(43);
        assertEquals(12.58, result1, 1);
    }
    
}
