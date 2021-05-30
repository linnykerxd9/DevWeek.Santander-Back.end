package com.project.backendProjetoSantander.exceptions;

import com.project.backendProjetoSantander.util.MessageUtils;

public class NotFoundException extends RuntimeException{
    
    public NotFoundException(){
        super(MessageUtils.NO_RECORDS_FOUND);
    }
}
