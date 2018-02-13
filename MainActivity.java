package practice.drunk;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1;
    EditText e1;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.presser);
        e1 = (EditText) findViewById(R.id.khoka);
        t1 = (TextView) findViewById(R.id.result);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                primeNumber();
            }


            private void primeNumber() {
                //      Toast.makeText(MainActivity.this, "hey"+e1.getText(), Toast.LENGTH_SHORT).show();
                int numb, m, i, flag = 0;
                numb = Integer.valueOf(e1.getText().toString());

                m = numb / 2;

                if (numb == 1 || numb == 0) {
                    t1.setText("This " + numb + " is not a prime or even");
                } else {
                    for (i = 2; i <= m; i++) {
                        if (numb % i == 0) {
                            t1.setText((" " + numb + " is not Prime!"));
                            flag = 1;
                            break;
                        }
                    }

                }

                if (flag == 0) {
                    t1.setText(" " + numb + " is prime number");
                } else {
                    t1.setText("no not prime!");
                }


            }
        });

    }
}
