package openconference.app;
import openconference.app.R;

import android.content.Intent;

public class NewsActivity extends TouchActivity {
    public NewsActivity() {
		super(R.layout.news);
	}
    
    @Override
    public void FlingRightToLeft()
    {
		startActivity(new Intent(NewsActivity.this, AddNewActivity.class));
    }
}    