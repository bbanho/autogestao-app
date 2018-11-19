package com.example.bruno.teste;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Requerimento {

    @Expose
    @SerializedName("morador")
    private Morador morador;

    @Expose
    @SerializedName("problema")
    private String prolema;


}
