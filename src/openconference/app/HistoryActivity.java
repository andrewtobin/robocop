package openconference.app;

import openconference.app.R;
import openconference.models.Conference;
import openconference.storage.MockConferenceRepository;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import java.util.List;
import android.widget.ListView;
import android.widget.TextView;

public class HistoryActivity extends TouchActivity {
    public HistoryActivity() {
		super(R.layout.history);
	
		try
		{
		conferences = new MockConferenceRepository().getConferences();
		}
		catch(Exception e)
		{
			android.util.Log.i ("openconf", e.getMessage());
		}
	}
    
    @Override
    public void FlingRightToLeft()
    {
    	Intent i = new Intent(HistoryActivity.this, NearMeActivity.class);
    	i.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
		startActivity(i);
    }
    
    List<Conference> conferences;
    
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
	    ListView hist = (ListView)findViewById(R.id.historylist);
	    
	    ConferenceAdapter adapter = new ConferenceAdapter();

	    hist.setAdapter(adapter);
    }
    
    class ConferenceAdapter extends ArrayAdapter<Conference>
    {
    	ConferenceAdapter()
    	{
    		super(HistoryActivity.this, R.layout.history_row, R.id.name, conferences);
    	}
    	
    	@Override
    	public View getView(int position, View convertView, ViewGroup parent)
    	{
    		LayoutInflater inflater = getLayoutInflater();
    		View row = inflater.inflate(R.layout.history_row, parent, false);
    		
    		TextView name = (TextView)row.findViewById(R.id.name);
    		name.setText(conferences.get(position).getName());
    		
    		return row;
    	}
    }
}    