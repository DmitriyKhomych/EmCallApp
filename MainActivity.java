package dmitriy.khomych.emergencycallapp;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends Activity implements OnClickListener{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        View callButton = findViewById(R.id.btnCall);
        callButton.setOnClickListener(this);
    }
    
    private void phoneCall()
    {
     String phoneCallUri = "tel:466";
     Intent phoneCallIntent = new Intent(Intent.ACTION_CALL);
     phoneCallIntent.setData(Uri.parse(phoneCallUri));
     startActivity(phoneCallIntent);
    }

 @Override
 public void onClick(View v) {
  // TODO Auto-generated method stub
  switch(v.getId())
  {
   case R.id.btnCall:
    phoneCall();
    break;
   default:
    break;
  }
 }
}
