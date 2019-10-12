package com.beyondworlds.myrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.IntDef
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.beyondworlds.myrecyclerview.base.BaseAdapter
import com.beyondworlds.myrecyclerview.itemdecoration.SimpleItemDecoration
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.item_baseadapter.*

class MainActivity : AppCompatActivity() {

    var mList = ArrayList<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    fun initView() {
        initData()
        //设置布局管理器
//        recyclerview.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)

        recyclerview.layoutManager=GridLayoutManager(this,3,LinearLayoutManager.HORIZONTAL,false)
        //设置adapter
        recyclerview.adapter = BaseAdapter(mList)
        //设置分割线，自定义
//        recyclerview.addItemDecoration(SimpleItemDecoration(this))
        //系统默认下划线
        recyclerview.addItemDecoration(DividerItemDecoration(this,DividerItemDecoration.VERTICAL))
        //设置动画
    }

    fun initData() {
        for(x in 39..96){
            mList.add(x.toChar().toString())
        }
    }
}
