package protect.budgetwatch;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SetupflagActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setupflag);
       /*Intent i=getIntent();
        String data=i.getStringExtra("extra");
        Log.d("SetupflagActivity",data);
*/
        ////////下面是向上一个界面传递数据的代码
        Button button4=(Button)findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i=new Intent();
                i.putExtra("data_return","dhs");//向上一个界面传递两个参数??
                setResult(RESULT_OK,i);
                finish();
            }
        });

    }
    //a,b分别是预算与实际开销，c是预想的预算与开销的最大差距
    public static class flag
    {
        public boolean is_true(double a, double b,double c)
        {
            double temp=a-b;
            if(temp<0)
            {
                temp=-temp;
            }
            if(temp<=c)
            {
                return true;
            }
            else
                return false;
        }
    }
}
