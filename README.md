# Documentación Prueba técnica ASO

## ASO  📑

## Tabla de contenidos
- [Introducción](#introducción)
- [Requisitos del proyecto ](#requisitos-del-proyecto)
- [Especificaciones del sistema ](#especificaciones-del-sistema)
- [Supuestos ](#supuestos)
- [Configuraciones ](#configuraciones)
- [Autor ](#autor)

### Introducción
- Este nuevo desafío nos sumerge en el mundo de ASO, combinando conocimientos previos en Java, ASO, APX, Docker y Postman para la implementación de una API REST en el contexto de un banco. El objetivo principal es gestionar simulaciones de contrataciones de tarjetas de crédito para un cliente a través de un servicio que acepta peticiones POST con datos en formato JSON.

        

### Requisitos del proyecto  
✅

-El campo de entrada details.offerType debe ser el mismo en la entrada y en la respuesta del servicio, y debe validar que solo ingresen mayúsculas.
-El campo de entrada details.limitAmount.amount no puede ser nulo.
-El campo de entrada details.limitAmount.currency no puede ser nulo ni vacío.
-El campo de entrada details.product.id tiene que utilizar un regex para validar que no sea diferente a “TDC”(ya sea con anotaciones o con lógica en java).
-El campo de entrada details.product.subproduct.id solo puede contener de 0 a 2 caracteres(ya sea con anotaciones o con lógica en java).
-El campo de salida data.id debe ser aleatorio(devolver un valor único en cada consumo), y debe ser de 10 caracteres.
-El campo de salida data.nuip debe ser el mismo que el uri/queri param de entrada(es decir, puede hacer uso de @PathParam o @QueryParam que haya establecido en la entrada del servicio).
-El campo de salida data.details.limitAmount.amount debe ser el mismo de la entrada.
-El campo de salida data.details.minimumAmount.amount debe ser el valor de la entrada details.limitAmount.amount menos del 10% del mismo.
-El campo de salida data.details.maximumAmount.amount debe ser el valor de la entrada details.limitAmount.amount más el 5% del mismo.
-El campo de salida data.details.minimumAmount.currency debe ser el mismo valor de la entrada details.limitAmount.currency.
-El campo de salida data.details.maximumAmount.currency debe ser el mismo valor de la entrada details.limitAmount.currency.
-El campo de salida details.product.id debe ser el mismo valor de la entrada details.product.id.
-El campo de salida details.product.subproduct.id debe ser el mismo valor de la entrada details.product.subproduct.id.



### Especificaciones del sistema  
💻

- especificaciones
    - Java
    - Intellij
    - DOCKER
    - POSTMAN
    - Contenedor proporcionado en clase

### Supuestos 



### Configuraciones 
##  **⚙️**

- Ejecucucion del programa
    - si tienes un disco S: y si no ejecutar el script para crearlo
    - Tener configurado el contenedor en docker
    - Despues de compilarlo y tener configurado todo
      - ir a la carpeta del proyecto el el apartado de tarjet y ejecutar con los comandos de
        -aso-cli deploy helloWorld.jar asoContainer --reload=false
        -aso-cli deploy helloWorld-facade.jar asoContainer --reload=false
        -aso-cli deploy helloWorld-sn.jar asoContainer --reload=true

|-Este ultimo reinciara el contenedor verificar si es asi y esperar un momento

 -En el Postman hacer la request del servicio POST 

 ```json
{
  "details": {
    "offerType": "CARD_HOLDER",
    "limitAmount": {
      "amount": 200000,
      "currency": "EUR"
    },
    "product": {
      "id": "TDC",
      "subproduct": {
        "id": "AV"
      }
    }
  }
}

      
        

 
     
       
      
        
     
          
  



    
  

### Autor 
👨‍💻
***José Luis Ruiz Chavez***   

*JVB01SM*
