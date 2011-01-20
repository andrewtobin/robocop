package openconference.app;
import openconference.app.R;

import android.content.Intent;

public class HistoryActivity extends TouchActivity {
    public HistoryActivity() {
		super(R.layout.history);
	}
    
    @Override
    public void FlingRightToLeft()
    {
		startActivity(new Intent(HistoryActivity.this, NearMeActivity.class));
    }
}    