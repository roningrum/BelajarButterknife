package co.id.roni.belajarbutterknife;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.tv_belajar_butteknife)
    TextView tvBelajarBK;
    @BindString(R.string.salam_butterknife)
    String helloButterKnife;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        tvBelajarBK.setText(helloButterKnife);
    }
}
