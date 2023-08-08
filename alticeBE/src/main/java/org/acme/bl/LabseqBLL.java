package org.acme.bl;

import io.quarkus.cache.CacheResult;
import jakarta.enterprise.context.ApplicationScoped;
import org.acme.Exception.AlticeBEException;
import org.acme.Exception.AlticeBEExceptionEnum;
import org.acme.bl.api.LabseqBLLAPI;

import java.math.BigInteger;

@ApplicationScoped
public class LabseqBLL implements LabseqBLLAPI {


    @Override
    public BigInteger getLabseqValue(int n) throws AlticeBEException {
        verifyLabseqInput(n);

        return calculateLabseqValueRecursiveAlternative(n);
    }

    @CacheResult(cacheName = "LabseqValue")
    BigInteger calculateLabseqValueRecursive(int n){
        switch (n){
            case 0:
            case 2:
                return BigInteger.ZERO;
            case 1:
            case 3:
                return BigInteger.ONE;
            default:
                BigInteger result=BigInteger.ZERO;
                result=result.add(calculateLabseqValueRecursive(n-4));
                result=result.add(calculateLabseqValueRecursive(n-3));
                return result;
        }
    }

    BigInteger calculateLabseqValueRecursiveAlternative(int n) {
        switch (n){
            case 0:
            case 2:
                return BigInteger.ZERO;
            case 1:
            case 3:
                return BigInteger.ONE;
            default:
                for (int i=0;i<n;i+=500){
                    calculateLabseqValueRecursive(i);
                }
                return calculateLabseqValueRecursive(n);
        }
    }

    void verifyLabseqInput(int n) throws AlticeBEException {
        if (n<0){
            throw new AlticeBEException(AlticeBEExceptionEnum.A_BE_EXCEPTION_1);
        }
    }
}
