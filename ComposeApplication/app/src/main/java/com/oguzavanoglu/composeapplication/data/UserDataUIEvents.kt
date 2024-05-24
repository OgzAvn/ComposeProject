package com.oguzavanoglu.composeapplication.data

//Event class
//these events will be used to update data the UI state
sealed class  UserDataUIEvents(){

    data class UserNameEntered(val name : String) : UserDataUIEvents()
    data class AnimalSelected(val animalValue : String) : UserDataUIEvents()

}