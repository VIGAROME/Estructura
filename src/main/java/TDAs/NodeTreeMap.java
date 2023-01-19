/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TDAs;

import java.io.File;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author garci
 */
public class NodeTreeMap implements Comparable<NodeTreeMap> {
    private LinkedList<TreeMap> children;
    private File file;
    private String path;
    private String name;
    private String Tipo_Tamnio;
    private double weight;

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
    

    public NodeTreeMap() {
        this(null,null,null,null,0);
    }

    //file.length() te da el tamano en byte y vamos a presentarlo por MB
    public NodeTreeMap(File file) {
        this(null,file,file.getPath(),file.getName(),file.length());
    }
    
    
    
    public NodeTreeMap(LinkedList<TreeMap> children,File file ,String path,String name, double weight) {
        this.children = children;
        this.file = file;
        this.path = path;
        this.name=name;
        this.weight = tranformarByte(weight);
    }

    public LinkedList<TreeMap> getChildren() {
        return children;
    }

    public void setChildren(LinkedList<TreeMap> children) {
        this.children = children;
    }

    private double tranformarByte(double bytes){
        if(bytes<= 1048576){
            this.Tipo_Tamnio="KB";
            return bytes/1024;
        }
        if(bytes<= 1073741824){
            this.Tipo_Tamnio="MB";
            return bytes/1048576;
        }
            
        this.Tipo_Tamnio="GB";
        return bytes/1073741824;
        
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
    
    public String getWeightString() {
        return String.format("%.2f",weight)+this.Tipo_Tamnio;
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

    @Override
    public int compareTo(NodeTreeMap o) {
        int var = -1;
        if(this.getName()==o.getName() && this.getPath()==o.getPath() && this.getWeight()==o.getWeight() ){
            var=0;
            if(this.getFile().isDirectory()){
                Stack<TreeMap> s1 = new Stack<>();
                Stack<TreeMap> s2 = new Stack<>();
                for(TreeMap mp:this.children){
                    s1.push(mp);
                }
                for(TreeMap mp:o.children){
                    s2.push(mp);
                }
                while(!s1.isEmpty()){
                    if(s1.pop().compareTo(s2.pop())!=0){
                        return -1;
                    }
                }
            }
        }
        
        return var;
    }
    
    
    
    
}
