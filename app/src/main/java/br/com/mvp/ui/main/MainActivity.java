package br.com.mvp.ui.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import br.com.mvp.R;

public class MainActivity extends AppCompatActivity implements MainContract.View{

    private MainPresenter presenter;
    private EditText etLogin, etPassword;
    private Button btSignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new MainPresenter(this);

        vInitComponents();

        btSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.pSignIn("", "");
            }
        });
    }

    @Override
    public void vInitComponents() {
        etLogin = findViewById(R.id.etLogin);
        etPassword = findViewById(R.id.etPassword);
        btSignIn = findViewById(R.id.btSignIn);
    }

    @Override
    public void vShowMessage(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();
    }
}
