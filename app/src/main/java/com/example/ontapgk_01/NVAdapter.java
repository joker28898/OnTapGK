package com.example.ontapgk_01;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class NVAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<NhanVien> nvlist;

    public NVAdapter(Context context, int layout, List<NhanVien> nvlist) {
        this.context = context;
        this.layout = layout;
        this.nvlist = nvlist;
    }

    @Override
    public int getCount() {
        return nvlist.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout, null);

        ImageView imgview = (ImageView) view.findViewById(R.id.img_item);
        TextView txtitem = (TextView) view.findViewById(R.id.tv_item);
        CheckBox cbitem = (CheckBox) view.findViewById(R.id.cb_item);

        NhanVien nhanVien = nvlist.get(i);
        txtitem.setText(nhanVien.toString());
        if (nhanVien.isGioiTinh()){
            imgview.setImageResource(R.drawable.nu);
        }
        else {
            imgview.setImageResource(R.drawable.nam);
        }


        return view;
    }
}
