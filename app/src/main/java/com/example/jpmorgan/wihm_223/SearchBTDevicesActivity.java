package com.example.jpmorgan.wihm_223;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.hardware.Sensor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Set;

public class SearchBTDevicesActivity extends AppCompatActivity {
    ArrayList<Sensor> sensors;
    ListView listSensors;
    Intent addSensor;
    Intent detailSensor;
    static final int ADD_DEVICE = 123;
    SimpleArrayAdapter arrAdapter;

    public class  SimpleArrayAdapter extends ArrayAdapter<Sensor> {
        public SimpleArrayAdapter(Context context, ArrayList<Sensor> values) {
            super(context, -1 , values);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent){
            View v = null;
            if(convertView != null){
                v = convertView;
            }
            else {
                v = getLayoutInflater().inflate(R.layout.list_view_sensor_layout, parent, false);
            }

            Sensor sensor = getItem(position);
            TextView tv = (TextView) v.findViewById(R.id.nameSensor);
            tv.setText(sensor.getName());
            TextView tvHeart = (TextView) v.findViewById(R.id.heartBeat);


           // IN COMMENT GEZET
            //tvHeart.setText(String.valueOf(sensor.getHeartbeat()));
            return v;
        }

    }

    private BluetoothAdapter mBluetoothAdapter = null;
    private Set<BluetoothDevice> pairedDevices;
    ArrayList<BluetoothDevice> connectedDevices;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_btdevices);
    }
}
