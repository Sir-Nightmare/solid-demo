# S.O.L.I.D. Principles Demo
- Principles ≠ Patterns

## SRP
_Single Responsibility Principle_
- Cohesion = сфокусированность

- Гибкость = легче изменять поведение
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


# На подумать
- Кто и как создает экземпляры (с учетом асинхронного создания)?
- Как избавиться в Logger от смешения _выбора логики_ и _самой логики_?
- (Logger -> Filter & Logger -> Appender) или (Logger -> Filter -> Appender)?