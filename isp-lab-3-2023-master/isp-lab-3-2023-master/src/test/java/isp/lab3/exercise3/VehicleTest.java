/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package isp.lab3.exercise3;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Marius
 */
public class VehicleTest {
    
  

    @Test
    public void testToString() {
        System.out.println("toString");
        Vehicle instance = new Vehicle("Dacia","Logan",150,'B');
        String expResult = "Dacia (Logan) 150 B";
        String result =instance.toString() ;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    
}
