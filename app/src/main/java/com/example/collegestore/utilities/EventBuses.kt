package com.example.collegestore.utilities

import androidx.annotation.Keep

class SendEvent(val isSelected: Boolean)
class OnBackPressed(val isBackPressed: Boolean)
class HideBottomNavigation(val isTrue: Boolean)
class UpdateDataAdapterEvent(val set: Boolean, val contactId: Long)

@Keep
class FetchContact

@Keep
class DoAtStarting(val isSelected: Boolean)

@Keep
class UpdateSettingDefault