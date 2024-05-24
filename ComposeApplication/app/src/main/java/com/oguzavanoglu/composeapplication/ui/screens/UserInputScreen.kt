package com.oguzavanoglu.composeapplication.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.oguzavanoglu.composeapplication.AnimalCard
import com.oguzavanoglu.composeapplication.ButtonComponent
import com.oguzavanoglu.composeapplication.R
import com.oguzavanoglu.composeapplication.TextComponent
import com.oguzavanoglu.composeapplication.TextFieldComponent
import com.oguzavanoglu.composeapplication.TopBar
import com.oguzavanoglu.composeapplication.data.UserDataUIEvents
import com.oguzavanoglu.composeapplication.ui.UserInputViewModel


@Composable
fun UserInputScreen(userInputViewModel: UserInputViewModel, showWelcomeScreen : (valuesPair : Pair <String, String> ) -> Unit) {

    Surface(modifier = Modifier.fillMaxSize()) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(18.dp)
        ) {
            TopBar("Hi there \uD83D\uDE0A")

            TextComponent(
                textValue ="Let's learn about You !",
                textSize =24.sp)

            Spacer(modifier = Modifier.size(20.dp))

            TextComponent(
                textValue = "This app will prepare a details paged based on input provided by you !",
                textSize = 18.sp)

            Spacer(modifier = Modifier.size(60.dp))

            TextComponent(textValue = "Name",
                textSize = 18.sp)

            Spacer(modifier = Modifier.size(10.dp))

            TextFieldComponent(onTextChanged = {
                userInputViewModel.onEvent(
                    UserDataUIEvents.UserNameEntered(it)
                )
            })

            Spacer(modifier = Modifier.size(10.dp))

            TextComponent(textValue = "What do you like",
                textSize = 18.sp)

            Spacer(modifier = Modifier.size(10.dp))

            Row (modifier = Modifier.fillMaxWidth()){
        //Burayı da anlamadım.
                AnimalCard(image = R.drawable.cat, animalSelected = {
                    userInputViewModel.onEvent(
                        UserDataUIEvents.AnimalSelected(it)
                    )
                }, selected =  userInputViewModel.uiState.value.animalSelected == "Cat")
                AnimalCard(image = R.drawable.dog, animalSelected = {

                    userInputViewModel.onEvent(
                        UserDataUIEvents.AnimalSelected(it)
                    )
                },selected =  userInputViewModel.uiState.value.animalSelected == "Dog")
            }

            Spacer(modifier = Modifier.weight(1f))


            if (userInputViewModel.isValidState())
            {
                ButtonComponent (
                    goToDetailsScreen = {
                    println("==============ComingHere")
                    println("==============${userInputViewModel.uiState.value.nameEntered} and ${userInputViewModel.uiState.value.animalSelected}")

                    showWelcomeScreen(
                        Pair(

                            userInputViewModel.uiState.value.nameEntered,
                            userInputViewModel.uiState.value.animalSelected

                        )

                    )



                }

                )
            }





        }

    }
}


@Preview
@Composable
fun UserInputScreenPreview(){

    UserInputScreen(UserInputViewModel(), showWelcomeScreen = {})

}