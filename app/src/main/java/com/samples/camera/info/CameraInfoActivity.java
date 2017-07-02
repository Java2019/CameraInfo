package com.samples.camera.info;

import android.hardware.camera2.*;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class CameraInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera_info);

        TextView text = (TextView)findViewById(R.id.text);

        CameraManager manager = (CameraManager)getSystemService(CAMERA_SERVICE);
        try {
            String[] strings = manager.getCameraIdList();
            for (String cameraID:strings){
                CameraCharacteristics characteristics = manager.getCameraCharacteristics(cameraID);
                text.append("Antibanding:\t" + characteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_ANTIBANDING_MODES));
            }
        } catch (CameraAccessException e) {
            e.printStackTrace();
        }

    }
}
