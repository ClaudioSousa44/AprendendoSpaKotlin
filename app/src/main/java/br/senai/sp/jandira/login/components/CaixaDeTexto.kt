package br.senai.sp.jandira.login.components

import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun CaixaDeTexto(
    label: String,
    value: String,
    aoMudar: (String) -> Unit
) {
    OutlinedTextField(
        value = value ,
        onValueChange = {
            aoMudar(
                it
            )
        },
        label = { Text(text = label )}
    )
}

@Preview(showBackground = true)
@Composable
fun CaixaDeTextoPreview() {
    CaixaDeTexto("", "", {})
}