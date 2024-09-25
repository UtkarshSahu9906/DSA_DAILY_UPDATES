#include <bits/stdc++.h>

using namespace std;

void insertionSort()
{
    int size = 10;

    int array[size] = {44, 33, 26, 34, 64, 74, 74, 26, 27, 47};

    for (int i = 1; i < size - 1; i++)
    {
        int temp = array[i];

        for (int j = i; j >=0; j--)
        {
            if (array[j] >temp)
            {
            array[j + 1] = array[j];
                array[j] = temp;
            }
            
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

    insertionSort();
    return 0;
}