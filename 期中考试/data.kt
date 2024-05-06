package com.example.middleexam

data class Teacher(
    val name: String,
    val age:Int,
    val gender:String,
    val subject:String,
    val experienceYears:Int
)

data class Student(
    val name: String,
    val age:Int,
    val gender: String,
    val grade:String,
    val studentID:String
)

val teachers= listOf(
    Teacher("张老师",32,"男","数学",20),
    Teacher("王老师",22,"女","英语",20),
    Teacher("李老师",25,"男","语文",20),
    Teacher("黄老师",18,"男","体育",20),
    Teacher("吴老师",20,"女","政治",20),
)

val students= listOf(
    Student("李同学",18,"女","高二","2545512"),
    Student("林同学",17,"男","高二","2545521"),
    Student("王同学",19,"女","高三","2545545"),
    Student("孟同学",21,"男","高二","2545501"),
    Student("陈同学",20,"男","高一","2545510"),
)
