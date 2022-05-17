package com.example.myapplication.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import com.example.myapplication.R;
import com.example.myapplication.databinding.ActivityPersonalInfoBinding;

import java.util.ArrayList;
import java.util.List;

public class InforListActivity extends BasicActivity {

    private ActivityPersonalInfoBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_info);

        binding = ActivityPersonalInfoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        List<String> data = new ArrayList<>();

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_activated_1,data);
        binding.pageList.setAdapter(adapter);

        data.add("로그인");
        data.add("로그아웃");
        data.add("회원정보 변경");
        data.add("비밀번호 변경");
        data.add("회원가입");
        data.add("개발자");

        adapter.notifyDataSetChanged();

        binding.pageList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        myStartActivity(LoginActivity.class);
                        break;
                    case 1:
                        myStartActivity(LoginActivity.class);
                        break;
                    case 2:
                        myStartActivity(LoginActivity.class);
                        break;
                    case 3:
                        myStartActivity(PasswordResetActivity.class);
                        break;
                    case 4:
                        myStartActivity(SignUpActivity.class);
                        break;
                    case 5:
                        myStartActivity(LoginActivity.class);
                        break;
                }
            }
        });
        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

    }
    private void myStartActivity(Class c) {
        Intent intent = new Intent(this, c);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }
}