package com.androideity.strings;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {
	 
	protected Button btn;
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		btn = (Button) findViewById(R.id.btn_mensaje);
		btn.setOnClickListener(this);//asignamos el listener
	}
	 
	public void onClick(View view){//Evento del clic sobre el botón
		btn.setText(this.getString(R.string.btn_final));
	}
}