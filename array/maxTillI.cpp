#include <bits/stdc++.h>

using namespace std;

void maxTillI()
{
    int size = 10;

    int array[size] = {44, 33, 26, 34, 64, 74, 74, 26, 27, 47};

    for (int i = 1; i < size - 1; i++)
    {
        int temp = array[i - 1];
        if (temp > array[i])
        {
            array[i] = temp;
        }
    }
    cout << "{";

    for (int k = 0; k < size - 1; k++)
    {
        cout << array[k] << ",";
    }
    cout << "}" << endl;
}

int main()
{

    maxTillI();
    return 0;
}