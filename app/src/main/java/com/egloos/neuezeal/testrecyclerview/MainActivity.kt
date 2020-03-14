package com.egloos.neuezeal.testrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var productList = listOf(
            ProductModel("김밥", 2500),
            ProductModel("라면", 3500),
            ProductModel("떡볶이", 4500),
            ProductModel("라볶이", 5500),
            ProductModel("우동", 6500)
        )

        foodContainer.adapter = Adapter(productList)

        foodContainer.layoutManager = LinearLayoutManager(this)
    }
}
