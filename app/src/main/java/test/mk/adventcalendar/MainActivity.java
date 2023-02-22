package test.mk.adventcalendar;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.util.Calendar;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.app.AlertDialog;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.annotation.NonNull;
import android.util.Log;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static String TAG = "MainAc";
    private ImageButton mButton15;
    private ImageButton mButton16;
    private ImageButton mButton17;
    private ImageButton mButton18;
    private ImageButton mButton19;
    private ImageButton mButton20;
    private ImageButton mButton21;
    private ImageButton mButton22;
    private ImageButton mButton23;
    private ImageButton mButton24;

    private Calendar mCalendar;
    private int mDay;

    private DialogFragment mDialogFragment;
    private FragmentManager mFlagmentManager;

    public void MainActivity(){


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCalendar = Calendar.getInstance();
        //mDay = mCalendar.get(Calendar.DAY_OF_MONTH);
        mDay=24;
        Log.d(TAG,"day = "+mDay);
        mButton15 = findViewById(R.id.image_button_15);
        mButton16 = findViewById(R.id.image_button_16);
        mButton17 = findViewById(R.id.image_button_17);
        mButton18 = findViewById(R.id.image_button_18);
        mButton19 = findViewById(R.id.image_button_19);
        mButton20 = findViewById(R.id.image_button_20);
        mButton21 = findViewById(R.id.image_button_21);
        mButton22 = findViewById(R.id.image_button_22);
        mButton23 = findViewById(R.id.image_button_23);
        mButton24 = findViewById(R.id.image_button_24);

        mButton15.setOnClickListener(this);
        mButton16.setOnClickListener(this);
        mButton17.setOnClickListener(this);
        mButton18.setOnClickListener(this);
        mButton19.setOnClickListener(this);
        mButton20.setOnClickListener(this);
        mButton21.setOnClickListener(this);
        mButton22.setOnClickListener(this);
        mButton23.setOnClickListener(this);
        mButton24.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Log.d(TAG,"onClick");
        if(v!=null){
            switch (v.getId()){
                case R.id.image_button_15:
                    Log.d(TAG,"button15");
                    if(mDay==15){
                        Log.d(TAG,"chk1");
                        mFlagmentManager = getSupportFragmentManager();
                        mDialogFragment = new AlertDialogFragment(mDay);
                        mDialogFragment.show(mFlagmentManager, "alert dialog for XmasCards");
                    }
                    break;
                case R.id.image_button_16:
                    if(mDay==16){
                        Log.d(TAG,"chk1");
                        mFlagmentManager = getSupportFragmentManager();
                        mDialogFragment = new AlertDialogFragment(mDay);
                        mDialogFragment.show(mFlagmentManager, "alert dialog for XmasCards");
                    }
                    break;
                case R.id.image_button_17:
                    if(mDay==17){
                        Log.d(TAG,"chk1");
                        mFlagmentManager = getSupportFragmentManager();
                        mDialogFragment = new AlertDialogFragment(mDay);
                        mDialogFragment.show(mFlagmentManager, "alert dialog for XmasCards");
                    }
                    break;
                case R.id.image_button_18:
                    if(mDay==18){
                        Log.d(TAG,"chk1");
                        mFlagmentManager = getSupportFragmentManager();
                        mDialogFragment = new AlertDialogFragment(mDay);
                        mDialogFragment.show(mFlagmentManager, "alert dialog for XmasCards");
                    }
                    break;
                case R.id.image_button_19:
                    if(mDay==19){
                        Log.d(TAG,"chk1");
                        mFlagmentManager = getSupportFragmentManager();
                        mDialogFragment = new AlertDialogFragment(mDay);
                        mDialogFragment.show(mFlagmentManager, "alert dialog for XmasCards");
                    }
                    break;
                case R.id.image_button_20:
                    if(mDay==20){
                        Log.d(TAG,"chk1");
                        mFlagmentManager = getSupportFragmentManager();
                        mDialogFragment = new AlertDialogFragment(mDay);
                        mDialogFragment.show(mFlagmentManager, "alert dialog for XmasCards");
                    }
                    break;
                case R.id.image_button_21:
                    if(mDay==21){
                        Log.d(TAG,"chk1");
                        mFlagmentManager = getSupportFragmentManager();
                        mDialogFragment = new AlertDialogFragment(mDay);
                        mDialogFragment.show(mFlagmentManager, "alert dialog for XmasCards");
                    }
                    break;
                case R.id.image_button_22:
                    if(mDay==22){
                        Log.d(TAG,"chk1");
                        mFlagmentManager = getSupportFragmentManager();
                        mDialogFragment = new AlertDialogFragment(mDay);
                        mDialogFragment.show(mFlagmentManager, "alert dialog for XmasCards");
                    }
                    break;
                case R.id.image_button_23:
                    if(mDay==23){
                        Log.d(TAG,"chk1");
                        mFlagmentManager = getSupportFragmentManager();
                        mDialogFragment = new AlertDialogFragment(mDay);
                        mDialogFragment.show(mFlagmentManager, "alert dialog for XmasCards");
                    }
                    break;
                case R.id.image_button_24:
                    if(mDay==24){
                        Log.d(TAG,"chk1");
                        mFlagmentManager = getSupportFragmentManager();
                        mDialogFragment = new AlertDialogFragment(mDay);
                        mDialogFragment.show(mFlagmentManager, "alert dialog for XmasCards");
                    }
                    break;

            }
        }
    }
    public static class AlertDialogFragment extends DialogFragment {

        public AlertDialogFragment(int day){
            mdate = day;
        }
        private int mdate;
        AlertDialog dialog ;
        AlertDialog.Builder alert;
        View alertView;

        @Override
        @NonNull
        public Dialog onCreateDialog(Bundle savedInstanceState) {
            alert = new AlertDialog.Builder(getActivity());


            // カスタムレイアウトの生成
            if(getActivity() != null) {
                switch (mdate) {
                    case 15:
                        alertView = getActivity().getLayoutInflater().inflate(R.layout.alert_layout15, null);
                        break;
                    case 16:
                        alertView = getActivity().getLayoutInflater().inflate(R.layout.alert_layout16, null);
                        break;
                    case 17:
                        alertView = getActivity().getLayoutInflater().inflate(R.layout.alert_layout17, null);
                        break;
                    case 18:
                        alertView = getActivity().getLayoutInflater().inflate(R.layout.alert_layout18, null);
                        break;
                    case 19:
                        alertView = getActivity().getLayoutInflater().inflate(R.layout.alert_layout19, null);
                        break;
                    case 20:
                        alertView = getActivity().getLayoutInflater().inflate(R.layout.alert_layout20, null);
                        break;
                    case 21:
                        alertView = getActivity().getLayoutInflater().inflate(R.layout.alert_layout21, null);
                        break;
                    case 22:
                        alertView = getActivity().getLayoutInflater().inflate(R.layout.alert_layout22, null);
                        break;
                    case 23:
                        alertView = getActivity().getLayoutInflater().inflate(R.layout.alert_layout23, null);
                        break;
                    case 24:
                        alertView = getActivity().getLayoutInflater().inflate(R.layout.alert_layout24, null);
                        break;
                }
            }

            // alert_layout.xmlにあるボタンIDを使う
            ImageView xmascard = createDialog(mdate);
            xmascard.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Log.d("debug","bag1 clicked");
                    // Dialogを消す
                    getDialog().dismiss();
                }
            });

            // ViewをAlertDialog.Builderに追加
            alert.setView(alertView);

            // Dialogを生成
            dialog = alert.create();
            dialog.show();

            return dialog;
        }

        private ImageView createDialog(int date){
            ImageView dialog=null;
                switch (date){
                    case 15:
                        dialog = alertView.findViewById(R.id.c1215);
                        break;
                    case 16:
                        dialog = alertView.findViewById(R.id.c1216);
                        break;
                    case 17:
                        dialog = alertView.findViewById(R.id.c1217);
                        break;
                    case 18:
                        dialog = alertView.findViewById(R.id.c1218);
                        break;
                    case 19:
                        dialog = alertView.findViewById(R.id.c1219);
                        break;
                    case 20:
                        dialog = alertView.findViewById(R.id.c1220);
                        break;
                    case 21:
                        dialog = alertView.findViewById(R.id.c1221);
                        break;
                    case 22:
                        dialog = alertView.findViewById(R.id.c1222);
                        break;
                    case 23:
                        dialog = alertView.findViewById(R.id.c1223);
                        break;
                    case 24:
                        dialog = alertView.findViewById(R.id.c1224);
                        break;


                }
                if(dialog==null){
                    dialog = alertView.findViewById(R.id.c1215);
                }
            return dialog;
        }
    }


}