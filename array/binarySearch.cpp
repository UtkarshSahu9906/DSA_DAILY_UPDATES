#include <bits/stdc++.h>

using namespace std;

int binarySearch()
{
    int size = 20;
    int key;
    cout<<"Enter your key"<<endl;
    cin >> key;
    int array[size] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
    int startPoint = 0;
    int endPoint = size - 1;

    while (startPoint <= endPoint)
    {

        int mid = (startPoint + endPoint) / 2;

        if (array[mid] == key)
        {
            return mid;
        }

        else if (array[mid] >key)
        {
            endPoint = mid-1;
        }
        else if (array[mid] <key)
        {
            startPoint = mid+1;
            /* code */
        }
    }
    return -1;
}

int main()
{

   cout<<binarySearch()<<" is your key's index"<<endl;
    return 0;
}