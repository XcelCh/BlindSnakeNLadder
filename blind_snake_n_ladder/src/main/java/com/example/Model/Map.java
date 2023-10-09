package com.example.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Map {
    private int xAxis;
    private int yAxis;
    private Grid[][] grids;
}
