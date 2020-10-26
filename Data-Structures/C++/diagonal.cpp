#include <iostream>

using namespace std;

int main() {
    int numbers[3][4] = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
    int arrSize = sizeof(numbers)/sizeof(numbers[0]);

    for (int i = 0; i < arrSize; i++) {
        int j = i;

        cout << numbers[i][j] << endl;
    }

    return 0;
}

//  Pasar arreglos como parametros en una funcion