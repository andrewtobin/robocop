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
		startActivity(new Intent(NearMeActivity.this, TrendingActivity.class));
    }
}    