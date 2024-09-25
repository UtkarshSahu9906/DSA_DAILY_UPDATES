#include <iostream>
using namespace std;

void phythagrasTripletes()
{
    int x, y, z;
    int a, b, c;
    cin >> x;
    cin >> y;
    cin >> z;

    a = max(x, max(y, z));

    if (a == x)
    {
        cout << "x";
        b =y;
        c =z;
    }
    else if (a == y)
    {
        cout << "y";

        b = x;
        c = z;
        /* code */
    }
    else if (a == z)
    {

        cout << "z";
        b = x;
        c =y;
        /* code */
    }

    if (a * a == b * b + c * c)
    {
        cout << "its a triplets";
    }
    else
    {
        cout << "its not a triplets";
    }
}

int main()
{

    phythagrasTripletes();
    return 0;
}