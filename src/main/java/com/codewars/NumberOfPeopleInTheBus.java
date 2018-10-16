package com.codewars;

import java.util.ArrayList;

public class NumberOfPeopleInTheBus {
    public int countPassengers(ArrayList<int[]> list) {
        int passengers = 0;
        for (int[] arr: list) {
            passengers += arr[0];
            passengers -= arr[1];
        }
        return passengers;
    }
}
