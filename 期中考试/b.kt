package com.example.middleexam

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class BFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val students= listOf(
            Student("李同学",18,"女","高二","2545512"),
            Student("林同学",17,"男","高二","2545521"),
            Student("王同学",19,"女","高三","2545545"),
            Student("孟同学",21,"男","高二","2545501"),
            Student("陈同学",20,"男","高一","2545510"),
        )
        return inflater.inflate(R.layout.activity_b, container, false)
    }
}
