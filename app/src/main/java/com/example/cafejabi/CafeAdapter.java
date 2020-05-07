package com.example.cafejabi;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.cafejabi.objects.Cafe;

import java.util.ArrayList;
import java.util.List;

public class CafeAdapter extends BaseAdapter {
    private Context mContext;
    private List<Cafe> cafeList;

    private TextView textView_cafe_name, textView_cafe_address, textView_cafe_status;

    public CafeAdapter(Context context){
        this.mContext = context;
        this.cafeList = new ArrayList<>();
    }

    @Override
    public int getCount() {
        return cafeList.size();
    }

    @Override
    public Object getItem(int position) {
        return cafeList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    public void addItem(Cafe cafe){
        cafeList.add(0, cafe);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public View getView(int position, View view, ViewGroup parent) {
        Cafe cafe = cafeList.get(position);

        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.item_cafe, parent, false);
        }

        textView_cafe_name = view.findViewById(R.id.textView_item_cafe_name);
        textView_cafe_address = view.findViewById(R.id.textView_item_cafe_address);
        textView_cafe_status = view.findViewById(R.id.textView_item_cafe_status);

        textView_cafe_name.setText(cafe.getCafe_name());
        textView_cafe_address.setText(cafe.getAddress());

        textView_cafe_status.setText(cafe.getTable());

        return view;
    }
}
