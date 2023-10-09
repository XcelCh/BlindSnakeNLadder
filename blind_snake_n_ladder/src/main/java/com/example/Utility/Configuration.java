package com.example.Utility;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Configuration {
    private int snakeNum;
    private int eagleNum;
    private int ladderNum;
    private int xAxis;
    private int yAxis;
    private int playerNum;
}
