/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication48;

/**
 *
 * @author nehirarap
 */
public class final24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] courses  = createArray();
        displayArray(courses);
        char[] score = createScoreLetter(courses);
        displayScoreLetter(score);
        System.out.println("gano:" + stdGano(score,courses));
        
    }
    
    public static int [][] createArray(){
        int courses [][] = {{75,4},{60,5},{55,4},{90,7},{82,6},{40,3}};
        return courses;
    }
    
    public static void displayArray(int[][] list){
        for(int i=0; i<list.length; i++){
           for(int j=0; j<list[i].length; j++){
              System.out.print(list[i][j] + " ");
           }
            System.out.println();
        }
    }
    
    public static char[] createScoreLetter(int[][] list){
       char[] ch = new char [6];
         for(int i=0; i<list.length; i++){
            if(list[i][0]>=85 && list[i][0]<=100)
                ch[i]='A';
            else if(list[i][0]>=75 && list[i][0]<=84)
                ch[i]='B';
            else if(list[i][0]>=65 && list[i][0]<=74)
                ch[i]='C';
            else if(list[i][0]>=85 && list[i][0]<=100)
                ch[i]='D';
            else
                ch[i]='F';
         } 
         return ch;
    }
    
    public static void displayScoreLetter (char[] list){
        System.out.println("score letters:");
        for(int i=0; i<list.length;i++){
            System.out.print(list[i]+ "");
            System.out.println();
        }
    
    }
    
    public static double stdGano(char[]list , int[][] akts){
       
        double average;
        double sum =0;
        double sum2=0;
        for(int i=0; i<akts.length; i++)
            sum2 += akts[i][1];
        for(int i=0; i<list.length; i++){
           if(list[i]=='A')
               sum += 4*akts[i][1];
           if(list[i]=='B')
               sum += 3*akts[i][1];
           if(list[i]=='C')
               sum += 2*akts[i][1];
           if(list[i]=='D')
               sum += 1*akts[i][1];
           else
               sum +=0;
           
        }
         average = sum/sum2;
         return average;
    }
}
