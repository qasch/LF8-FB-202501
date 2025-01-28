from animal import Animal

class Dog(Animal):
    def make_sound(self) -> None:
        print("Wuff Wuff")

    def __str__(self) -> str:
        return f"makes Wuff Wuff"