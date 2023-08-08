package org.acme.Exception;

public enum AlticeBEExceptionEnum {



    A_BE_EXCEPTION_0("Ocorreu um erro a realizar o pedido"),
    A_BE_EXCEPTION_1("Labseq input tem que ser superior a 0");




    private final String alticeBEException;

    AlticeBEExceptionEnum(String alticeBEException) {
        this.alticeBEException = alticeBEException;
    }

    public String valueOf() {
        return this.alticeBEException;
    }

}
