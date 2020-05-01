# Projeto cliente
esse projeto é para estudar como usar o Spring Boot Client

## Configurações
No arquivo `bootstrap.yml` tem uma configuração `spring.application.name` que tem que ser o nome do arquivo property
que está servidor de configuração.

Por padrão esta rodando no profile `development`. Para iniciar com outro profile, usar o parâmetro ao executar:
`-Dspring.profiles.active=` 

## Atualizar Configurações
Ao iniciar a aplicação, serão carregadas as propriedades do server.
Quando houver alterações no servidor, é preciso 'pedir' as atualizações novamente ao servidor.

Para isso é preciso fazer uma requisição `POST` para `/actuator/refresh` no servidor do cliente.

