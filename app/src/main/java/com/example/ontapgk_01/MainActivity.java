package com.example.ontapgk_01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.RadioGroup;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    EditText txtMa, txtTen;
    Button btnNhap;
    ImageButton btnXoa;
    RadioGroup radioGroup;
    ArrayList<NhanVien> arrnv;
    NVAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initview();

        adapter = new NVAdapter(this,R.layout.item_layout,arrnv);
        lv.setAdapter(adapter);
        btnNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                xuLyNhap();
            }
        });

        btnXoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                xuLyXoa();
            }
        });
    }

    private void xuLyXoa() {
        for(int i = lv.getChildCount() - 1; i >= 0; i--){
            View v = lv.getChildAt(i);
            CheckBox cb = (CheckBox) v.findViewById(R.id.cb_item);
            if(cb.isChecked()){
                arrnv.remove(i);
            }
        }
        adapter.notifyDataSetChanged();
    }

    private void xuLyNhap() {
        String ma = txtMa.getText().toString();
        String ten = txtTen.getText().toString();
        boolean gt = false;
        if(radioGroup.getCheckedRadioButtonId() == R.id.radioButton_Nu){
            gt = true;
        }
        NhanVien nv = new NhanVien();
        nv.setMaNV(ma);
        nv.setTenNV(ten);
        nv.setGioiTinh(gt);
        arrnv.add(nv);
        adapter.notifyDataSetChanged();

        txtMa.setText("");
        txtTen.setText("");
        txtMa.requestFocus();
    }

    private void initview() {
        txtMa = (EditText) findViewById(R.id.editText_Ma);
        txtTen = (EditText) findViewById(R.id.editText_Ten);
        btnNhap = (Button) findViewById(R.id.button_Nhap);
        btnXoa = (ImageButton) findViewById(R.id.imageButton_Xoa);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        lv = (ListView) findViewById(R.id.listview);
        arrnv = new ArrayList<NhanVien>();



    }
}
