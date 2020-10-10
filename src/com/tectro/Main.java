package com.tectro;

import java.io.DataInputStream;
import java.net.Socket;

public class Main {

    public static void main(String[] args) {
        try {
            Socket client = new Socket("localhost",25565);
            DataInputStream dis = new DataInputStream(client.getInputStream());

            System.out.format("calculation result ~ %-10.3f", dis.readDouble());

        }
        catch (Exception exc)
        {
            System.out.println(exc.getMessage());
        }

    }
}
