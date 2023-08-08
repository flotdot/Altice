package org.acme.bl;

import org.acme.Exception.AlticeBEException;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class LabseqBLLTest {

    private LabseqBLL labseqBLL=new LabseqBLL();

    @Test
    void calculateLabseqValueRecursive() {
        try {
            assertEquals(BigInteger.valueOf(2),labseqBLL.getLabseqValue(9));
            assertEquals(BigInteger.valueOf(3),labseqBLL.getLabseqValue(10));
            assertEquals(BigInteger.valueOf(4),labseqBLL.getLabseqValue(11));

        } catch (AlticeBEException e) {
            fail();
        }
    }
}