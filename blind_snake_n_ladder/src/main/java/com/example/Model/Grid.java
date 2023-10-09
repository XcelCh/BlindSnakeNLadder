package com.example.Model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Grid {
    private Player[] players;
    private Snake snake;
    private Eagle eagle;
    private Ladder ladder;
}
