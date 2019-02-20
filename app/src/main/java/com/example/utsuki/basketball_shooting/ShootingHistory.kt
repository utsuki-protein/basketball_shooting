package com.example.utsuki.basketball_shooting

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ListView
import android.widget.ArrayAdapter



class ShootingHistory : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shooting_history)
        //ListViewのセット
        val listView = ListView(this)
        setContentView(listView)

        //データの追加
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1)

        adapter.add("10 / 20")
        adapter.add("15 / 24")
        adapter.add("1 / 3")
        //受け取った変数を入れる
        val text = intent.getStringExtra("INSERT_DATA")
        Log.d("HIST", text)

//        Sqlite3からデータを読み込み
//        adapter.add(SQLiteRead)


        listView.setAdapter(adapter);
    }
}
