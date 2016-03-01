package shadik.com.edittextwithprefix;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private EditTextWithPrefix etPrefix;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etPrefix = (EditTextWithPrefix) findViewById(R.id.etPrefix);
        etPrefix.setTag("+22");
    }


}
