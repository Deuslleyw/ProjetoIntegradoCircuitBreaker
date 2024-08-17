package com.deusleyDev.api_publication.exceptions;

public class FallbackException extends RuntimeException{

    public FallbackException(Throwable cause){
        super("INDISPONIVEL NO MOMENTO, POR FAVOR TENTE MAIS TARDE", cause);
    }
}
