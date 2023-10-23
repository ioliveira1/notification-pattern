# Notification Pattern

Para uma melhor experiência com validações, o notification pattern visa a acumulação desses erros para que o lançamento da exception seja feito de uma só vez ao final do fluxo de validação.

Isso evita que o fluxo de uma validação (de uma regra de negócio, de dados inseridos por usuários em um form, etc..) seja interrompido a cada inconsistência encontrada, permitindo a validação das regras como um todo. 


Esse pattern foi descrito por Martin Fowler em seu [site](https://martinfowler.com/eaaDev/Notification.html).

---

### Como executar?
1. Clonar o repositório
```sh
git clone git@github.com:ioliveira1/notification-pattern.git
```

2. Subir a aplicação


3. POST para a URL `localhost:8080/users` com o request:
```
{
    "id": "123",
    "name": "",
    "email": ""
}
```

4. Resultado
```
{
    "timestamp": "dd-MM-yyyy HH:mm:ss",
    "message": "Error to create user",
    "path": "/users",
    "errors": [
        {
            "message": "name is required"
        },
        {
            "message": "email is required"
        }
    ]
}
```