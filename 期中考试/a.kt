package com.example.middleexam

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class AFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val teachers= listOf(
            Teacher("张老师",32,"男","数学",20),
            Teacher("王老师",22,"女","英语",20),
            Teacher("李老师",25,"男","语文",20),
            Teacher("黄老师",18,"男","体育",20),
            Teacher("吴老师",20,"女","政治",20),
        )
        return inflater.inflate(R.layout.activity_a, container, false)
    }
}
