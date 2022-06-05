package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Movie {
    private String id;
    private String imageUrl;
    private String name;
    private String ganre;
}
