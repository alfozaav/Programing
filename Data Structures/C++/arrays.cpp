#include <iostream>

using namespace std;

int main() {
    //  Dado un arreglo de n enteros, encontrar el n menor y el m mayor

    // int data[] = {3, 4, 1, 2, 7, 3};
    int data[] = {4, 5, 3, 89, 7, 2};
    int min = data[0];
    int max = data[0];

    for (int i = 1; i < 6; i++) {
        if ( min > data[i] ) {
            min = data[i];
        } else {
            min = min;
        }
        if ( max < data[i] ) {
            max = data[i];
        } else {
            max = max;
        }
    }

    cout << min << endl;
    cout << max << endl;

    return 0;
}