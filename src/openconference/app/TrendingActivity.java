package openconference.app;
import android.content.Intent;
import openconference.app.R;

public class TrendingActivity extends TouchActivity {
    public TrendingActivity() {
		super(R.layout.trending);
	}
    
    @Override
    public void FlingRightToLeft()
    {
    	Intent i = new Intent(TrendingActivity.this, AddNewActivity.class);
    	i.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
		startActivity(i);
    }
}    