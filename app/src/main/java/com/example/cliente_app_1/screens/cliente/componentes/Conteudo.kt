package com.example.cliente_app_1.screens.cliente.componentes

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Done
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.AlertDialogDefaults.containerColor
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cliente_app_1.ui.theme.Clienteapp1Theme

@Composable
fun Conteudo (paddingValues: PaddingValues){
    Column (
        modifier = Modifier
            .padding(paddingValues)
            .fillMaxSize()
    ){
        Row (
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(8.dp)
        ){
            Icon(
                imageVector = Icons.Default.Person,
                contentDescription = "Person"
            )
            Spacer(
                modifier = Modifier
                    .width(6.dp)
            )
            Text(
                text = "Lista de Clientes",
                style = MaterialTheme.typography.titleMedium
            )
        }
        LazyColumn {
            items(10){
                Card (
                    modifier = Modifier
                        .padding(
                            start = 8.dp,
                            end = 8.dp,
                            bottom = 8.dp
                        )
                        .fillMaxWidth()
                        .height(80.dp)
                ){
                    Row (
                        modifier = Modifier
                            .padding(10.dp)
                            .fillMaxSize(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ){
                        Column {
                            Text(
                                text = "Nome do Cliente",
                                style = MaterialTheme.typography.titleMedium)
                            Text(
                                text = "Email",
                                style = MaterialTheme.typography.bodySmall)
                        }
                        Icon(
                            imageVector = Icons.Default.Delete,
                            contentDescription = "delete"
                        )
                    }
                }
            }
        }
    }
}
@Preview
@Composable
private fun ConteudoPreview (){
    Clienteapp1Theme {
        Conteudo(PaddingValues(16.dp))
    }
}