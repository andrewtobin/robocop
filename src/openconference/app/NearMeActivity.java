package openconference.app;
import openconference.app.R;

import android.content.Intent;

public class NearMeActivity extends TouchActivity {
    public NearMeActivity() {
		super(R.layout.nearme);
	}
    
    @Override
    public void FlingRightToLeft()
    {
    	Intent i = new Intent(NearMeActivity.this, TrendingActivity.class);
    	i.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
		startActivity(i);
    }
}    