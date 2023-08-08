package org.acme.Exception;


public class AlticeBEException extends Exception {

    public AlticeBEException(AlticeBEExceptionEnum exception){
        super(exception.valueOf());
    }


}
