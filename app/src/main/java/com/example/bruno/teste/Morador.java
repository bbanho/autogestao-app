package com.example.bruno.teste;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Morador{

    @Expose
    @SerializedName("nroUsp")
    private Integer nroUsp;

    @Expose
    @SerializedName("estado")
    private String estado;

    @Expose
    @SerializedName("endereco")
    private String endereco;

    @Expose
    @SerializedName("rg")
    private String rg;

    @Expose
    @SerializedName("cpf")
    private String cpf;

}
