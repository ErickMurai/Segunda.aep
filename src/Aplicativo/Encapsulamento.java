package Aplicativo;

public class Encapsulamento 
	
{ 
   
    private String geekHero; 
    private int geekRollhero; 
    private int geekAgehero; 
  
   
    public int getAge()  
    { 
      return geekAgehero; 
    } 
   
    
    public String getName()  
    { 
      return geekHero; 
    } 
      
   
    public int getRoll()  
    { 
       return geekRollhero; 
    } 
   
    
    public void setAge( int newAge) 
    { 
      geekAgehero = newAge; 
    } 
   
    
    public void setName(String newName) 
    { 
      geekHero = newName; 
    } 
      
    
    public void setRoll( int newRoll)  
    { 
      geekRollhero = newRoll; 
    } 
} 
