package com.example.basicsyntax

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		var myName = "홍성훈"
		var myAge : Int
		myAge = 25
		myAge = myAge + 1

		val birth = 922

		Log.d("BasicSyntax", "maName : $myName, myAge : $myAge , birth : $birth")
	}
}