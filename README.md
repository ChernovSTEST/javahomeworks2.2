# Домашнее задание к занятию "Примитивные типы данных и условные операторы"

## Цель задания

1. Написать свою первую программу
2. Попрактиковаться в использовании условных операторов - инструменте, который встречается почти в каждой прогрмме.

------

## Инструкция к заданию

1. Скачайте и установите профессиональный редактор кода [Intellij Idea Community Version](https://www.jetbrains.com/idea/download/)
1. Откройте IDEA и [создайте новый Java-проект](QA_Java_Idea_Create.md) (под каждую задачу следует создавать отдельный проект, если обратное не сказано в условии)
2. Создайте пустой репозиторий на GitHub и свяжите его с папкой вашего проекта (не с какой-либо другой папкой).
3. Правильно настройте репозиторий в плане `.gitignore`. Проигнорируйте папки `.idea` и `out` и `.iml`-файл - их в репозитории быть не должно.
4. Выполните в IDEA требуемую задачу согласно условию.
5. :new: Проверьте соблюдение [правил форматирования кода](QA_Java_Idea_Format.md)
6. Закоммитьте и отправьте в репозиторий содержимое папки проекта.

------

## Материалы, которые пригодятся для выполнения задания

1. [Как создать Java-проект в IDEA?](QA_Java_Idea_Create.md)
1. :new: [Как отформатировать код в Java?](QA_Java_Idea_Format.md)

------

## Задание 2 (обязательное)

В данной задаче мы считаем, что пользователь вводит корректные значения входных данных.

Один из сотовых операторов решил сделать своим клиентам приятный бонус: если клиент пополняет счёт более чем на 1000 рублей, то сотовый оператор дарит ему по 1 рублю за каждые полные 100 рублей пополнения.

Примеры. Начальные данные: у клиента на счету 100 рублей.
1. Клиент пополнил счёт на 300 рублей — бонусов нет, итоговая сумма на счету клиента — 400 рублей.
2. Клиент пополнил счёт на 1100 рублей — бонус равен 11 рублям, итоговая сумма на счету клиента — 1211 рублей.

Нужно создать приложение, выводящее итоговый счёт и количество бонусных рублей.
Количество денег на текущем счету клиента и сумму пополнения вы выбираете сами — создайте переменные, в которых эти данные будут храниться.

Приложение должно быть написано так, чтобы при замене значений переменных — начальной суммы счёта и суммы пополнения — итоговый счёт и бонусные рубли рассчитывались правильно.
