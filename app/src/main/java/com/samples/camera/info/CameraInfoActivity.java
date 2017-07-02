package com.samples.camera.info;

import android.hardware.Camera;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class CameraInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera_info);

        TextView text = (TextView)findViewById(R.id.text);
        Camera camera = Camera.open();
        Camera.Parameters params = camera.getParameters();

        text.append("Antibanding:\t" + params.getAntibanding());
        text.append("\nColor effect:\t" + params.getColorEffect());
        text.append("\nFlash mode:\t" + params.getFlashMode());
        text.append("\nFocus mode:\t" + params.getFocusMode());
        text.append("\nPicture format:\t" + params.getPictureFormat());
        text.append("\nPreview format:\t" + params.getPreviewFormat());
        text.append("\nPreview frame rate:\t" +
                params.getPreviewFrameRate());
        text.append("\nScene mode:\t" + params.getSceneMode());
        text.append("\nWhite balance:\t" + params.getWhiteBalance());
        camera.release();
    }
}
