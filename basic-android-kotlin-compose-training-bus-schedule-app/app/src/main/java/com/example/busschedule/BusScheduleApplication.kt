package com.example.busschedule

import android.app.Application
import androidx.room.Database
import com.example.busschedule.data.AppDatabase

class BusScheduleApplication: Application() {
    val database: AppDatabase by lazy { AppDatabase.getDatabase(this) }
}