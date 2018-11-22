/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chatapp;

import java.io.*;
import java.net.*;
        
public class DateTimeMulitServer {

    public static void main(String[] args) {
        try{
        int port = Integer.parseInt(args[0]);
        ServerSocket server = new ServerSocket(port);
        System.out.println("DateTimeServer laeuft");
        while (true){
            Socket s = server.accept();
            new DateTimeDienst(s).start();
        }
        }
        catch (ArrayIndexOutOfBoundsException ae) {
        System.out.println("Aufruf: java DateTimeServer <Port-Nummer>");
        }
        catch (IOException e){
        e.printStackTrace();
        }
    }
    }
