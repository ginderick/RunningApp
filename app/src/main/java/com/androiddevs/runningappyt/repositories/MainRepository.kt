package com.androiddevs.runningappyt.repositories

import com.androiddevs.runningappyt.db.Run
import com.androiddevs.runningappyt.db.RunDao
import javax.inject.Inject

class MainRepository @Inject constructor(
    val runDao: RunDao
) {
    suspend fun insertRun(run: Run) = runDao.insertRun(run)

    suspend fun deleteRun(run: Run) = runDao.deleteRun(run)

    fun getAllRunsSortedByDate() = runDao.getAllRunSortedByDate()

    fun getAllRunsSortedByDistance() = runDao.getAllRunSortedByDistance()

    fun getAllRunsSortedByCaloriesBurned() = runDao.getAllRunSortedByCaloriesBurned()

    fun getAllRunsSortedByTimeInMillis() = runDao.getAllRunSortedByTimeInMillis()

    fun getAllRunsSortedByAvgSpeed() = runDao.getAllRunSortedAvgSpeed()

    fun getTotalAvgSpeed() = runDao.getTotalAvgSpeed()

    fun getTotalDistance() = runDao.getTotalDistance()

    fun getTotalCaloriesBurned() = runDao.getTotalCaloriesBurned()

    fun getTotalTimeInMillis() = runDao.getTotalTimeInMillis()
}