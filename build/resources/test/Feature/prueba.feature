# Author : Juan Camilo Alvarez Barrios

@pruebaTecnica
Feature: Juan Camilo desea automatizar la prueba tecnica de Sophos

  Background:
    Given Juan Camilo ha ingresado al link de la prueba tecnica


  Rule: Se automatice la prueba tecnica

    @escenarioUno
    Scenario Outline: Automatizar el escenario propuesto para la prueba tecnica
      Given Juan Camilo ingresa sus credenciales
        | user   | password   |
        | <user> | <password> |
      When da click en el multiplo de seis y seleccionando la respuesta
        | respuesta   |
        | <respuesta> |
      When accede al ciclo dos ingresando la fecha
        | fecha   |
        | <fecha> |
      When inicia el ciclo tres ingresando las respuestas
        | letra   | numeroRespuesta   |
        | <letra> | <numeroRespuesta> |
      When inicia el ciclo cuadro ingresando las respuestas
        | letraZ   | numeroRespuestaDos   |
        | <letraZ> | <numeroRespuestaDos> |
      When inicia el cinco cuadro ingresando las respuestas
        | selectCicloCinco   | numeroSecuencia   |
        | <selectCicloCinco> | <numeroSecuencia> |
      When inicia el ciclo seis ingresando las respuestas
        | fecha   |
        | <fecha> |
      When ingresa la informacion en el ciclo siete
        | fecha   |
        | <fecha> |
      When ingresa la letra y la respuesta correspondiente al ciclo ocho
        | letraM   |
        | <letraM> |
      When responde los retos del ciclo nueve
        | fecha   |
        | <fecha> |
      When ingresa la letra en el ciclo diez
        | letraV   |
        | <letraV> |
      Then Visualiza el mensaje de Felicidades, has terminado la prueba exitosamente
      Examples:
        | user   | password                                         | respuesta | fecha    | letra | numeroRespuesta | letraZ | numeroRespuestaDos | selectCicloCinco | numeroSecuencia | letraM | letraV |
        | 471002 | 10df2f32286b7120MS00LTIwMDE3NA==30e0c83e6c29f1c3 | -1301     | 12102021 | r     | 17              | Z      | 14                 | -61198           | 9               | M      | V      |


