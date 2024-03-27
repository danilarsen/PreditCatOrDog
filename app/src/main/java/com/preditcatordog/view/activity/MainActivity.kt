package com.preditcatordog.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.danilarsen.catordog.ImageClassifier
import com.preditcatordog.R
import com.preditcatordog.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var viewBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
    }
}