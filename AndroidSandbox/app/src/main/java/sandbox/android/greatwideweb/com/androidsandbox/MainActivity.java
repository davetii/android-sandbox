package sandbox.android.greatwideweb.com.androidsandbox;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToCardActivity(View view) {
        Intent intent = new Intent(this, CardGrid.class);
        startActivity(intent);
    }
}
