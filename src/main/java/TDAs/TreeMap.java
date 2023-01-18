/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TDAs;

import java.io.File;
import java.util.LinkedList;

/**
 *
 * @author garci
 */
public class TreeMap {
    private NodeTreeMap root;
    
    public boolean  isFile(){
        return root.getChildren()==null ;
    }
    
    public boolean isDirectory(){
        return ! isFile();
    }
    
    public TreeMap(File file){
        this(new NodeTreeMap(file));
    }
    public TreeMap() {
        this.root= new NodeTreeMap();
    }

    public TreeMap(NodeTreeMap root) {
        this.root = root;
    }

    public NodeTreeMap getRoot() {
        return root;
    }

    public void setRoot(NodeTreeMap root) {
        this.root = root;
    }
    
    public boolean addChindren(File file ){
        if (file==null){
        return false;
        }if(file.isFile()){
            return root.addChildren(new TreeMap(new NodeTreeMap(file)));
        }if(file.isDirectory()){
            TreeMap newTM= new TreeMap(file);
            File[] files = file.listFiles();
            for(File f: files){
                newTM.addChindren(f);
            }
            return root.addChildren(newTM);
            
            
        }
        return false;
    }
    public LinkedList<TreeMap> getChildren(){
        return root.getChildren();
    }
    public double getWeight(){
        return getRoot().getWeight();
    }
    
    
}
