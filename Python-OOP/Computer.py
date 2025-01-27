class Computer:
    # Attribute: werden im Initializer (Konstruktor) bestimmt
    # number_cores 
    # model
    # asset_tag
    # ram
    # hd_size
    # is_on

    # Konstrkutor / Initializer
    # Dundor(?) Method
    def __init__(self, model, asset_tag, number_cores, ram_size, hd_size):
        self.model = model
        self.asset_tag = asset_tag
        self.number_cores = number_cores
        self.ram_size = ram_size
        self.hd_size = hd_size
        self.is_on = False  # neue Computer sind erstmal aus

    # Getter und Setter:
    # Gibt es so in Python nicht (mit diesem Namen) -> @property

    # "Getter"
    @property
    def number_cores(self):
        return self._number_cores

    # "Setter"
    @number_cores.setter
    def number_cores(self, value):
        self._number_cores = value


    @property
    def model(self):
        return self._model

    # "Setter"
    @model.setter
    def model(self, value):
        self._model = value


    @property
    def asset_tag(self):
        return self._asset_tag

    # "Setter"
    @asset_tag.setter
    def asset_tag(self, value):
        self._asset_tag = value


    @property
    def ram_size(self):
        return self._ram_size

    # "Setter"
    @ram_size.setter
    def ram_size(self, value):
        self._ram_size = value


    @property
    def hd_size(self):
        return self._hd_size

    # "Setter"
    @hd_size.setter
    def hd_size(self, value):
        self._hd_size = value

    @property
    def is_on(self):
        return self._is_on

    # "Setter"
    @is_on.setter
    def is_on(self, value):
        self._is_on = value

    def sayHello(self):
        if self.is_on:
            print(f"Hello, I'm your Computer. I'm a {self.model}, my Asset Tag is: {self.asset_tag}, I have amazing {self.number_cores} cores, {self.ram_size} GB of RAM and {self.hd_size} GB of Hard Disk Space.")
        else:
            print(f"BzzzzzZ")


#     Kindklasse(Elternklasse)
class Laptop(Computer):

    def __init__(self, model, asset_tag, number_cores, ram_size, hd_size, screen_size, battery_level):
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
