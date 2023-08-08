package org.acme.bl.api;

import org.acme.Exception.AlticeBEException;

import java.math.BigInteger;

public interface LabseqBLLAPI {

    BigInteger getLabseqValue(int n) throws AlticeBEException;
}
