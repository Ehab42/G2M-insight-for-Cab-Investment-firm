#include <iostream>
using namespace std;

int main()
{
    float num1, num2;
    char operation;
    cout << "Bobbo's Calculator!!!!" << endl;
    cin >> num1 >> operation >> num2;

    switch (operation)
    {
    case '*':
        cout << "Result: " << num1 * num2 << endl;
        break;
    case '+':
        cout << "Result: " << num1 + num2 << endl;
        break;
    case '-':
        cout << "Result: " << num1 - num2 << endl;
        break;
    case '/':
        cout << "Result: " << num1 / num2 << endl;
        break;
    case '%':
        cout << "Result: " << int(num1) % int(num2) << endl;
        break;
    default:
        break;
    }
}