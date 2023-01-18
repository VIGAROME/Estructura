/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TDAs;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author garci
 */
public class NodeTreeMap {
    private LinkedList<TreeMap> children;
    private File file;
    private String path;
    private String name;

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    private double weight;

    public NodeTreeMap() {
        this(null,null,null,null,0);
    }

    //file.length() te da el tamano en byte y vamos a presentarlo por MB
    public NodeTreeMap(File file) {
        this(null,file,file.getPath(),file.getName(),file.length()/(1024*1024));
    }
    
    
    
    public NodeTreeMap(LinkedList<TreeMap> children,File file ,String path,String name, double weight) {
        this.children = children;
        this.file = file;
        this.path = path;
        this.name=name;
        this.weight = Math.round(weight*100)/100d;
    }

    public LinkedList<TreeMap> getChildren() {
        return children;
    }

    public void setChildren(LinkedList<TreeMap> children) {
        this.children = children;
    }

    public String getContenido() {
        return path;
    }

    public void setContenido(String path) {
        this.path = path;
    }

    
    
    public double getWeight() {
        if(children == null){
            return this.weight;
        }else{
            double cont=0;
            for (TreeMap t : children){
                cont+=t.getWeight();
            }
            return cont;
        }
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public boolean addChildren(TreeMap fiel){
        if(children==null){
            children= new LinkedList<>();
        }
        if( fiel!=null){
        children.add(fiel);
        weight+= fiel.getRoot().getWeight();
        return true;
        }
        return false;
    }
    
    
    
    
}
