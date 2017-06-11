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
public interface Component {
    public void accept(NodeVisitor visitor);
    public String getSide();
    public String getName();
     public void setSide(String side);
    
}
