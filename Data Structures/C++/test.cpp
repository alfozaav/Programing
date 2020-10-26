#include <iostream>
#include <string>

using namespace std;

int sumIntergers(int);

// void isEven(int x) {
//     if (x % 2 == 0) {
//         cout << "Es par" << endl;
//     } else {
//         cout << "Es impar" << endl;
//     }
// } 


int main() {
    //  Sumar los primeors 100 enteros
    // int i = 1;
    // int sum = 0;

    // while (i <= 100) {
    //     sum = sum + i;
    //     i = i + 1;
    // }

    // cout << sum << endl;
    // isEven(5);
    sumIntergers(100);
    return 0;
}
//  4 6 8 10 12
int sumIntergers (int n) {
    int sum = 0; //1
    int n2 = 2; //1
    while (n2 <= n) { // n/2
        sum = sum + n2;
        n2 = n2 +2;
    }

    cout << sum << endl; 

    return sum;
}
//O(n/2)