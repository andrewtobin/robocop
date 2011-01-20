package openconference.app;

import openconference.app.R;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends TouchActivity {
    public MainActivity() {
		super(R.layout.main);
    }
    
    @Override
    public void FlingRightToLeft()
    {
		startActivity(new Intent(MainActivity.this, NewsActivity.class));
    }
    
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        Button sched = (Button)findViewById(R.id.viewschedule);
	    sched.setOnClickListener (new View.OnClickListener() {
	    	
	    	//@Override
	    	public void onClick(View v) {
	    		Intent intent = new Intent("openconference.NewsActivity");
	    		startActivity(intent);
	    	}
    	});
    }
}