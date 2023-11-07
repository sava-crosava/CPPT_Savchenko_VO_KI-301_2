def main():
    SIZE = 0
    filler = ""

    # Введення розміру матриці
    print("Введіть розмір матриці: ", end="")
    SIZE = int(input())

    while SIZE < 12:
        # Перевірка на мінімальний розмір матриці
        print("Ви ввели надто малий розмір матриці. Спробуйте ще раз")
        SIZE = int(input())

    # Введення символу-заповнювача
    print("Введіть символ-заповнювач: ", end="")
    filler = input()

    while len(filler) != 1:
        # Перевірка на правильність введеного символу
        if len(filler) > 1:
            print("Можна вводити тільки один символ заповнювача. Спробуйте ще раз")
        filler = input()

    # Створення матриці та заповнення її символами
    arr = [[' ' for _ in range(SIZE)] for _ in range(SIZE)]

    for i in range(SIZE // 2):
        for j in range(SIZE // 2 - i):
            arr[i][j] = filler
            arr[i][SIZE - j - 1] = filler

    t = 1
    for i in range(SIZE // 2, SIZE):
        for j in range(t):
            arr[i][j] = filler
            arr[i][SIZE - j - 1] = filler
        t += 1

    # Виведення матриці на екран
    for i in range(SIZE):
        for j in range(SIZE):
            print(arr[i][j], end=" ")
        print()

if __name__ == "__main__":
    main()