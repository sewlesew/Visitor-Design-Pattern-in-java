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
public class Node  extends Composite{
    

    public Node(String name) {
        super(name);
        
    }

    public Node(String side, String name) {
        super(side, name);
       
    }

    @Override
    public void accept(NodeVisitor v) {
        
        v.visitor(this);
        
    }
    
    public void setComponent(Component component){
        
      
            component.setSide(this.getSide());
        
           getComponents().add(component);
        
    }

    public List<Component> getComponents() {
        return components;
    }
    
}
