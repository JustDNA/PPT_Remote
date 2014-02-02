package spider.nitt.pptrem;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.os.Bundle;

public class intro extends Activity{
	public boolean entry = true;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.intro);
		
		
		timer.start();
	}
	
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		if(entry == false){
			exittimer.start();
		}
	}

	Thread timer = new Thread(){
		public void run(){
			try{
				sleep(2000);
			} catch(InterruptedException e){
				e.printStackTrace();
		} finally{
			if(entry == true){
			Intent OpenApp = new Intent("spider.nitt.pptrem.MENU"); 
			startActivity(OpenApp);
			entry = false;
			}
		}
		}
	};

	Thread exittimer = new Thread(){
		public void run(){
			try{
				sleep(1000);
			} catch(InterruptedException e){
				e.printStackTrace();
		} finally{
				
				finish();
				BluetoothAdapter.getDefaultAdapter().disable();
		}
		}
	};
	
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
	}

	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
	BluetoothAdapter.getDefaultAdapter().disable();
	}
	
	
	

}
