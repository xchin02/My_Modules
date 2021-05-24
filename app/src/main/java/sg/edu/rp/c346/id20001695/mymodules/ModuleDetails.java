package sg.edu.rp.c346.id20001695.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetails extends AppCompatActivity {

    TextView tvModuleCode, tvModuleName, tvYear, tvSem, tvCredit, tvVenue;
    Button btnReturn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_details);

        tvModuleCode = findViewById(R.id.textViewModuleCode);
        tvModuleName = findViewById(R.id.textViewModuleName);
        tvYear = findViewById(R.id.textViewYear);
        tvSem = findViewById(R.id.textViewSem);
        tvCredit = findViewById(R.id.textViewCredit);
        tvVenue = findViewById(R.id.textViewVenue);
        btnReturn = findViewById(R.id.buttonReturn);

        Intent intentReceived = getIntent();
        String moduleCode = intentReceived.getStringExtra("value");

        if (moduleCode.equals("C346")) {
            tvModuleCode.setText("Module Code: C346");
            tvModuleName.setText("Module Name: Android Programming");
            tvYear.setText("Academic Year: 2021");
            tvSem.setText("Semester: 1");
            tvCredit.setText("Module Credit: 4");
            tvVenue.setText("Venue: E62E");
        }

        if (moduleCode.equals("C203")) {
            tvModuleCode.setText("Module Code: C203");
            tvModuleName.setText("Module Name: Web Development");
            tvYear.setText("Academic Year: 2021");
            tvSem.setText("Semester: 1");
            tvCredit.setText("Module Credit: 4");
            tvVenue.setText("Venue: W67L");
        }

        if (moduleCode.equals("C228")) {
            tvModuleCode.setText("Module Code: C228");
            tvModuleName.setText("Module Name: Operating System Security");
            tvYear.setText("Academic Year: 2021");
            tvSem.setText("Semester: 1");
            tvCredit.setText("Module Credit: 4");
            tvVenue.setText("Venue: E62L");
        }

        if (moduleCode.equals("C328")) {
            tvModuleCode.setText("Module Code: C328");
            tvModuleName.setText("Module Name: Intelligent Networks");
            tvYear.setText("Academic Year: 2021");
            tvSem.setText("Semester: 1");
            tvCredit.setText("Module Credit: 4");
            tvVenue.setText("Venue: E62C");
        }

        if (moduleCode.equals("C331")) {
            tvModuleCode.setText("Module Code: C331");
            tvModuleName.setText("Module Name: Digital Security and Forensics");
            tvYear.setText("Academic Year: 2021");
            tvSem.setText("Semester: 1");
            tvCredit.setText("Module Credit: 4");
            tvVenue.setText("Venue: E61J");
        }

        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModuleDetails.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}