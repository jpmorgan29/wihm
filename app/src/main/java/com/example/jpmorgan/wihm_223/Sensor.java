package com.example.jpmorgan.wihm_223;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.util.Log;

import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

/**
 * Created by jpmorgan on 3/27/17.
 */

public class Sensor {  //implements Parcelable {
    BluetoothSocket BTSocket;
    BluetoothDevice BTSensor;
    static final UUID myUUID = UUID.fromString("00001101-0000-1000-8000-00805F9B34FB");
    InputStream inputStream;

    public Sensor(String name){
        this.name = name;


    }
    public Sensor(BluetoothDevice btDev){
        BTSensor = btDev;
        name = btDev.getName();
        BluetoothSocket tmp = null;
        try {
            if (BTSocket == null) {
                tmp = BTSensor.createRfcommSocketToServiceRecord(myUUID);
                BTSocket = tmp;
                //inputStream = BTSocket.getInputStream();
                BTSocket.connect();
                Log.e("Connected", name);

                //inputStream = BTSocket.getInputStream();
            }
        } catch (IOException e) {
            e.printStackTrace();
            Log.e("Connection","Socket's create() method failed");
        }

    }

    private String name = null;

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    private int heartBeat = 0;
    public int getHeartBeat(){
        return heartBeat;
    }
    public void setHeartBeat(int heartBeat){
        this.heartBeat = heartBeat;
    }

    private int weight = 0;
    public int getWeight(){
        return weight;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }

    private int length = 0;
    public int getLength(){
        return length;
    }
    public void setLength(int length){
        this.length = length;
    }

    private int idealHeartBeat = 0;
    public int getIdealHeartBeat(){
        return idealHeartBeat;
    }

    private String extra = null;
    public String getExtra() {
        return extra;
    }
    public void setExtra(String extra){
        this.extra = extra;
    }

    public void GetHeartRate(){
        byte[] buffer = new byte[256]; // buffer store for the stream
        int bytes; // bytes returned from read()
        // Keep listening to the InputStream until an exception occurs
        while (true) {
            //try {
            // Read from the InputStream
            //bytes = inputStream.read(buffer); // Get number of bytes and message in "buffer"
            //heartBeat = bytes;
            //    } catch (IOException e) {
            //        break;
            //    }
        }
    }
}

