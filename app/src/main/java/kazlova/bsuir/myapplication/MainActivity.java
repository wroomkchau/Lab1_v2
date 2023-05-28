package kazlova.bsuir.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import kazlova.bsuir.myapplication.text.TextFunction;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setT();
    }

    private void setT() {
        TextFunction tf = new TextFunction();
        TextView nt = findViewById(R.id.newtest);
        nt.setText(tf.getValue());
    }
}