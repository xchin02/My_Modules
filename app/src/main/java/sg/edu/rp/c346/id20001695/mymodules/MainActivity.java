package sg.edu.rp.c346.id20001695.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnC346, btnC203, btnC228, btnC328, btnC331;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnC346 = findViewById(R.id.buttonC346);
        btnC203 = findViewById(R.id.buttonC203);
        btnC228 = findViewById(R.id.buttonC228);
        btnC328 = findViewById(R.id.buttonC328);
        btnC331 = findViewById(R.id.buttonC331);

        btnC346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetails.class);
                intent.putExtra("value", "C346");
                startActivity(intent);
            }
        });
        btnC203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetails.class);
                intent.putExtra("value", "C203");
                startActivity(intent);
            }
        });

        btnC228.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetails.class);
                intent.putExtra("value", "C228");
                startActivity(intent);
            }
        });

        btnC328.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetails.class);
                intent.putExtra("value", "C328");
                startActivity(intent);
            }
        });

        btnC331.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetails.class);
                intent.putExtra("value", "C331");
                startActivity(intent);
            }
        });
    }
}