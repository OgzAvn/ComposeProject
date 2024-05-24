package com.oguzavanoglu.composeapplication.ui

import android.util.Log
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.oguzavanoglu.composeapplication.data.UserDataUIEvents
import com.oguzavanoglu.composeapplication.data.UserInputScreenState

class UserInputViewModel  : ViewModel() {

    //Whenever any event is happening let's add one log -tag
    companion object{
        const val TAG = "UserInputViewModel"
    }

    var uiState = mutableStateOf(UserInputScreenState()) //nameentered and animalselected

    fun onEvent(event : UserDataUIEvents){
        //this func will be trigged whenever any action will be taken by the user inside inputscreen

        when(event){

            is UserDataUIEvents.UserNameEntered ->{
                uiState.value = uiState.value.copy(
                    nameEntered = event.name
                )
                Log.d(TAG,"onEvent :UserNameEntered->>")
                Log.d(TAG,"${uiState.value}")
            }

            is UserDataUIEvents.AnimalSelected -> {
                uiState.value = uiState.value.copy(
                    animalSelected = event.animalValue
                )
                Log.d(TAG,"onEvent :AnimalSelected->>")
                Log.d(TAG,"${uiState.value}")

            }
        }
    }

    fun isValidState() : Boolean{

        return uiState.value.nameEntered.isNotEmpty() && uiState.value.animalSelected.isNotEmpty()
    }


}



