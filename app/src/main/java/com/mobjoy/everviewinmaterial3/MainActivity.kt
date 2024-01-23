package com.mobjoy.everviewinmaterial3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.carousel.CarouselLayoutManager
import com.google.android.material.carousel.CarouselSnapHelper
import com.mobjoy.everviewinmaterial3.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var viewBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
        initViews()
    }

    private fun initViews() {
        setAdapter()
    }

    private fun setAdapter() {
        val pic1 = imageRes(R.drawable.pic1)
        val pic2 = imageRes(R.drawable.pic2)
        val pic3 = imageRes(R.drawable.pic3)
        val pic4 = imageRes(R.drawable.pic4)
        val pic5 = imageRes(R.drawable.pic5)
        val pic6 = imageRes(R.drawable.pic6)
        val pic7 = imageRes(R.drawable.pic7)
        val pic8 = imageRes(R.drawable.pic8)
        val pic9 = imageRes(R.drawable.pic9)
        val pic10 = imageRes(R.drawable.pic10)
        val ls = listOf(
            pic1, pic2, pic3, pic4, pic5, pic6, pic7, pic8, pic9, pic10
        )
        val adapter = imageAdapter(ls)
        viewBinding.carouselRecyclerView.adapter = adapter
        val snapHelper = CarouselSnapHelper()
        snapHelper.attachToRecyclerView(viewBinding.carouselRecyclerView)
        //set alignment type of carousel (fullScreen - Hero - Centered)
        viewBinding.carouselRecyclerView.layoutManager = CarouselLayoutManager()

    }

}