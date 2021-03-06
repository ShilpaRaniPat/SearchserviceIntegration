package com.stackroute.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

    @ControllerAdvice
    public class GlobalException {



        @ExceptionHandler(ConceptNotFoundException.class)
        public ResponseEntity handleMuzixNotFoundException (final ConceptNotFoundException a){
            return new ResponseEntity(a.getMessage(), HttpStatus.CONFLICT);
        }
    }

