<h3>Запуск проекта:</h3>

Build: `mvn clean package` 

Start: `docker-compose up --build`

<hr>

<h3>Запрос:</h3>
POST: http://localhost:8080/api/client-validation

BODY:
```json
{
  "inn": 990911111111,
  "region_code": 24,
  "capital": 5000000
}
```