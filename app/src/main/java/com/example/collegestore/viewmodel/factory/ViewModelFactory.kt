package com.example.collegestore.viewmodel.factory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewmodel.CreationExtras
import com.example.collegestore.ClassApplication
import com.example.collegestore.viewmodel.activitiesViewModel.MainActivityViewModel

@Suppress("UNCHECKED_CAST")
val ViewModelFactory = object : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>, extras: CreationExtras): T =
        with(modelClass) {
            val application = checkNotNull(extras[APPLICATION_KEY]) as ClassApplication
            val tasksRepository = application.repository
            when {
                isAssignableFrom(MainActivityViewModel::class.java) -> MainActivityViewModel(
                    tasksRepository
                )
//                isAssignableFrom(TaskDetailViewModel::class.java) ->
//                    TaskDetailViewModel(tasksRepository)
//                isAssignableFrom(AddEditTaskViewModel::class.java) ->
//                    AddEditTaskViewModel(tasksRepository)
                else -> throw IllegalArgumentException("Unknown ViewModel class: ${modelClass.name}")
            }
        } as T
}