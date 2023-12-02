import math
import struct

def calculate_y(x):
    try:
        y = math.cos(x) / math.sin(x)
        return y
    except ZeroDivisionError:
        return float('inf')  # if sin(x) = 0, store "infinity"

def save_to_text_file(y):
    with open('result_text.txt', 'w') as file:
        file.write(f'Result: {y}')

def save_to_binary_file(y):
    with open('result_binary.bin', 'wb') as file:
        file.write(struct.pack('b', y))  # Write as a double to the binary file

def main():
    x = float(input("Enter the value of x: "))
    y = calculate_y(x)
    print(f"Result: {y}")

    save_to_text_file(y)
    save_to_binary_file(y)

if __name__ == "__main__":
    main()
