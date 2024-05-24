package com.oguzavanoglu.composeapplication.data


//we have our UI state class which is a data it holds name entered and any animal selected
data class UserInputScreenState(

    var nameEntered : String = "",
    var animalSelected : String = ""

)