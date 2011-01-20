package openconference.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.GestureDetector.SimpleOnGestureListener;

public class TouchActivity extends Activity {

	public TouchActivity(int view) {
		this.VIEW = view;
	}

	private int VIEW;
	private static final int SWIPE_MIN_DISTANCE = 120;
	private static final int SWIPE_MAX_OFF_PATH = 250;
	private static final int SWIPE_THRESHOLD_VELOCITY = 200;
		
	private GestureDetector gestureDetector;
	View.OnTouchListener gestureListener;
			
		/** Called when the activity is first created. */
	    @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(VIEW);

	        gestureDetector = new GestureDetector(new CustomGestureDetector());
	        gestureListener = new View.OnTouchListener() {
	            public boolean onTouch(View v, MotionEvent event) {
	                if (gestureDetector.onTouchEvent(event)) {
	                    return true;
	                }
	                return false;
	            }
	        };
	    }
	    
	    public void FlingRightToLeft()
	    {
	    }
	    
	    public void FlingLeftToRight()
	    {
	    	this.finish();
	    }
	    
	    class CustomGestureDetector extends SimpleOnGestureListener {
	        @Override
	        public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
	            try {
	                if (Math.abs(e1.getY() - e2.getY()) > SWIPE_MAX_OFF_PATH)
	                	return false;
	                // right to left swipe
	                if(e1.getX() - e2.getX() > SWIPE_MIN_DISTANCE && Math.abs(velocityX) > SWIPE_THRESHOLD_VELOCITY) {
	                	FlingRightToLeft();
	                }  else if (e2.getX() - e1.getX() > SWIPE_MIN_DISTANCE && Math.abs(velocityX) > SWIPE_THRESHOLD_VELOCITY) {
	                	FlingLeftToRight();
	                }
	            } catch (Exception e) {
	            	android.util.Log.i ("openconf", e.getMessage());
	            }
	            return false;
	        }
	    }
	    
	    @Override
	    public boolean onTouchEvent(MotionEvent event) {
	        if (gestureDetector.onTouchEvent(event))
		        return true;
		    else
		    	return false;
	    }
	}