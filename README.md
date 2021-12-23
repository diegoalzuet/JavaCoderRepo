# JavaCoderRepo
### Proyecto Final Java Inicial

- El proyecto final se encuentra en la carpeta [DesafioAPIClubesDB](https://github.com/diegoalzuet/JavaCoderRepo/tree/main/DesafioAPIClubesDB/)
- El archivo [apiClubes.postman_collection.json](https://github.com/diegoalzuet/JavaCoderRepo/blob/main/DesafioAPIClubesDB/JSON%20Equipos%20y%20Postman/apiClubes.postman_collection.json) es para importar en Postman con los distintos endpoints.
- El archivo [equipos.json](https://github.com/diegoalzuet/JavaCoderRepo/blob/main/DesafioAPIClubesDB/JSON%20Equipos%20y%20Postman/equipos.json) contiene una lista de equipos para agregar.
- Parametros de configuracion de la base de datos [apiclubes](https://github.com/diegoalzuet/JavaCoderRepo/blob/main/DesafioAPIClubesDB/src/main/resources/application.properties) 

**Detalle de los Endpoints:**
(Links a modo de ejemplos, solo peticiones GET son funcionales desde el navegador con la aplicacion corriendo.)
- [/getClubes](http://localhost:8080/apiClub/v1/getClubes): Devuelve la lista de todos los clubes.
- [/getClubById/{id}](http://localhost:8080/apiClub/v1/getClubById/5000): Devuelve el club con el ID especificado en el path. Si no existe lanza una excepcion que se muestra por consola.
- [/addClub](http://localhost:8080/apiClub/v1/addClub): Agrega un Club que se pasa en el Body de la petición. Se debe agregar en Postman.
- [/updateClub](http://localhost:8080/apiClub/v1/updateClub): Actualiza un Club que se pasa en el Body de la petición. Lanza una excepcion por consola si no se incluye el ID, y si el ID no existe.
- [/deleteClub/{id}](http://localhost:8080/apiClub/v1/deleteClub/5000): Elimina un Club con el ID especificado en el path. Si no existe lanza una excepcion por consola.
- [/Top3TitulosNacionales](http://localhost:8080/apiClub/v1/Top3TitulosNacionales):Devuelve el Top 3 de equipos con mas titulos nacionales.
- [/Top3TitulosInternacionales](http://localhost:8080/apiClub/v1/Top3TitulosInternacionales):Devuelve el Top 3 de equipos con mas titulos internacionales.
- [/Top3MasTitulos](http://localhost:8080/apiClub/v1/Top3MasTitulos):Devuelve el Top 3 de equipos con mas titulos nacionales e internacionales.
- [/filterByPais/{pais}](http://localhost:8080/apiClub/v1/filterByPais/argentina): Devuelve los equipos filtrados por el pais especificado en el path.
