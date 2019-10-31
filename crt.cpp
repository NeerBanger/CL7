#include<bits/stdc++.h>
using namespace std;

int findMinX(int num[], int rem[], int k)
{
    int x = 1; // Initialize result

    while (true)
    {
        // Check if remainder of x % num[j] is
        // rem[j] or not (for all j from 0 to k-1)
        int j;
        for (j=0; j<k; j++ )
            if (x%num[j] != rem[j])
               break;

        // If all remainders matched, we found x
        if (j == k)
            return x;

        // Else try next numner
        x++;
    }

    return x;
}

int main(void)
{
    int num[] = {3, 5, 7};
    int rem[] = {2, 3, 2};
    int k = sizeof(num)/sizeof(num[0]);
    cout << "x is " << findMinX(num, rem, k)<<" \n";
    return 0;
}