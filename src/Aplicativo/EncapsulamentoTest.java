package Aplicativo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EncapsulamentoTest 

{     
    public static void main (String[] args)  
    { 
        Encapsulamento obj = new Encapsulamento(); 
          
        
        obj.setName("Iron Man"); 
        obj.setAge(48); 
        obj.setRoll(100); 
          
        
        System.out.println("Geek's namehero: " + obj.getName()); 
        System.out.println("Geek's age hero: " + obj.getAge()); 
        System.out.println("Geek's roll hero: " + obj.getRoll()); 
          
              
    } 
} 

