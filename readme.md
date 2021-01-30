# Gerenciador de salas de reuniões - back-end

**Este é o back-end do projeto Gerenciador de salas de reuniões.**

Ele possui o [front-end](https://github.com/mhoc4/Gerenciador-de-salas-de-reunioes-frontend)



API com Spring Boot para gerenciar salas de reunião, usando Spring Data para persistência de dados e o banco in-memory H2



Feito através do live coding da professora Kamila Santos.



## Stack utilizada:

- Spring Web
- Spring Data JPA
- H2 Database
- Java 8
- Maven

## Endpoints criados na API

- Criar sala de reuniao POST - /api/v1/rooms
- Listar todas as salas GET - /api/v1/rooms
- Buscar uma sala pelo Id GET - /api/v1/rooms/{id}
- Atualizar uma sala pelo Id PUT - /api/v1/rooms/{id}
- Excluir uma sala pelo id DELETE - /api/v1/rooms/{Id}



