package com.example.text;

import android.util.TypedValue;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class SizeListener implements OnClickListener{

	private TextView tv;
	public SizeListener(TextView tv){
		this.tv=tv;
	}
public void onClick (View v){
	float size=tv.getTextSize();
	switch(v.getId()){
	case R.id.bigger:
		size=size+2;break;
	case R.id.smaller:
		size=size+2;break;
		default:break;
		
		
	}
	if(size>=72){size=72;}
	if(size<=8){size=8;}
	
	tv.setTextSize(TypedValue.COMPLEX_UNIT_PX, size);
	

}
}


