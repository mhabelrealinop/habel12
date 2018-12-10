/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecthabel;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

class coba implements Runnable{
    private int ini;
    public coba(int ini){
        this.ini=ini;
    }
    public void run(){
        System.out.println("Anggka ganjil :"+ ini);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
    }
}
public class TUGAS2 {


    public static void main(String[] args) {
   ExecutorService service = Executors.newFixedThreadPool(5);
        for (int i=1;i<=100;i++)  if(i%2==1){
           
           
            service.submit(new coba (i));
            
        }
        service.shutdown();
       
        
        try{
            service.awaitTermination(5, TimeUnit.DAYS);
            
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Finish");
    
    }
   
}
