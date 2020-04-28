package com.example.cafejabi;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.ArrayList;
import java.util.List;

public class BottomCafeInformationView extends RelativeLayout implements View.OnClickListener {
    private static final String TAG = "BottomInfoView";

    public EventListener listener;

    private Cafe cafe;

    private TextView textView_cafe_name, textView_cafe_address,
            textView_cafe_description, textView_cafe_seats, textView_last_updated_time;

    public void setEventListener(EventListener l){
        listener = l;
    }

    public interface EventListener{
        void btnCancel();
        void btnGoCafeInfo();
    }

    public BottomCafeInformationView(Context context, Cafe cafe){
        this(context, (AttributeSet) null);
        this.cafe = cafe;
        init();
    }

    public BottomCafeInformationView(Context context, AttributeSet attrs){
        super(context, attrs);
    }

    private void init(){
        LayoutInflater.from(getContext()).inflate(R.layout.info_bottom, this, true);

        textView_cafe_name = findViewById(R.id.textView_info_cafename);
        textView_cafe_address = findViewById(R.id.textView_info_cafenaddress);
        textView_cafe_description = findViewById(R.id.textView_info_cafedescription);
        textView_cafe_seats = findViewById(R.id.textView_info_cafeseats);
        textView_last_updated_time = findViewById(R.id.textView_info_last_updated_time);

        textView_cafe_name.setText(cafe.getCafe_name());
        textView_cafe_address.setText(cafe.getAddress());
        textView_cafe_description.setText(cafe.getCafe_info());
        textView_cafe_seats.setText(cafe.getTable()+"/"+cafe.getTotal_table());
        textView_last_updated_time.setText("마지막 업데이트 시간 : "+cafe.getTable_update_time());
    }

    @Override
    public void onClick(View view){
        switch(view.getId()){
//            case R.id.button_menu_back:
//                listener.btnCancel();
//                break;

            case R.id.linearLayout_bottom_info:
                listener.btnGoCafeInfo();
                break;

            default:
                break;
        }
    }
}