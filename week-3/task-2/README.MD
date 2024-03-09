## Запуск программы

### Maven

Для сборки проекта:

```sh
mvn clean compile assembly:single
```

Для запуска проекта:

```sh
java -jar .\target\task-2-v1-jar-with-dependencies.jar
```

## Задание
Разработайте и докажите корректность работы алгоритма простой скользящей средней (Simple Moving Average, SMA), Экспоненциальное скользящее среднее(Exponential moving average), медианного фильтра.