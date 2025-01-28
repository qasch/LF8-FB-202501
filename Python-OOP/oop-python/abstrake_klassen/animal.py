from abc import ABC, abstractmethod
# abstrake Klasse
class Animal(ABC):

    @abstractmethod
    def make_sound(self):
        pass