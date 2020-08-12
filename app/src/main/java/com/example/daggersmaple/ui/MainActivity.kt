package com.example.daggersmaple.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.daggersmaple.model.BangladeshCricketTeam
import com.example.daggersmaple.model.Players
import com.example.daggersmaple.R
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var bangladeshCricketTeam: BangladeshCricketTeam

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnGetMyButton.setOnClickListener{
            tvPlayer.text = bangladeshCricketTeam.getMyBestEleven()
            tvCoachInfo.text = bangladeshCricketTeam.getCoachName()

            Log.e("checkInstance", bangladeshCricketTeam.toString())
        }
    }
}