package com.example.boykutleindeksihesaplama

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import org.json.JSONException
import org.json.JSONObject
configurations.all {
    resolutionStrategy {
        force 'com.android.support:support-v4:27.1.0'
    }
}

class MainActivity : AppCompatActivity() {

    //Eklenen Kodlar. Değişken tanımlandı.
    lateinit var boytext:EditText
    lateinit var kilotext:EditText
    lateinit var btnhesap:hesap
    lateinit var bkideger:deger
    lateinit var sonuctext:TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun btnHesapla(view:View){
        boytext= findViewById(R.id.boytext)
        kilotext= findViewById(R.id.kilotext)
        sonuctext= findViewById(R.id.sonuctext)

        var sonuc = kilotext.text.toString().toInt()  / boytext.text.toString().toInt()
        textSonuc.setText(sonuc.toString()) * boytext.text.toString().toInt() textSonuc.setText(sonuc.toString())
    }

}
