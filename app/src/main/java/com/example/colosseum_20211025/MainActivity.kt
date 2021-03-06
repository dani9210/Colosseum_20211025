package com.example.colosseum_20211025

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import com.example.colosseum_20211025.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)



        binding.loginBtn.setOnClickListener {

//          입력한 이메일과 비밀번호를 데이터 바인딩으로 가져오기.

            val inputEmail = binding.emailEdt.text.toString()
            val inputPw = binding.passwordEdt.text.toString()


//            가져온 이메일/비번을 로그로 출력

            Log.d("입력이메일",inputEmail)
            Log.d("입력비번",inputPw)


        }

    }


}