def generate_pattern_matrix(n_rows, filler):
    try:
        # Check if only one filler character is entered
        if len(filler) != 1:
            raise ValueError("Please enter only one filler character.")

        arr = []  # Create an empty list for the matrix

        # Fill the jagged list with the specified pattern
        for i in range(n_rows):
            stars = filler * (2 * i + 1)
            arr.append(stars)

       

    except ValueError as e:
        print(f"Error: {e}")
        arr = None
    return arr  # Return None if there's an error


def display_pattern_matrix(matrix):
    if matrix is not None:
        for row in matrix:
            # Format each row for display in console
            print(row.center(len(matrix[-1])))


if __name__ == "__main__":
    try:
        # Accept input from the user for matrix size and filler character
        n_rows = int(input("Enter the size of the square matrix: "))
        filler = input("Enter the filler character: ")

        # Generate the pattern matrix based on user input
        pattern_matrix = generate_pattern_matrix(n_rows, filler)

        # Display the generated matrix in the console
        print("Generated Pattern Matrix:")
        display_pattern_matrix(pattern_matrix)

        # Write the generated matrix to a file
        if pattern_matrix is not None:
            with open('Lab7.txt', 'w') as file:
                for row in pattern_matrix:
                    file.write(row.center(len(pattern_matrix[-1])) + '\n')
            print("Results saved in the Lab7.txt file")

    except ValueError:
        print("Invalid input. Please enter an integer for the matrix size.")
    except KeyboardInterrupt:
        print("\nProgram interrupted by the user.")
