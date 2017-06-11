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
public class Client {
    
    public static void main(String[] args){
        
        Root root=new Root("Topic");
        
        //left nodes
        Node D=new Node("left","D");   
        
          Node E=new Node("left","E");
          Node F=new Node("left","F");
          
          E.setComponent(new Node("E1"));
          E.setComponent(new Node("E2"));
          E.setComponent(new Node("E3"));
           F.setComponent(new Node("F1"));
          F.setComponent(new Node("F2"));
          D.setComponent(new Node("D1"));
          D.setComponent(new Node("D2"));
         
           root.setComponent(D);
           root.setComponent(E);
           root.setComponent(F);
           
           
           //right nodes 
           
            Node A=new Node("right","A");  
            Node B=new Node("right","B");  
            Node C=new Node("right","C");  
            
            Node A1=new Node("A1");            
            Node A2=new Node("A2");
            A.setComponent(A1);
            A.setComponent(A2);
            
              A1.setComponent(new Node("AA1"));
              A1.setComponent(new Node("AA2"));
              A1.setComponent(new Node("AA3"));
           
            B.setComponent(new Node("B1"));
            B.setComponent(new Node("B2"));
            
            C.setComponent(new Node("C1"));
            C.setComponent(new Node("C2"));
            
           root.setComponent(A);
           root.setComponent(B);
           root.setComponent(C);
            
        
        NodeVisitor visitor=new DisplayNodeVisitor();
        root.accept(visitor);
       
        
    }
    
}
