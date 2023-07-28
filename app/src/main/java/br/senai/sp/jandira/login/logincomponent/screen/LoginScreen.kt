package br.senai.sp.jandira.login.logincomponent.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import br.senai.sp.jandira.login.logincomponent.components.Form
import br.senai.sp.jandira.login.logincomponent.components.Header

@Composable
fun LoginScreen() {
    Column {
        Header(Color.Green)
        Form()
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LoginScreenPreview() {
    LoginScreen()
}