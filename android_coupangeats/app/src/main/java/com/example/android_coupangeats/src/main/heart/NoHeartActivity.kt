package com.example.android_coupangeats.src.main.heart

import android.content.Intent
import android.os.Bundle
import com.example.android_coupangeats.config.BaseActivity
import com.example.android_coupangeats.databinding.ActivityNoHeartBinding

class NoHeartActivity : BaseActivity<ActivityNoHeartBinding>(ActivityNoHeartBinding::inflate){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.btnBack.setOnClickListener {
                val intent = Intent(this, HeartActivity::class.java)
                startActivity(intent)

        }
    }

}