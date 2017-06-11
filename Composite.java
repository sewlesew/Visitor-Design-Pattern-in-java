/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER
 */
public abstract class Composite implements Component {
    
     protected String side,name;
      List<Component> components;
      public Composite(String side, String name){
        this.side=side;
        this.name=name;  
         components=new ArrayList<Component>();
    }
    
    public Composite( String name){      
        this.name=name;   
         components=new ArrayList<Component>();
    }
    
    
     public abstract void setComponent(Component component);
        
        
        
    

    public List<Component> getComponents() {
        return components;
    }
    
    
    
    
    public void setSide(String side){
        this.side=side;
    }
    
    
     @Override
    public String getSide(){
        return side;
    }
    
     @Override
    public String getName(){
        return name;
    }
}
