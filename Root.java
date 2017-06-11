/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visitor;

/**
 *
 * @author USER
 */
public class Root extends Composite {

    public Root(String name) {
        super(name);
    }

    public Root(String side, String name) {
        
        super(side, name);
    }

    @Override
    public void setComponent(Component component) {
        
        //it could be any logic to assign the side of its child;
        
        this.getComponents().add(component);
    }

   @Override
    public void accept(NodeVisitor v) {
        
        v.visitor(this);
        
    }
    
}
