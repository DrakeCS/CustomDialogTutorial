package edu.drake.customdialog;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Button createTeamButton = (Button) findViewById(R.id.change_team_button);
		createTeamButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick (View v) {
				changeTeamName();
			}
		});
	}

	public void changeTeamName() {
		final Dialog dialog = new Dialog(this);

		dialog.setContentView(R.layout.dialog_change_team_name);
		dialog.setTitle("Create a new team");

		final EditText teamNameEdit = (EditText) dialog.findViewById(R.id.teamNameEdit);
		Button btnChange = (Button) dialog.findViewById(R.id.button_change);
		btnChange.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick (View v) {

				String teamName = teamNameEdit.getText().toString();

				if (teamName.equalsIgnoreCase("")) {
					// do nothing because they haven't entered anything...
				} else {
					TextView teamNameText = (TextView) findViewById(R.id.team_name_textview);
					teamNameText.setText("Your team's name is: " + teamName);
					dialog.dismiss();
				}
			}
		});
		Button btnCancel = (Button) dialog.findViewById(R.id.button_cancel);
		btnCancel.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick (View v) {
				dialog.cancel();
			}
		});
		
		dialog.show();
		
	}

}
