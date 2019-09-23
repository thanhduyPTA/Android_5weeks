package com.e.app_bai01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<NhanVien> arrNVien = null;
    MyArrayAdapter adapter = null;
    ListView listNV = null;
    Button btnNhap;
    ImageButton btnRemoveAll;
    EditText txtId, txtName;
    RadioGroup radGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNhap = findViewById(R.id.btnNhap);
        btnRemoveAll = findViewById(R.id.imgChooses);
        txtId = findViewById(R.id.edtID);
        txtName = findViewById(R.id.edtName);
        radGroup = findViewById(R.id.radGroup);

        listNV = findViewById(R.id.list);
        arrNVien = new ArrayList<NhanVien>();
        adapter = new MyArrayAdapter(this, R.layout.my_item_layout, arrNVien);
        listNV.setAdapter(adapter);

        btnNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                xuLyNhap();
            }
        });

        btnRemoveAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                xuLyXoa();
            }
        });
    }

    public void xuLyNhap() {
        String ma = txtId.getText().toString();
        String ten = txtName.getText().toString();

        boolean gt = false;
        if (radGroup.getCheckedRadioButtonId() == R.id.radNu)
            gt = true;

        NhanVien nv = new NhanVien(ma, ten, gt);

        arrNVien.add(nv);
        adapter.notifyDataSetChanged();

        txtId.setText("");
        txtName.setText("");
        txtId.requestFocus();
    }

    public void xuLyXoa() {
        for (int i = listNV.getChildCount() - 1; i >= 0; i--) {
            View view = listNV.getChildAt(i);
            CheckBox ckb = view.findViewById(R.id.chk_item);
            if (ckb.isChecked())
                arrNVien.remove(i);
        }
        adapter.notifyDataSetChanged();
    }
}
