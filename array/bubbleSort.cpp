#include <bits/stdc++.h>

using namespace std;

void bubbleSort()
{
    int size = 10;

    int array[size] = {37, 34, 53, 16, 62, 13, 36, 47, 363, 364};

    for (int i = 0; i < size; i++)
    {
        for (int j = 0; j < size - i; j++)
        {
            if (array[j - 1] > array[j])
            {
                array[j - 1] = array[j - 1] + array[j];
                array[j] = array[j - 1] - array[j];
                array[j - 1] = array[j - 1] - array[j];
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

    bubbleSort();
    return 0;
}