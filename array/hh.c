#include <stdio.h>

int main() {
    int arr[5], i, m;

    // Input loop to get 5 integers
    for (i = 0; i < 5; i++) {
        scanf("%d", &arr[i]);  // Fix: Corrected scanf
    }

    // Finding the maximum element
    m = arr[0];  // Assume first element is the maximum
    for (i = 1; i < 5; i++) {  // Start from 1 since arr[0] is already considered
        if (arr[i] > m) {
            m = arr[i];
        }
    }
    printf("\nMaximum = %d", m);

    // Finding the minimum element
    m = arr[0];  // Assume first element is the minimum
    for (i = 1; i < 5; i++) {  // Start from 1 for similar reasons as above
        if (arr[i] < m) {
            m = arr[i];
        }
    }
    printf("\nMinimum = %d", m);

    return 0;
}
