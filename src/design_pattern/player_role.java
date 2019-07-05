/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design_pattern;

abstract class attendance{
public abstract boolean absent();
    int absent;
}
class student{
    String name;
    attendance attendanceRole;
    degree degreeRole;
    int average;
}
class fulltime extends attendance{
    public  boolean absent(){
        if(absent>120) return true;
        return false;
    }
}
class parttime extends attendance{
    public boolean absent(){
        if(absent>180) return true;
        return false;
    }
}
abstract class degree{
    abstract public boolean isGraduated(int score);
}
class bachelor extends degree{
    public boolean isGraduated(int score){
        if(score>51)return true;
        return false;
    }
}
class master extends degree{
    public boolean isGraduated(int score){
        if(score>71)return true;
        return false;
    }
}
public class player_role {
    public static void main(String args[]){
        student ali = new student();
        ali.attendanceRole = new fulltime();
        ali.attendanceRole.absent = 150;
        System.out.print("is Ali fail the course? ");
        System.out.println((ali.attendanceRole.absent())?"Yes":"NO");
        ali.attendanceRole = new parttime();
        ali.attendanceRole.absent = 150;
        ali.average = 92;
        ali.degreeRole = new master();
        System.out.print("is Ali fail the course? ");
        System.out.println((ali.attendanceRole.absent())?"Yes":"NO");
        System.out.print("is Ali graduated? ");
        System.out.println((ali.degreeRole.isGraduated(ali.average))?"Yes":"NO");
    }
}
