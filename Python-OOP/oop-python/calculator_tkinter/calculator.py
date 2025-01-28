from tkinter import ttk, Tk, END, Frame, Label

# Ideas / ToDos:
# - [ ] zwei Arrays/Lists für Buttons
#   - [ ] eins mit Ziffern
#   - [ ] eins mit Zeichen

def print_button(value):
    field_output.insert(END, value)

def close_window():
    root.destroy()

# Main Frame
root = Tk()
root.title("Calculator")
root.wm_geometry('400x400')

# Number Frame
number_frame = Frame(root)
number_frame.grid(row=0, column=0)

# Operator Frame
operator_frame = Frame(root)
operator_frame.grid(row=1, column=0)

# Result Frame
result_frame = Frame(root)
result_frame.grid(row=2, column=0)

# Close Button Frame
close_frame = Frame(root)
close_frame.grid(row=3, column=0)

buttons = []
row_count = 0
column_count = 0
for index, number in enumerate(range(10)):
    buttons.append(number)
    buttons[number] = ttk.Button(number_frame, text = number, command = lambda num=number: print_button(num))
    buttons[number].grid(row=row_count, column=column_count)
    column_count += 1
    if column_count % 3 == 0:
        row_count += 1
        column_count = 0

# Buttons
# close button
btn_close = ttk.Button(close_frame, text = "Close Window", command = close_window)
btn_close.grid(row=4, column=0)

# Text Fields
field_output = ttk.Entry(root)
field_output.insert(0, "")
field_output.place(x=0, y=200)

# Main Loop
root.mainloop()