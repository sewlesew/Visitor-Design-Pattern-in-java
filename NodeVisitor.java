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
public interface NodeVisitor {
    
    public void visitor(Node node);
    public void visitor(Root root);
    
}
