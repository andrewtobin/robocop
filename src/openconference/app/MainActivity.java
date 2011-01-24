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
    	Intent i = new Intent(MainActivity.this, NewsActivity.class);
    	i.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
    	startActivity(i);
    }
    
    @Override
    public void FlingLeftToRight()
    {
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
	    
	    AddButtons();
    }
    
    public void AddButtons()
    {
        Button home = (Button)findViewById(R.id.home);
	    home.setOnClickListener (new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				MoveToHome();
			}
		});
	    
	    Button news = (Button)findViewById(R.id.news);
	    news.setOnClickListener (new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				MoveToNews();
			}
		});
	    
	    Button add = (Button)findViewById(R.id.add);
	    add.setOnClickListener (new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				MoveToAddNew();
			}
		});
	    
	    Button history = (Button)findViewById(R.id.history);
	    history.setOnClickListener (new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				MoveToHistory();
			}
		});
	    
	    Button near = (Button)findViewById(R.id.near);
	    near.setOnClickListener (new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				MoveToNearMe();
			}
		});
	    
	    Button trend = (Button)findViewById(R.id.trend);
	    trend.setOnClickListener (new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				MoveToTrending();
			}
		});
    }
    
    public void MoveToHome()
    {
    	Intent i = new Intent(MainActivity.this, MainActivity.class);
    	i.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT | Intent.FLAG_ACTIVITY_SINGLE_TOP);
		startActivity(i);
    }

    public void MoveToNews()
    {
    	Intent i = new Intent(MainActivity.this, NewsActivity.class);
    	i.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
    	startActivity(i);
    }
    
    public void MoveToAddNew()
    {
    	Intent i = new Intent(MainActivity.this, AddNewActivity.class);
    	i.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
		startActivity(i);
    }
    
    public void MoveToHistory()
    {
    	Intent i = new Intent(MainActivity.this, HistoryActivity.class);
    	i.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
		startActivity(i);
    }
    
    public void MoveToNearMe()
    {
    	Intent i = new Intent(MainActivity.this, NearMeActivity.class);
    	i.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
		startActivity(i);
    }
    
    public void MoveToTrending()
    {
    	Intent i = new Intent(MainActivity.this, TrendingActivity.class);
    	i.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
		startActivity(i);
	}
}