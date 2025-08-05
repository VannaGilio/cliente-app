package com.example.cliente_app_1.screens

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.cliente_app_1.screens.cliente.componentes.BarraDeTitulo
import com.example.cliente_app_1.screens.cliente.componentes.BarraInferior
import com.example.cliente_app_1.screens.cliente.componentes.BotaoFlutuante
import com.example.cliente_app_1.screens.cliente.componentes.Conteudo
import com.example.cliente_app_1.ui.theme.Clienteapp1Theme

@Composable
fun ListaDeClientes(modifier: Modifier = Modifier){
    Scaffold (
        topBar = {
            BarraDeTitulo()
        },
        bottomBar = {
            BarraInferior()
        },
        floatingActionButton = {
            BotaoFlutuante()
        },
        content = { padding ->
            Conteudo (padding)
        }
    )
}

@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun ListaDeClientesPreview(){
    Clienteapp1Theme {
        ListaDeClientes()
    }
}