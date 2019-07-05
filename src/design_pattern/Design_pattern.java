/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design_pattern;
import java.util.*;
// Abstract-Occurence
class abstraction{
    ArrayList<occurence> al = new ArrayList();
}

class occurence{
   // ArrayList<abstraction> ab  = new ArrayList();
}
class film{
    String name;
    String author;
    ArrayList<chapter> chapters = new ArrayList();
    void chapterAdd(chapter c){
    chapters.add(c);
        System.out.println("Bölüm əlavə edildi. Bölüm adı: "+c.chapterName);
    }
}
class chapter{
    String chapterName;
    int chapterNum;
    public chapter(String chapterName,int chapterNum){
    this.chapterName = chapterName;
    this.chapterNum = chapterNum;
    }
}

public class Design_pattern {

    public static void main(String[] args) {
        film HarryPotter = new film();
        HarryPotter.author = "J.C Rowling";
        HarryPotter.name = "Harry Potter";
        HarryPotter.chapterAdd(new chapter("Philosopher's Stone",1));
    }
    
}
