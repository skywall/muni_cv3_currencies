package cz.muni.cv3currencies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

	private EditText from;
	private EditText to;
	private Button download;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initUI();
	}

	private void initUI() {
		from = (EditText) findViewById(R.id.from);
		to = (EditText) findViewById(R.id.to);
		download = (Button) findViewById(R.id.btnDownload);

		download.setOnClickListener(new View.OnClickListener() {
			@Override public void onClick(View v) {
				// TODO call API
			}
		});
	}

	// TODO show result in UI
}
