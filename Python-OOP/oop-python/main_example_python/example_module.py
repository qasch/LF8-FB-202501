def greet():
    print(f"Hello from Module example_module.py")
    print(f"I am doing nothing fancy. But I am a module!")

def debug_output():
    print(f"This is some debug output")

if __name__ == "__main__":
    greet()
    debug_output()
    print("I am run directly, not as a module")