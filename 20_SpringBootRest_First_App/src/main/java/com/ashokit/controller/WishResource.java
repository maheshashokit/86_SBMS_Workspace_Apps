package com.ashokit.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/wishes")
public class WishResource {

     @GetMapping(value="/")
     public ResponseEntity<String> getWishMessages(){
         return new ResponseEntity<String>("Welcome To Rest API Development....", HttpStatus.OK);
     }
}
