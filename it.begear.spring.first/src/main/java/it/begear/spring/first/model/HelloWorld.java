package it.begear.spring.first.model;

import org.springframework.beans.factory.annotation.Autowired;

public class HelloWorld {
   private String message;

   public void setMessage(String message){
      this.message  = message;
   }
   public void getMessage(){
      System.out.println("Your Message : " + message);
   }
}
