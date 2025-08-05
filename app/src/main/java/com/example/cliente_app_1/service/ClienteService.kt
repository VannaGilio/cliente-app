package com.example.cliente_app_1.service

import com.example.cliente_app_1.model.Cliente
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface ClienteService {

    @POST("clientes")
    fun cadastrarCliente(@Body cliente: Cliente): Call<Cliente>  //Passo o cliente e a resposta após a criação

    @GET("clientes")
    fun listarClientes(): Call<List<Cliente>>

    @GET("clientes/{id}")
    fun buscarClientes(@Path("id") id: Long): Call<Cliente>
}