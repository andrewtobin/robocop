package openconference.app;
import openconference.app.R;

import android.content.Intent;

public class AddNewActivity extends TouchActivity {
    public AddNewActivity() {
		super(R.layout.newconference);
	}
    
    @Override
    public void FlingRightToLeft()
    {
		startActivity(new Intent(AddNewActivity.this, HistoryActivity.class));
    }
}    