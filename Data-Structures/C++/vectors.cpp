#include <iostream>
#include <vector>
#include <string>

using namespace std;
int main() {
    vector<string> names;

    names.push_back("alfonso");
    names.push_back("mario");
    names.push_back("luigi");

    cout << names.size() << "\n";

    return 0;
}