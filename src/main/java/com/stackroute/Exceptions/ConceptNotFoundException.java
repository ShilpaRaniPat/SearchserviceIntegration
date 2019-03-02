package com.stackroute.Exceptions;

public class ConceptNotFoundException extends Exception {

        private String message;

        //constructor

        public ConceptNotFoundException(){}


        //exception constructor

        public ConceptNotFoundException(String message){
            super(message);
            this.message=message;
        }
    }





