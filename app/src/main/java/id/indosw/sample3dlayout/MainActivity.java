package id.indosw.sample3dlayout;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.followUserInput).setOnClickListener(view -> start(FollowUserInputActivity.class));

        findViewById(R.id.autoAnimate).setOnClickListener(view -> start(AutoAnimateActivity.class));
    }

    @SuppressWarnings("rawtypes")
    private void start(Class theClass) {
        startActivity(new Intent(this, theClass));
    }

}
