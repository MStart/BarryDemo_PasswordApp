package barry.demo.passwordApp;

import barry.demo.passwordApp.R;
import android.app.Activity;
import android.app.DownloadManager.Request;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.Toast;

public class PasswordActivity extends Activity {

	MyApplication myApplaction;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_password);
		myApplaction = (MyApplication) getApplication();
		
		final EditText editTextPassword = (EditText) findViewById(R.id.editTextPassword);
		
		findViewById(R.id.button1).setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				String password = editTextPassword.getText().toString();
				if (password != null && password.equals(myApplaction.password)) {
					Toast.makeText(PasswordActivity.this, "√‹¬Î’˝»∑£°", Toast.LENGTH_SHORT).show();
					myApplaction.isLocked = false;
					PasswordActivity.this.finish();
				} else {
					Toast.makeText(PasswordActivity.this, "√‹¬Î¥ÌŒÛ£°", Toast.LENGTH_SHORT).show();
					editTextPassword.setText("");
				}
			}
		});
	}
}
