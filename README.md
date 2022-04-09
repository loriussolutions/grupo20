Rodando o projeto


docker build .

docker run -d -p 8080:8080 loriussolutions/grupo20-jdk-api

Lista de estudantes http://localhost:8080/api/students
Criação de estudante http://localhost:8080/api/student/save?name=Maria