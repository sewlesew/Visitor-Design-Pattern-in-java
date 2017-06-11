/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visitor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author USER
 */
public class DisplayNodeVisitor implements NodeVisitor {

  
    List<Component> rightNodes;
    List<Component> leftNodes;
    HashMap<String, Integer> leftMap;
    HashMap<String, Integer> rightMap;
       
    public DisplayNodeVisitor(){
        rightNodes=new ArrayList<Component>();
        leftNodes=new ArrayList<Component>();
        leftMap=new HashMap<String,Integer>();
        rightMap=new HashMap<String,Integer>();                
    }
    
    
    @Override
    public void visitor(Node node) {
     
        if(node.getSide().equalsIgnoreCase("left")){
            String name;
        for(Component n:node.getComponents()){
            name=n.getName().substring(0, 1);
             leftMap.put(name, leftMap.get(name)+1);
              visitor((Node)n);
                     }
        
        }
        else if(node.getSide().equalsIgnoreCase("right")){
            String name;
             for(Component n:node.getComponents()){
                   name=n.getName().substring(0, 1);
            rightMap.put(name, rightMap.get(name)+1);
              visitor((Node)n);
            
                   }
        }

      }

    @Override
    public void visitor(Root root) {
        
     System.out.println(root.getName());
       List<Component> cmps= root.getComponents();
       
       for(Component n:cmps){
          
           if(n.getSide().equalsIgnoreCase("left")){                
               leftNodes.add(n);                     
           }
           else if(n.getSide().equalsIgnoreCase("right")){
               rightNodes.add(n);
           }
           
       }
       print(rightNodes);
       print(leftNodes);
     
      }
    
    private void print(List<Component> nodes){
         
        HashMap<String,Integer> choose=leftMap;
        String type="left";
        String name;
         if(nodes.size()>=0){             
             if(nodes.get(0).getSide().equalsIgnoreCase("right")){
                 choose=rightMap;
                type="right";
             }               
         }
               
        for(Component c:nodes){
            name=c.getName().substring(0,1);
            choose.put(name,1);
            visitor((Node)c);
        }
        
          System.out.println(type+" Nodes: ");
        for(String key:choose.keySet()){            
             System.out.println(choose.get(key)+" " +key +" Nodes");
        }     
        
    }
    
    
}
