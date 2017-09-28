/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csci310;

import java.util.Scanner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dalton
 */
public class CSCI310Test {
    
    public CSCI310Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class CSCI310.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("Main() untested");
    }

    /**
     * Test of readInput method, of class CSCI310.
     * Test to see if the readInput function can read the input right. Meaning,
     * that the function should throw away whitespace. Put the forward rotation
     * number in the N array, store all strings in the strArr, and count the
     * number of entries. The function should also stop when it sees a zero (did
     * not know how to test this last one)
     */
    @Test
    public void testReadInput_Scanner() {
        System.out.println("readInput");
        Scanner in = new Scanner("1 ABCD\n3 YO_THERE.\n1 .DOT\n14 ROAD\n9 SHIFTING_AND_ROTATING_IS_NOT_ENCRYPTING\n2 STRING_TO_BE_CONVERTED\n1 SNQZDRQDUDQ\n0");
        CSCI310 app = new CSCI310();
        app.readInput(in);
        assertEquals(7, app.T);
        assertArrayEquals(new int[] {1,3,1,14,9,2,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},app.N);
        assertArrayEquals(new String[] {"ABCD","YO_THERE.",".DOT","ROAD","SHIFTING_AND_ROTATING_IS_NOT_ENCRYPTING","STRING_TO_BE_CONVERTED","SNQZDRQDUDQ",null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null}, app.strArr);
    }

    /**
     * Test of run method, of class CSCI310.
     */
    @Test
    public void testRun() throws Exception {
        System.out.println("Run() untested");
    }

    /**
     * Test of readInput method, of class CSCI310.
     */
    @Test
    public void testReadInput_0args() {
        System.out.println("testReadInput_Oargs() not tested");
    }

    /**
     * Test of solveProblem method, of class CSCI310.
     * Test to see if the input is manipulated correctly by seeing if the
     * resulting string array is equal to the real answers
     */
    @Test
    public void testSolveProblem() {
        System.out.println("solveProblem()");
        CSCI310 instance = new CSCI310();
        Scanner in = new Scanner("1 ABCD\n3 YO_THERE.\n1 .DOT\n14 ROAD\n9 SHIFTING_AND_ROTATING_IS_NOT_ENCRYPTING\n2 STRING_TO_BE_CONVERTED\n1 SNQZDRQDUDQ\n0");
        instance.readInput(in);
        instance.solveProblem();
         assertArrayEquals(new String[] {"EDCB","CHUHKWBR.","UPEA","ROAD","PWRAYF_LWNHAXWH.RHPWRAJAX_HMWJHPWRAORQ.","FGVTGXPQEAGDAQVAIPKTVU","REVERSE_ROT",null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null}, instance.strArr);
    }

    /**
     * Test of writeOutput method, of class CSCI310.
     */
    @Test
    public void testWriteOutput() {
        System.out.println("writeOutput() not tested");
    }
    
}
