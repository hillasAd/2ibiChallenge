# 2ibiChallenge
Challenge to back-end engeneer

Back-end engineer challenge
Hilário Francisco
Email: hilario20101@hotmail.com
Linked In: https://www.linkedin.com/in/hilárioAmamo/ 
845017001
Maputo

API RESTful
 Instruções sobre o desafio
A API foi desenvolvida em java e o Sistema de Gestão de Base de Dados escolhido foi MySQL.
IDE de desenvolvimento SpringToolSuite4.
Postman para teste das url.
URL's para teste e avaliação da API

•	Criar um novo país
POST: https://apihillas.herokuapp.com/challengeAPI/country/save
Atributos (name, capital, region, subregion, area).

•	Listar todos os países
GET: https://apihillas.herokuapp.com/challengeAPI/countries

•	Modificar os dados de um país
PUT: https://apihillas.herokuapp.com/challengeAPI/country/update/10
10 corresponde ao id do país que pretende modificar.
No corpo do response deve informar as propriedades que deseja alterar, tal como procedeu no “Criar um novo país”.

•	Eliminar um país
DELETE: https://apihillas.herokuapp.com/challengeAPI/country/delete/10
10 corresponde ao id do país que pretende eliminar.

•	Ordenar a lista dos países por qualquer uma das suas propriedades
GET: https://apihillas.herokuapp.com/challengeAPI/country/orderBy/name

“name” é um dos parametros de ordenamento, outros são name, capital, region, subregion, area.
