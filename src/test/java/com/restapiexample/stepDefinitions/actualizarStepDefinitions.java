package com.restapiexample.stepDefinitions;

import com.restapiexample.model.editar;
import cucumber.api.DataTable;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.rest.SerenityRest;

import java.util.List;

public class actualizarStepDefinitions {
    @Cuando("^envia la siguiente informacion de usuario al servicio \"([^\"]*)\"$")
    public void enviaLaSiguienteInformacionDeUsuarioAlServicio(String url, List<editar> listaEditar) {


        String cuerpo="{\n" +
                "    \"status\": \""+listaEditar.get(0).getStatus()+"\",\n" +
                "    \"data\": {\n" +
                "        \"name\": \""+listaEditar.get(0).getName()+"\",\n" +
                "        \"salary\": \""+listaEditar.get(0).getSalary()+"\",\n" +
                "        \"age\": \""+listaEditar.get(0).getAge()+"\",\n" +
                "        \"id\": "+listaEditar.get(0).getId()+"\n" +
                "    }\n" +
                "}";
        SerenityRest.given().baseUri(url).header("Content-Encoding","application/json").body(cuerpo).post();
    }

    @Entonces("^el usuario valida el codigo de estatus sea (\\d+)$")
    public void elUsuarioValidaElCodigoDeEstatusSea(int status) {
        SerenityRest.lastResponse()
                .then().statusCode(status);

    }

}
