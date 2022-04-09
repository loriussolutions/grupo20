REST API com bando de dados volátel (inMemory)

>> COMANDOS

docker build .

docker run -d -p 8080:8080 loriussolutions/grupo20-jdk-api


>> ENDPOINTS

Lista de estudantes http://localhost:8080/api/students

Criação de estudante http://localhost:8080/api/student/save?name=Maria

