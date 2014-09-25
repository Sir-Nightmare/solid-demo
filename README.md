# S.O.L.I.D. Principles Demo
- Principles ≠ Patterns
## SRP
_Single Responsibility Principle_
- Cohesion = сфокусированность
- _Изменчивость_ = легче изменять поведение
- Локализовали и спрятали изменчивость
- Легче тестировать
- Reuse
- Усложение дизайна

## OCP
_Open-Closed Principle_
- Дизайн должен быть закрытым для изменеий, но открытым для расширения и реюза
- Полиморфный алгоритм
- set/get

## LSP
_Liskov Substitution Principle_
- По сути, про полиморфизм дизайна
- Подставить наследника вместо базового класса, при этом ничего не ломается
- Наследник не должен нарушать контракт базового класса

## ISP
_Interface Segregation Principle_
- Сфокусированные интерфейсы

## DIP
_Dependency Inversion Principle_
- Сделать _полиморфный_ дизайн
- Повышаем _расширяемость_

# OOAD
Объектный стиль – это:

## Прячем _изменчивость_ в выделенные классы
- SRP

## Накрываем классы абстракцией для _расширяемости_
- DIP
- ISP

## Пишем _полиморфные_ алгоритмы
- OCP
- LSP

## Проблемы строгой системы типов в OOAD
- Протечка абстракции
### Что делать
- Вынести детали поведение/стейт -> в реализации. Но есть проблема параллельной иерархии классов
- Контекст (больше про стейт): обобщенный параметр в полиморфные обработчики, ThreadLocal
- Функцию параметризуем другой ф-ей: ф-я высшых парядков

# На подумать
- Какие проблемы с интерфейсом Filter появятся при дальнейшем расширении функционала фильтров?
- Кто и как создает экземпляры (с учетом асинхронного создания)?
- Как избавиться в Logger от смешения _выбора логики_ и _самой логики_? То есть как распилить switch на ветвлению и логику?
- (Logger -> Filter & Logger -> Appender) или (Logger -> Filter -> Appender)?


# GRASP + TDA
- Пример для live coding: logger

## General Responsibility Assignment Software Patterns
[GRASP Mindmap](https://dl.dropboxusercontent.com/u/3141158/GRASP_patterns.jpeg)
### Information Expert
- _Инкапсуляция ответственности_, не путать с hiding
- Суть ООП
### Creator
- vs Factory
- vs DI
- Factory vs DI
### Controller
- Pure fabrication
- Может быть частью других шаблонов: MVC
- Façade, Biulder, Mediator
### Low coupling & High cohesion
- cohesion: сфокусировнность, сцепленность
- Какие атрибуты качества системы получаем?
- Чем платим?
### Polymorphism
- Тот самый полиморфный дизайн
- Какие принципы SOLID?
### Protected Variations
- Какой принцип SOLID? = DIP
- Polymorphism + PV = Abstr.Factory и Strategy [GoF]
### Pure fabrication
- Pure domain model + Pure fabrication (PoEAA, DDD)
- Controller, Manager, etc
### Indirection
- Adapter, Facade, Proxy, Decorator [GoF]

## Tell Don't Ask
- Procedure vs OOD