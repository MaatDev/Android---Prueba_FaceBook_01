package com.facebook.android;

import com.facebook.android.Facebook.DialogListener;

import android.app.Activity;
import android.os.Bundle;
//http://www.maestrosdelweb.com/editorial/curso-android-trabajando-apis-facebook-twitter/
public class JMI_FacebookSSO extends Activity {
    

	Facebook facebook = new Facebook("215961965120729"); 
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        facebook.authorize(this,new DialogListener() {
        	
        	
        	
			@Override
			public void onComplete(Bundle values) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onCancel() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onFacebookError(FacebookError e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onError(DialogError e) {
				// TODO Auto-generated method stub
				
			}

				
        });
    }	
}    
    
