package com.juynhh.android.myfirstkotlin

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.juynhh.android.myfirstkotlin.databinding.ActivityPreviewBinding

class PreviewActivity : AppCompatActivity() {

    private lateinit var activityPreviewBinding : ActivityPreviewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityPreviewBinding = ActivityPreviewBinding.inflate(layoutInflater)
        setContentView(activityPreviewBinding.root)
        val testStringFromMainActivity = intent.getStringExtra("Content msg")
        activityPreviewBinding.textViewMsg.text =testStringFromMainActivity
//        setContentView(R.layout.activity_preview)
    }
}