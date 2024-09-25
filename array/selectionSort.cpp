#include <bits/stdc++.h>

using namespace std;

void selectionSort()
{
    int size = 10;

    int array[size] = {44, 33, 26, 34, 64, 74, 74, 26, 27, 47};
    int endPoint = size - 1;

    for (int i = 0; i < size - 1; i++)
    {

        for (int j = i; j < size - 1; j++)
        {
            int min = array[i];
            if (array[j] < min)
            {
                min = array[j];
                array[i] = array[i] + array[j];
                array[j] = array[i] - array[j];
                array[i] = array[i] - array[j];
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

    selectionSort();
    return 0;
}