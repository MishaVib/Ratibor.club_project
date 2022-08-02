# Проект автоматизации тестирования сайта shashlik.club

##  Используемые инструменты

<p align="center">
<img width="6%" title="IntelliJ IDEA" src="images/logo/Intelij_IDEA.svg">
<img width="6%" title="Java" src="images/logo/Java.svg">
<img width="6%" title="Gradle" src="images/logo/Gradle.svg">
<img width="6%" title="JUnit5" src="images/logo/JUnit5.svg">
<img width="6%" title="Selenide" src="images/logo/Selenide.svg">
<img width="6%" title="Selenoid" src="images/logo/Selenoid.svg">
<img width="6%" title="Allure Report" src="images/logo/Allure_Report.svg">
<img width="6%" title="TestOps" src="images/logo/Allure_TO.svg">
<img width="6%" title="Jenkins" src="images/logo/Jenkins.svg">
<img width="6%" title="GitHub" src="images/logo/GitHub.svg">
<img width="6%" title="Telegram" src="images/logo/Telegram.svg">
</p>

## Краткая характеристика проекта
> ЯП для автотестов - <code>Java 11</code>
> 
> Библиотека <code>Selenide</code> в основе автотестов.
> 
> <code>JUnit 5</code> - основной фреймворк.
>
>  <code>Gradle</code> для сборки проекта.
>
> <code>Selenoid</code> выполняет запуск браузеров в контейнерах <code>Docker</code> (для удаленного запуска).
>
> <code>Allure</code> для визуализации результатов тестирования и степов.
>
> CI/CD - <code>Jenkins</code>.
>
> После завершения прогона отправляются уведомления с помощью бота в <code>Telegram</code>.
> 
> Для запуска нужного сьюта используется гибкая система тэгов
> 
> Библиотека Owner - для гибкой настройки конфига

## Реализованные в рамках проекта сьюты
> Для удобства прогона автотестов все тест-кейсы поделены на сьюты с помощью кастомных тэгов (по критерию проверки функционала):
> 
> regress, acceptance 
> 
> booking - кейсы, связанные с бронированием стола
> 
> order - кейсы, связанные с оформлением заказа
> 
> items - кейсы, связанные с товарами
> 
> search - кейсы, связанные с поиском на сайте 


## Запуск UI web тестов
* Примечание - для запуска нужного сьюта вместо test в команду можно подставить необходимый tag (например, order)
<details>
<summary>Подробнее ...</summary>

### Локальный запуск тестов

```./gradlew clean test -Dclient=localBrowser -Dtype=ui```

### Локальный запуск тестов в Selenoid
<details>
<summary>Шаги запуска</summary>

>1. Создать файл с проперти
>> * путь указать ```./src/test/resources/config/remoteBrowser.properties```
>> * добавить данные в файл, пример( ```src/test/resources/config/exampleRemoteBrowser.properties``` )
>2. Запустить тесты
>>```./gradlew clean runTestsUi -Dclient=remoteBrowser -Dtype=ui```
</details>


### Удаленный запуск тестов в Jenkins
<details>
<summary>Шаги запуска</summary>

>1. Создать файл с проперти в Jenkins
>> * путь указать ```./src/test/resources/config/remoteBrowser.properties```
>> * добавить данные в файл, пример( ```src/test/resources/config/exampleRemoteBrowser.properties``` )
>2. Создать файл с настройками для Telegram в Jenkins
>> * путь указать ```./notifications/telegram_config.json```
>> * добавить данные в файл, пример(```./notifications/example_telegram_config.json```)
>3. Запустить тесты
>>```
>>clean
>>runTestsUi
>>-Dclient=remoteBrowser
>>-Dtype=ui
>>-Dthreads=3
>>```
</details>
</details>



# Пример запуска тестов Jenkins и отчеты
## <img width="4%" title="Jenkins" src="images/logo/Jenkins.svg"> Главная страница сборки [Jenkins](https:https://jenkins.autotests.cloud/job/Club.Ratibor/)

<p align="center">
  <img src="images/screens/jenkins.png">
</p>

## <img width="4%" title="Allure Report" src="images/logo/Allure_Report.svg"> Отчет о результатах тестирования в Allure Report

### Главная страница Allure-отчета

<p align="center">
<img title="Allure Overview" src="images/screens/overview.png">
</p>

### Страница с тестами

<p align="center">
<img title="Allure Behaviors" src="images/screens/behaviors.png">
</p>

### Основной дашборд

<p align="center">
<img title="Allure Overview Dashboard" src="images/screens/dashboard.png">
</p>

## <img width="4%" title="Telegram" src="images/logo/Telegram.svg"> Уведомления в Telegram с использованием бота

> После прогона тестов бот, созданный в <code>Telegram</code>, автоматически обрабатывает и отправляет сообщение с отчетом в чат.
<p align="center">
<img title="Telegram Notifications" src="images/screens/notifications.png">
</p>

## <img width="4%" title="TestOps" src="images/logo/Allure_TO.svg"> Отчеты в TestOps

<p align="center">
<img title="Telegram Notifications" src="images/screens/testops.png">
<img title="Telegram Notifications" src="images/screens/cases.png">
</p>

## <img width="4%" title="TestOps" src="images/logo/jira.svg"> Интеграция с Jira

<p align="center">
<img title="Telegram Notifications" src="images/screens/jira.png">
</p>

## <img width="4%" title="Selenoid" src="images/logo/Selenoid.svg"> Пример запуска теста 

> К каждому тесту в отчете прилагается видео. Одно из таких видео представлено ниже.
<p align="center">
  <img title="Selenoid Video" src="images/gif/example_video.gif">
</p>