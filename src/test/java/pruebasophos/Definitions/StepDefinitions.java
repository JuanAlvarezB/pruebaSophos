package pruebasophos.Definitions;

import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import questions.ValidarTextoPruebaSophos;
import tasks.*;

import java.util.Map;


public class StepDefinitions {
    @DataTableType
    public Credenciales credenciales(Map<String, String> prop) {
        return new Credenciales(prop.get("user"), prop.get("password"));
    }

    @DataTableType
    public CicloUno cicloUno(Map<String, String> prop) {
        return new CicloUno(prop.get("respuesta"));
    }

    @DataTableType
    public CicloDos cicloDos(Map<String, String> prop) {
        return new CicloDos(prop.get("fecha"));
    }

    @DataTableType
    public CicloTres cicloTres(Map<String, String> prop) {
        return new CicloTres(prop.get("letra"), prop.get("numeroRespuesta"));
    }

    @DataTableType
    public CicloCuatro cicloCuatro(Map<String, String> prop) {
        return new CicloCuatro(prop.get("letraZ"), prop.get("numeroRespuestaDos"));
    }

    @DataTableType
    public CicloCinco cicloCinco(Map<String, String> prop) {
        return new CicloCinco(prop.get("selectCicloCinco"), prop.get("numeroSecuencia"));
    }

    @DataTableType
    public CicloSeis cicloSeis(Map<String, String> prop) {
        return new CicloSeis(prop.get("fechaCicloSeis"));
    }

    @DataTableType
    public CicloSiete cicloSiete(Map<String, String> prop) {
        return new CicloSiete(prop.get("fechaCicloSiete"));
    }

    @DataTableType
    public CicloOcho cicloOcho(Map<String, String> prop) {
        return new CicloOcho(prop.get("letraM"));
    }

    @DataTableType
    public CicloNueve cicloNueve(Map<String, String> prop) {
        return new CicloNueve(prop.get("fechaCicloNueve"));
    }

    @DataTableType
    public CicloDiez cicloDiez(Map<String, String> prop) {
        return new CicloDiez(prop.get("letraV"));
    }

    @Given("{actor} ha ingresado al link de la prueba tecnica")
    public void juanCamiloHaIngresadoAlLinkDeLaPruebaTecnica(Actor actor) {
        actor.attemptsTo(UrlPrueba.urlPrueba());
    }

    @Given("{actor} ingresa sus credenciales")
    public void juanCamiloIngresaSusCredenciales(Actor actor, Credenciales credenciales) {
        actor.attemptsTo(IngresarCredencialesPruebaSophos.ingresarCredencialesPruebaSophos(credenciales));
    }

    @When("da click en el multiplo de seis y seleccionando la respuesta")
    public void daClickEnElMultiploDeSeisYSeleccionandoLaRespuesta(CicloUno cicloUno) {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarCicloUnoPruebaSophos.ingresarCicloUnoPruebaSophos(cicloUno));
    }

    @When("accede al ciclo dos ingresando la fecha")
    public void accedeAlCicloDosIngresandoLaFecha(CicloDos cicloDos) {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarCicloDosPruebaSophos.ingresarCicloDosPruebaSophos(cicloDos));
    }

    @When("inicia el ciclo tres ingresando las respuestas")
    public void iniciaElCicloTresIngresandoLasRespuestas(CicloTres cicloTres) {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarCicloTresPruebaSophos.ingresarCicloTresPruebaSophos(cicloTres));
    }

    @When("inicia el ciclo cuadro ingresando las respuestas")
    public void iniciaElCicloCuadroIngresandoLasRespuestas(CicloCuatro cicloCuatro) {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarCicloCuatroPruebaSophos.ingresarCicloCuatroPruebaSophos(cicloCuatro));
    }

    @When("inicia el cinco cuadro ingresando las respuestas")
    public void iniciaElCincoCuadroIngresandoLasRespuestas(CicloCinco cicloCinco) {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarCicloCincoPruebaSophos.ingresarCicloCincoPruebaSophos(cicloCinco));
    }

    @When("inicia el ciclo seis ingresando las respuestas")
    public void iniciaElCicloSeisIngresandoLasRespuestas(CicloSeis cicloSeis) {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarCicloSeisPruebaSophos.ingresarCicloSeisPruebaSophos(cicloSeis));
    }

    @When("ingresa la informacion en el ciclo siete")
    public void ingresaLaInformacionEnElCicloSiete(CicloSiete cicloSiete) {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarCicloSietePruebaSophos.ingresarCicloSietePruebaSophos(cicloSiete));
    }

    @When("ingresa la letra y la respuesta correspondiente al ciclo ocho")
    public void ingresaLaLetraYLaRespuestaCorrespondienteAlCicloOcho(CicloOcho cicloOcho) {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarCicloOchoPruebaSophos.ingresarCicloOchoPruebaSophos(cicloOcho));
    }

    @When("responde los retos del ciclo nueve")
    public void respondeLosRetosDelCicloNueve(CicloNueve cicloNueve) {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarCicloNuevePruebaSophos.ingresarCicloNuevePruebaSophos(cicloNueve));
    }

    @When("ingresa la letra en el ciclo diez")
    public void ingresaLaLetraEnElCicloDiez(CicloDiez cicloDiez) {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarCicloDiezPruebaSophos.ingresarCicloDiezPruebaSophos(cicloDiez));
    }

    @Then("^Visualiza el mensaje de (.*)$")
    public void visualizaElMensajeDeFelicidadesHasTerminadoLaPruebaExitosamente(String validar) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarTextoPruebaSophos.validarTextoPruebaSophos(validar)));

    }
}
