package org.acme.rsl;


import jakarta.inject.Inject;
import org.acme.Exception.AlticeBEException;
import org.acme.Exception.AlticeBEExceptionEnum;
import org.acme.bl.LabseqBLL;
import org.acme.rsl.api.LabseqServiceAPI;

import java.math.BigInteger;

public class LabseqService implements LabseqServiceAPI {

    @Inject
    LabseqBLL labseqBLL;

    @Override
    public BigInteger getLabseqValue(int n) throws AlticeBEException {
        BigInteger result;

        try {
            result = labseqBLL.getLabseqValue(n);

        } catch (AlticeBEException e) {
            throw new AlticeBEException(AlticeBEExceptionEnum.A_BE_EXCEPTION_0);
        }

        return result;
    }

}
