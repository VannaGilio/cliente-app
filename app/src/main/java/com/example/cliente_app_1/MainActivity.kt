package com.example.cliente_app_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.cliente_app_1.model.Cliente
import com.example.cliente_app_1.service.Conexao
import com.example.cliente_app_1.ui.theme.Clienteapp1Theme
import kotlinx.coroutines.Dispatchers
import okhttp3.Dispatcher
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.await

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Clienteapp1Theme {

                val cliente = Cliente(
                    id = null,
                    nome = "Cadastro Giovanna",
                    email = "email@giovanna.dev.br"
                )

                val enviar = Conexao().getClienteService()
                LaunchedEffect(Dispatchers.IO){
                    enviar.cadastrarCliente(cliente).await()
                }

//
//                val enviar = Conexao().getClienteService()
//
//                val requisicao = enviar.cadastrarCliente(cliente)
//
//                requisicao.enqueue(object : Callback<Cliente>{
//                    override fun onResponse(
//                        call: Call<Cliente?>,
//                        response: Response<Cliente?>
//                    ) {
//                        println("http code: ${response.code()}")
//                    }
//
//                    override fun onFailure(
//                        call: Call<Cliente?>,
//                        t: Throwable
//                    ) {
//                        TODO("Not yet implemented")
//                    }
//                })
            }
        }
    }
}