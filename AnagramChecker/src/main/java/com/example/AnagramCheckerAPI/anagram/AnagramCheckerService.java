package com.example.AnagramCheckerAPI.anagram;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class AnagramCheckerService {
    public boolean check(String word1, String word2){
        boolean anagram = true;
        if (word1.equals("") || word2.equals("")) {
            anagram = false;
        }
        else if (word1.length() != word2.length()) {
            anagram = false;
        } else {
            word1 = word1.toLowerCase();
            word2 = word2.toLowerCase();
            char[] wl1 = new char[word1.length()];
            char[] wl2 = new char[word2.length()];
            for (int i = 0; i < word1.length(); i++) wl1[i] = word1.charAt(i);
            for (int i = 0; i < word2.length(); i++) wl2[i] = word2.charAt(i);
            mergesort(wl1, new char[wl1.length], 0, wl1.length - 1);
            mergesort(wl2, new char[wl2.length], 0, wl2.length - 1);
            for (int i = 0; i < wl1.length; i++) {
                if (wl1[i] != wl2[i]) {
                    anagram = false;
                    break;
                }
            }
        }

        return anagram;
    }

    static void mergesort(char[] A, char[] temp, int l, int r) {
        int mid = (l+r)/2; // Select midpoint
        if (l == r) return; // List has one element
        mergesort(A, temp, l, mid); // Mergesort first half
        mergesort(A, temp, mid+1, r); // Mergesort second half
        for (int i=l; i<=r; i++) // Copy subarray to temp
            temp[i] = A[i];
        // Do the merge operation back to A
        int i1 = l; int i2 = mid + 1;
        for (int curr=l; curr<=r; curr++) {
            if (i1 == mid+1) // Left sublist exhausted
                A[curr] = temp[i2++];
            else if (i2 > r) // Right sublist exhausted
                A[curr] = temp[i1++];
            else if (temp[i1]<temp[i2]) // Get smaller
                A[curr] = temp[i1++];
            else A[curr] = temp[i2++];
        }
    }
}
