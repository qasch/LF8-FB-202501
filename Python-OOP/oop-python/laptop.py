from computer import Computer
# Java: class Laptop extends Computer {}
#     Kindklasse(Elternklasse)
class Laptop(Computer):

    # übergeben wir dem Initializer keinen Wert für battery_level, wird der default Wert 0 übernommen
    # Gleiches können wir mit allen Parametern, also auch in Funktionen/Methoden machen
    def __init__(self, model, asset_tag, number_cores, ram_size, hd_size, screen_size, battery_level = 0):  
        # Aufruf Initializer der Elternklasse Computer
        super().__init__(model, asset_tag, number_cores, ram_size, hd_size)
        self._screen_size = screen_size
        self._battery_level = battery_level

    def charge(self, value):
        self._battery_level += value

    def sayHello(self):
        if self.is_on:
            print(f"""
Hello, I'm your Laptop. I'm a {self.model}, my Asset Tag is: {self.asset_tag}, 
I have amazing {self.number_cores} cores, {self.ram_size} GB of RAM and {self.hd_size} GB 
of Hard Disk Space, my Screen Size is {self._screen_size} inches and my Battery Level is {self._battery_level}.
""")
        else:
            print(f"BzzzzzZ")