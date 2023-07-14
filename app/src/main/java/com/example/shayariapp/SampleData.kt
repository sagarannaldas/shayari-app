package com.example.shayariapp

import java.util.ArrayList
import java.util.Calendar
import java.util.Date
import java.util.GregorianCalendar

object SampleData {
    private const val data1 = "this is data 1"
    private const val data2 = "this is data 2"

    private fun getDate(diff: Int): Date {
        val calender = GregorianCalendar()
        calender.add(Calendar.MILLISECOND, diff)
        return calender.time
    }

    val data: List<DataEntity>
        get() {
            val tempList: MutableList<DataEntity> = ArrayList()
            tempList.add(DataEntity(1, getDate(45), data1))
            tempList.add(DataEntity(2, getDate(46), data2))
            return tempList
        }
}