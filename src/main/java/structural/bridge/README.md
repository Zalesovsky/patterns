    Shape (Фигура):
        Абстрактный класс, представляющий абстракцию, которая будет использовать реализацию.
        Содержит ссылку на объект типа DrawingAPI, через который делегирует реализацию специфическому классу реализации.
        Определяет абстрактный метод draw.

    Circle (Круг):
        Конкретная реализация абстракции Shape.
        Использует объект типа DrawingAPI для рисования круга с заданными координатами и радиусом.
        Реализует абстрактный метод draw, делегируя выполнение метода drawCircle объекта DrawingAPI.

    DrawingAPI (Интерфейс рисования):
        Интерфейс, который определяет методы для рисования различных фигур.
        Конкретные реализации этого интерфейса могут предоставлять разные способы рисования фигур (например, на различных устройствах или с использованием разных технологий).

    DrawingAPI1 и DrawingAPI2 (Конкретные реализации DrawingAPI):
        Реализации интерфейса DrawingAPI, предоставляющие конкретные способы рисования.
        Например, DrawingAPI1 может рисовать круг на одном устройстве или с одной технологией, а DrawingAPI2 — на другом.

Взаимосвязи:

    Shape использует объект типа DrawingAPI для реализации рисования круга.
    Circle реализует абстракцию Shape, используя объект DrawingAPI для выполнения конкретного метода drawCircle.
    DrawingAPI1 и DrawingAPI2 представляют различные способы реализации рисования.