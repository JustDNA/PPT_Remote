package spider.nitt.pptrem;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class menu extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu);
	}
	
	public void menubtns(View v){
		switch(v.getId()){
		case R.id.present:
			Intent OpenAct2 = new Intent("spider.nitt.pptrem.BLUETOOTHFEATURE"); 
			startActivity(OpenAct2);
			break;
		
		}
	}
	
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}
	
	

}
