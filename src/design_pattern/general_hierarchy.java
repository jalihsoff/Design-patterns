/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design_pattern;
import java.util.*;
    class worker{
        String name;
        worker manager;
    public worker(){}
    public worker(String name){
    this.name = name;
    }
    }
    class manager extends worker{
        ArrayList<worker> subworkers = new ArrayList<worker>();
        String Degree="x";
        public manager(String name){super(name);}
        public void addWorker(worker sub){
            subworkers.add(sub);
            sub.manager = this;
        }
    }
public class general_hierarchy {
    public static void main(String args[]){
        manager ali = new manager("Ali");
        manager fuad = new manager("Fuad");
        worker elman = new worker("Elman");
        worker nicat = new worker("Nicat");
        ali.addWorker(elman);
        ali.addWorker(nicat);
        fuad.addWorker(ali);
        System.out.println("Elmanin manageri: "+elman.manager.name);
        System.out.print("Alinin ishcileri: ");
        ali.subworkers.forEach((n)-> System.out.print(n.name+" "));
        System.out.println("");
        System.out.print("Fuadin ishcileri: ");
        fuad.subworkers.forEach((n)-> System.out.print(n.name+" "));
        System.out.println("");
    }
}
