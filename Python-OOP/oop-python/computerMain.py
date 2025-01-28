from computer import Computer
from laptop import Laptop

if __name__ == "__main__":

    # create new instance of Computer
    c = Computer("Dell", 98723984, 24, 32, 200)

    print("Computer wird gebaut...")
    c.sayHello()

    print()

    print(f"Computer anschalten")
    c.is_on = True
    c.sayHello()

    print()

    print(f"Computer ausschalten")
    c.is_on = False
    c.sayHello()

    print()
    print("-----------")
    print()

    # Wir initialisiern battery_level bewusst nicht und wollen,
    # dass der default 0 übernommen wird
    l = Laptop("ThinkPad",123123123, 12, 24, 500, 16)
    l.sayHello()
    l.is_on = True
    l.sayHello()
    l.charge(20)
    l.sayHello()
    l.charge(20)
    l.sayHello()