### Задача: реализовать сервис сообщений (чат).

В сервисе должны обрабатываться сценарии создания пользователя (регистрации), авторизации пользователя, сценарий обмена сообщениями.

**Структура**

•	Страница авторизации

•	Страница регистрации

•	Основная страница


**Страница авторизации**

•	Логин

•	Пароль

•	При несовпадении данных вывод ошибки

**Страница регистрации**

Поля  для  ввода:

•	Логин

•	Пароль (в случае, если пользователь уже существует (уникальность по login), выводится сообщение об ошибке)

•	Ссылка для переключения на окно авторизации

**Основная страница**

•	Список сообщений. В каждом сообщении должно быть от кого, текст сообщения и дата.

•	Поле для ввода сообщения и кнопка «отправить».

•	Кнопка для разавторизации

**Технические требования**

Необходимо обязательно использовать :

•	Spring boot (web, security, data)

•	postgresql

Для реализации веб интерфейса можно использовать любые технологии:

•	thymeleaf/html/bootstrap/jquery/angular